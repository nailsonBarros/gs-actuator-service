package com.example.actuatorservice.swagger;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfiguration {
	public Docket compassoApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select().apis(RequestHandlerSelectors
				.basePackage("com.example.actuatorservice"))
				.paths(PathSelectors.ant("/**"))
				.build();
	}
}
