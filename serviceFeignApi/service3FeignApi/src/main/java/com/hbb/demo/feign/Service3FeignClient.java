package com.hbb.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Hello world!
 *
 */
@FeignClient(name = "service3")
public interface Service3FeignClient
{
    @RequestMapping(value = "/service3/f1", method = RequestMethod.GET)
    Map<String, String> service1Fun1();
}
