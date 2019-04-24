package com.vimalesh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class AppController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppController.class);

    @RequestMapping(value = "/data", method = RequestMethod.GET)
    public Mono<ResponseEntity<String>> test() {
        LOGGER.info("hi");
        return Mono.just(new ResponseEntity<>("hi from app1", HttpStatus.OK));
    }

}
