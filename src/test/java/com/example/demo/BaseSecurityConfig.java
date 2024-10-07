package com.example.demo;

import lombok.Getter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Getter
@Configuration
@EnableWebSecurity
@Import({GlobalExceptionHandler.class})
public class BaseSecurityConfig extends SecurityConfig {
}
