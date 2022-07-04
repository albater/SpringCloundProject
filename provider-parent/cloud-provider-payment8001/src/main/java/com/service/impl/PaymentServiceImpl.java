package com.service.impl;

import com.entity.Payment;
import com.mapper.PaymentMapper;
import com.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author alpha
 * @className: PaymentServiceImpl
 * @date 2022/7/4 11:03
 * @Description
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.getPaymentById(id);
    }
}
