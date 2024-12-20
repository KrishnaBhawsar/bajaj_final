package org.example.bfhlapplication.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://bajaj-vercel-1-git-main-krishna-bhawsars-projects.vercel.app")  // Allow React frontend
                .allowedMethods("GET", "POST");
    }
}
