package com.hbb.demo.service2.controller;

import com.hbb.demo.feign.Service1FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "service2")
public class ServiceController {
    @Autowired
    Service1FeignClient service1FeignClient;

    @RequestMapping(value = "f1")
    @ResponseBody
    public Map<String, String> service1Fun1() {
        Map map = new HashMap();
        map.put("id", "serivice2");
        String value = service1FeignClient.service1Fun1().get("id");
        map.put("id", value);
        return map;
    }
}
