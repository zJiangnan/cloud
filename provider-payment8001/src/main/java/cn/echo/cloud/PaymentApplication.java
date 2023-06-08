package cn.echo.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 主启动类
 * <p></p>
 *
 * @author Unicorn Pink
 * @version 1.0
 * @createdate 2023/6/6
 * @see PaymentApplication
 **/
@SpringBootApplication
@MapperScan("cn.echo.cloud.mapper")
public class PaymentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }
}
