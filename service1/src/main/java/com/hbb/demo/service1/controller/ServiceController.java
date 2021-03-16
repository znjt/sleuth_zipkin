package com.hbb.demo.service1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "service1")
public class ServiceController {


    @RequestMapping(value = "f1", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> service1Fun1() {
        Map map = new HashMap();
        map.put("id", "service1");
        return map;
    }
}
