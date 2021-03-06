package com.hbb.demo.common.feign;

import com.hbb.demo.common.feign.endpoint.FeignClientEndpoint;
import feign.Feign;
import org.springframework.boot.actuate.autoconfigure.endpoint.condition.ConditionalOnAvailableEndpoint;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.openfeign.CusFeignClientsRegistrar;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author Bingbing.Huang
 * @Date 2021/3/16
 * @Description: feign 自动化配置
 */

@Configuration
@ConditionalOnClass(Feign.class)
@Import(CusFeignClientsRegistrar.class)
@AutoConfigureAfter(EnableFeignClients.class)
public class FeignAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnAvailableEndpoint
    public FeignClientEndpoint feignClientEndpoint(ApplicationContext context) {
        return new FeignClientEndpoint(context);
    }

}
