package com.sales.cycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = "com.sales.cycle")
public class SalesCycleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesCycleApplication.class, args);
	}
	
	@Bean
	public Docket defineSwagger(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("com.sales.cycle"))
                    .build()
                .apiInfo(apiInfo());
    }
	

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Sales Cycle API")
            .description("Sales Cycle ")
            .license("")
            .licenseUrl("")
            .termsOfServiceUrl("")
            .version("")
            .contact(new Contact("","", ""))
            .build();
    }

}
