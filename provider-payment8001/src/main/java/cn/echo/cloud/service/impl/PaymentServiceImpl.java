package cn.echo.cloud.service.impl;

import cn.echo.cloud.mapper.PaymentMapper;
import cn.echo.cloud.entity.Payment;
import cn.echo.cloud.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 付款业务实现
 * <p></p>
 *
 * @author Unicorn Pink
 * @version 1.0
 * @createdate 2023/6/8
 * @see PaymentServiceImpl
 **/
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentByid(Long id) {
        return paymentMapper.getPaymentByid(id);
    }

    @Override
    public List<Payment> queryList() {
        return paymentMapper.queryList();
    }

}
