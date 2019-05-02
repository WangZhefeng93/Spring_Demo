package com.ccff.spring.concept.service;

import com.ccff.spring.concept.dao.IProductDao;
import com.ccff.spring.concept.dao.IPurchaseRecordDao;
import com.ccff.spring.concept.datasource.DataConnection;
import com.ccff.spring.concept.model.Product;
import com.ccff.spring.concept.model.PurchaseRecord;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class DealServiceImpl implements IDealService {
    private SqlSession sqlSession;

    @Override
    public void savePurchaseRecord(int productId, PurchaseRecord record) {
        DataConnection dataConnection = new DataConnection();
        try {
            sqlSession = dataConnection.getSqlSession();
            IProductDao productDao = sqlSession.getMapper(IProductDao.class);
            Product product = productDao.getProduct(productId);
            //判断库存是否大于购买量
            if (product.getProductStock() >= record.getQuantity()){
                //减库存
                product.setProductStock(product.getProductStock()-record.getQuantity());
                //更新数据库中的库存
                productDao.updateProduct(product);
                //保存交易记录
                IPurchaseRecordDao purchaseRecordDao = sqlSession.getMapper(IPurchaseRecordDao.class);
                purchaseRecordDao.addPurchaseRecord(record);
                System.out.println("库存大于购买量,购买记录【"+record.getRecordId()+"】购买成功！");
                sqlSession.commit();
            }
        } catch (IOException e) {
            //发生异常，回滚事务
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            //关闭资源
            if (sqlSession != null)
                sqlSession.close();
        }
    }
}
