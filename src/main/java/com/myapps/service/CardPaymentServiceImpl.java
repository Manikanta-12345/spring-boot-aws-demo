package com.myapps.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CardPaymentServiceImpl implements PaymentService {

    public String pay(){
        return "CARD PAYMENT DONE!";
    }
}
