package com.vimalesh.config;

import com.vimalesh.controller.AppController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;

@Configuration
@EnableWebFlux
public class WebFluxConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppController.class);

}
