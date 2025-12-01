package com.mentoria.AeroData.API.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "AeroData API",
                version = "1.0",
                description = "Documentação da API"
        )
)
public class SwaggerConfig {
}
