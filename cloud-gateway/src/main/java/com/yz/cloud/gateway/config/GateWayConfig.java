package com.yz.cloud.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Lliw
 * @Date: 2022/10/31
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator nacosTest2Role(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("nacos-test2-role",
                r -> r.path("/api/test2/**").uri("lb://nacos-test2")).build();
        // path 路由到某一个地址 http:(传统http路由) lb:(注册中心微服务路由)
//        r -> r.path("/api/test2/**").and().method("GET").uri("lb://nacos-test2")
        return routes.build();
    }

}
