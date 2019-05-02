package com.ccff.spring.concept.dao;

import com.ccff.spring.concept.model.PurchaseRecord;

public interface IPurchaseRecordDao {
    //根据购买记录id获取购买该产品的数量
    PurchaseRecord getPurchaseRecord(int recordId);

    //添加购买该产品的数量
    int addPurchaseRecord(PurchaseRecord record);
}
