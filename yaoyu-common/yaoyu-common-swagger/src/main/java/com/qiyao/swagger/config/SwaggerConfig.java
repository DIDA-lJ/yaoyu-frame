package com.qiyao.swagger.config;

import com.qiyao.swagger.bean.SwaggerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName SwaggerConfig
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/20
 */
@Configuration
@EnableSwagger2
@EnableOpenApi
public class SwaggerConfig {
    @Autowired
    private SwaggerInfo swaggerInfo;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(swaggerInfo.getBasePackage()))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * swagger API 信息配置
     * @return API 信息
     */
    public ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(swaggerInfo.getTitle())
                .contact(new Contact(swaggerInfo.getContactName(), swaggerInfo.getContactUrl(),
                        swaggerInfo.getEmail()))
                .version(swaggerInfo.getVersion())
                .description(swaggerInfo.getDescription())
                .build();
    }
}
