package cn.echo.cloud.controller;

import cn.echo.cloud.entity.Payment;
import cn.echo.cloud.common.Result;
import cn.echo.cloud.service.PaymentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 付款控制器
 * <p></p>
 *
 * @author Unicorn Pink
 * @version 1.0
 * @createdate 2023/6/8
 * @see PaymentController
 **/
@RestController
@RequestMapping("/payment")
@AllArgsConstructor
@Slf4j
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/create")
    public Result<String> create(Payment payment) {
        int i = paymentService.create(payment);
        log.info("插入结果：{}", i);
        if (i > 0) {
            return Result.ok("成功");
        } else {
            return Result.error("失败");
        }
    }

    @GetMapping("/get/{id}")
    public Result<Payment> getById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentByid(id);
        log.info("插入结果：{}", payment.toString());
        return new Result<Payment>(200, "成功", payment);
    }

}
