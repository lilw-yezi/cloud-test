package com.yz.cloud.cloudtest1.service.impl;

import com.yz.cloud.cloudtest1.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class TestServiceImpl implements TestService {

    @Value("${test.testname}")
    String value1;

    @Override
    public String getTestString(String str) {
        return "request is ok, request param is "+str;
    }

    @Override
    public String testConfig(String str) {
        System.out.println(value1);
        return value1;
    }
}
