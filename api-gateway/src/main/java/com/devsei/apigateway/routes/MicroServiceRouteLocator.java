package com.devsei.apigateway.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MicroServiceRouteLocator {
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("micro-service", r -> r.path("/micro-service/**")
                        .uri("lb://MICRO-SERVICE"))
                .route("other-service", r -> r.path("/other-service/**")
                        .uri("lb://OTHER_SERVICE"))
                .build();
    }
}
