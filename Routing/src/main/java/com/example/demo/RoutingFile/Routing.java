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
                .uri("http://localhost:4001")) 
            .route("FilterCriteriaService", r -> r.path("/registration/**")
                .uri("http://localhost:4002")) 
            .route("FilterCriteriaService", r -> r.path("/filtercriteria/**")
                .uri("http://localhost:4003")) 
            .route("FilterCriteriaService", r -> r.path("/carinformation/**")
                .uri("http://localhost:4004")) 
            .build();
    }
}