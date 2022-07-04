package com.mapper;

import com.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @author alpha
 * @className: PaymentMapper
 * @date 2022/7/4 10:57
 * @Description
 */
@Mapper
@Component
public interface PaymentMapper {
     int create(Payment payment);
     Payment getPaymentById(@Param("id") Long id);
}
