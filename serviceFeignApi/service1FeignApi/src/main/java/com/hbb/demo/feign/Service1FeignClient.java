package com.hbb.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(contextId = "service1FeignClient", value="service1")
public interface Service1FeignClient {
    @RequestMapping(value = "/service1/f1", method = RequestMethod.GET)
    Map<String, String> service1Fun1();
}
