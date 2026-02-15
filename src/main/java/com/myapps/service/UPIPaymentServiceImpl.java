package com.myapps.service;

import org.springframework.stereotype.Service;

@Service("upiPaymentServiceImpl")
public class UPIPaymentServiceImpl implements PaymentService{

    @Override
    public String pay() {
        return "UPI PAYMENT DONE!";
    }
}
