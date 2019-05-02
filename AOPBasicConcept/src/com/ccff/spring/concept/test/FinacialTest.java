package com.ccff.spring.concept.test;

import com.ccff.spring.concept.model.PurchaseRecord;
import com.ccff.spring.concept.service.DealServiceImpl;
import com.ccff.spring.concept.service.IDealService;
import org.junit.Test;

public class FinacialTest {
    @Test
    public void test(){
        PurchaseRecord record1 = new PurchaseRecord(1,1,50);
        PurchaseRecord record2 = new PurchaseRecord(2,2,200);
        PurchaseRecord record3 = new PurchaseRecord(3,3,350);

        IDealService dealService = new DealServiceImpl();
        dealService.savePurchaseRecord(1,record1);
        dealService.savePurchaseRecord(2,record2);
        dealService.savePurchaseRecord(3,record3);
    }
}
