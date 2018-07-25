package com.vimalesh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class AppController {

	private static Logger log = LoggerFactory.getLogger(AppController.class);

	@RequestMapping(value = "/data", method = RequestMethod.GET)
	public ResponseEntity<String> test() {

		log.info("test app 1");

		return new ResponseEntity<>("hi from app1", HttpStatus.OK);
	}
}
