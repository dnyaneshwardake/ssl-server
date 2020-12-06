package com.dnyanesh.sslserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/server")
public class HelloController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping
	public String sayHello() {
		return "Welcome to two way SSL";
	}

}
