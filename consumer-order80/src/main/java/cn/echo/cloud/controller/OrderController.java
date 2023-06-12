package cn.echo.cloud.controller;

import cn.echo.cloud.common.Result;
import cn.echo.cloud.entity.Payment;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * 订单接口访问
 * <p></p>
 *
 * @author Unicorn Pink
 * @version 1.0
 * @createdate 2023/6/12
 * @see OrderController
 **/
@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class OrderController {

    private static final String PAYMENT_URL = "http://localhost:8001";

    private final RestTemplate rest;

    @PostMapping("/payment")
    public Result create(Payment payment) {
        return rest.postForObject(PAYMENT_URL + "/payment/create", payment, Result.class);
    }

    @GetMapping("/get/{id}")
    public Result getPayment(@PathVariable("id") Long id) {
        return rest.getForObject(PAYMENT_URL + "/payment/get/" + id, Result.class);
    }

}
