package com.example.demo.RoutingFile;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Routing {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("LoginService", r -> r.path("/login/**")
                .uri("http://localhost:8081/login/get-login-details")) // Route requests starting with /service1/** to service at port 8081
            .route("FilterCriteriaService", r -> r.path("/filtercriteria/**")
                .uri("http://localhost:8082")) // Route requests starting with /service2/** to service at port 8082
            .build();
    }
}