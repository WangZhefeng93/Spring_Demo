package com.ccff.spring.concept.service;

import com.ccff.spring.concept.model.PurchaseRecord;

public interface IDealService {
    void savePurchaseRecord(int productId,PurchaseRecord record);
}
