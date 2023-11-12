package com.example.demo.RoutingFile;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;

@Configuration
public class Routing {

    @Value("${APIKEY}")
    private String apiKey;

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
            .route("LoginService", r -> r.path("/login/**")
                .filters(f -> f.addRequestHeader("X-API-KEY", "apiKey"))
                .uri("http://localhost:4001"))
            .route("RegistrationService", r -> r.path("/registration/**")
                .filters(f -> f.addRequestHeader("X-API-KEY", "apiKey"))
                .uri("http://localhost:4002"))
            .route("FilterCriteriaService", r -> r.path("/filtercriteria/**")
                .filters(f -> f.addRequestHeader("X-API-KEY", "apiKey"))
                .uri("http://localhost:4003"))
            .route("CarInformationService", r -> r.path("/carinformation/**")
                .filters(f -> f.addRequestHeader("X-API-KEY", "apiKey"))
                .uri("http://localhost:4004"))
            .build();
    }
}