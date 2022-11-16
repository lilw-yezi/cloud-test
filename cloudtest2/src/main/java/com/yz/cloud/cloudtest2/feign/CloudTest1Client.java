package com.yz.cloud.cloudtest2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient("nacostest1")
public interface CloudTest1Client {

    @PostMapping("/cloud-nacos-test1/return-string")
    String getString(String str);
}
