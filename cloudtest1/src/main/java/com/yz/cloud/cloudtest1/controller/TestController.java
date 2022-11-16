package com.yz.cloud.cloudtest1.controller;

import com.yz.cloud.cloudtest1.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloud-nacos-test1")
public class TestController {

    @Autowired
    TestService testService;

    @PostMapping("/return-string")
    public String getTestString(@RequestBody String testString) {
        return testService.getTestString(testString);
    }

    @PostMapping("/test-config")
    public String getConfig(@RequestBody String testString) {
        return testService.testConfig(testString);
    }


}
