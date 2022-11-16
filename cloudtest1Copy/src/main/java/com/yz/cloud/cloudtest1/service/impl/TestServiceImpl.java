package com.yz.cloud.cloudtest1.service.impl;

import com.yz.cloud.cloudtest1.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String getTestString(String str) {
        return "(copy)request is ok, request param is "+str;
    }
}
