package com.suleyman.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.any;

@SpringBootApplication
@EnableSwagger2
@EnableDiscoveryClient
public class CarServicesApplication {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("Customer").select()
                .apis(RequestHandlerSelectors.basePackage("com.suleyman.services.customer"))
                .paths(any()).build().apiInfo(ApiInfo.DEFAULT);
    }

    public static void main(String[] args) {
        SpringApplication.run(CarServicesApplication.class, args);
    }
}
