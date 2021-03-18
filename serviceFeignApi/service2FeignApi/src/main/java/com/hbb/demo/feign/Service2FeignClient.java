package com.hbb.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Hello world!
 *
 */
@FeignClient(name = "service2")
public interface Service2FeignClient
{
    @RequestMapping(value = "/service2/f1", method = RequestMethod.GET)
    Map<String, String> service1Fun1();
}
