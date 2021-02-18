package com.eai.util;

import java.util.ArrayList;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	public Docket documentation() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.paths(PathSelectors.regex("/api.*"))
				.build()
				.apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Cadastro de Endereços", 
				"Api Res de cadastro de Endereços", 
				"1.0", 
				"Terms of Service", 
				new Contact("Jorge Sevilla", "https://github.com/JorgeSevilla", "jorge.garcia@compasso.com.br"), 
				"Apache Lincense Version 2.0", 
				"", new ArrayList<VendorExtension>());
		return apiInfo;
	}
}
