package com.superMarket.mart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
//@EnableSwagger2
public class MartApplication {

	public static void main(String[] args) {
		System.out.println("----------before start application----------");
		SpringApplication.run(MartApplication.class, args);
		System.out.println("----------after start application----------");
	}
	/*
	 * @Bean public Docket productApi() { return new
	 * Docket(DocumentationType.SWAGGER_2).select()
	 * .apis(RequestHandlerSelectors.basePackage("com.superMarket.mart")).build(); }
	 */

}
/*
 * 
 * 1. all dependency jars will download based spring boot version 2. inbuilt
 * server 3. create all dependency objects 4. added actuator
 */
