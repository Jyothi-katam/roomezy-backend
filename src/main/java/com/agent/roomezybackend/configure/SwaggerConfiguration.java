package com.agent.roomezybackend.configure;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfiguration
{
//    @Bean
//    public OpenAPI defineOpenApi()
//    {
//        Server server = new Server();
//        server.setUrl("http://localhost:8080");
//        server.setDescription("Development");
//
//        Contact myContact = new Contact();
//        myContact.setName("Admin");
//        myContact.setEmail("roomezy@gmail.com");
//
//        Info information = new Info()
//                .title("Roomezy Backend API")
//                .version("1.0")
//                .description("This API exposes endpoints to manage Hostel Rooms")
//                .contact(myContact);
//        return new OpenAPI().info(information).servers(List.of(server));
//    }
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Roomezy BackendAPI")
                        .version("1.0")
                        .description("API documentation for Roomezy platform"))
                .addSecurityItem(new SecurityRequirement().addList("BearerAuth"))
                .components(new io.swagger.v3.oas.models.Components()
                        .addSecuritySchemes("BearerAuth", new SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")));
    }
}