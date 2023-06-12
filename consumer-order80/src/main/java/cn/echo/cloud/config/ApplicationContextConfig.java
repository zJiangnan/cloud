package cn.echo.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 程序配置
 * <p></p>
 *
 * @author Unicorn Pink
 * @version 1.0
 * @createdate 2023/6/12
 * @see ApplicationContextConfig
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
