package com.ccff.spring.concept.dao;

import com.ccff.spring.concept.model.Product;

public interface IProductDao {
    //根据产品id获取该产品
    Product getProduct(int productId);

    //更新该产品
    void updateProduct(Product product);
}
