package cn.echo.cloud.service;

import cn.echo.cloud.entity.Payment;

import java.util.List;


public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentByid(Long id);

    List<Payment> queryList();

}
