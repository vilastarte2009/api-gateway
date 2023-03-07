package com.vilas.ApiGateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration 
{
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder)
	{

		return builder.routes()
				.route(p->p.path("/get").filters(f->f.addRequestHeader("h1","Header Value")).uri("http://httpbin.org"))
				.build();
	}

}
