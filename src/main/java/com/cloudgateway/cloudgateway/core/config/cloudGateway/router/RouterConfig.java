package com.cloudgateway.cloudgateway.core.config.cloudGateway.router;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouterConfig {
    @Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder.routes()
		.route("auth", r -> r.path("/v1/auth/**")
				.uri("lb://nova-core"))
		.route("fornecedor", r -> r.path("/v1/fornecedor/**")
			.uri("lb://nova-core"))
		.route("cliente", r -> r.path("/v1/cliente/**")
			.uri("lb://nova-core"))
		.route("pedido", r -> r.path("/v1/pedido/**")
			.uri("lb://nova-core"))
		.route("cupom", r -> r.path("/v1/cupom/**")
			.uri("lb://nova-core"))
		.route("midia", r -> r.path("/v1/midia/**")
			.uri("lb://nova-core"))
		.route("preco", r -> r.path("/v1/preco/**")
			.uri("lb://nova-core"))
		.route("produto", r -> r.path("/v1/produto/**")
			.uri("lb://nova-core"))
		.route("contato", r -> r.path("/v1/contato/**")
			.uri("lb://nova-core"))
		.route("checkout", r -> r.path("/v1/checkout/**")
			.uri("lb://nova-core"))
		.route("admin", r -> r.path("/v1/admin/**")
			.uri("lb://nova-core"))
		.route("mensageria", r -> r.path("/v1/email/**")
			.uri("lb://nova-messaging"))
		.route("transacao", r -> r.path("/v1/transacao/**")
			.uri("lb://nova-gateway"))
		.build();
	}
}
