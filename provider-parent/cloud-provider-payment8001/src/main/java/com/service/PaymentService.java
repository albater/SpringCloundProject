package com.service;

import com.entity.Payment;

/**
 * @author alpha
 * @className: PaymentService
 * @date 2022/7/4 11:02
 * @Description
 */
public interface PaymentService {
     int create(Payment payment); //写
     Payment getPaymentById(Long id);  //读取
}
