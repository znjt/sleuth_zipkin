package com.hbb.demo.service1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "service1")
@RefreshScope
public class ServiceController {

    @Value("${hbb.threshold}")
    public String threshold;

    @RequestMapping(value = "f1",method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> service1Fun1() {
        Map map = new HashMap();
        map.put("id", "service1");
        return map;
    }

    @RequestMapping(value = "f2",method = RequestMethod.GET)
    @ResponseBody
    public String service1Fun2() {
        return threshold;
    }


}
