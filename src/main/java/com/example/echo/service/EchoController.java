package com.example.echo.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

	@RequestMapping("/echo")
	public String echo(@RequestParam(name = "message", required = false, defaultValue = "Hello") String text) {		
		return text;		
	}
}
