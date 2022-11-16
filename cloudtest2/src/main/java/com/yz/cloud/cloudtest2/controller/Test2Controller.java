package com.yz.cloud.cloudtest2.controller;

import com.yz.cloud.cloudtest2.feign.CloudTest1Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test2")
public class Test2Controller {
    @Autowired
    CloudTest1Client cloudTest1Client;

    @GetMapping("/str-test")
    public String test(@RequestParam String str){
//        return str;
        return cloudTest1Client.getString(str);
    }
}
