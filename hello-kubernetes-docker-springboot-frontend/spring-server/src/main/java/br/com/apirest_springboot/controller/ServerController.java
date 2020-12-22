package br.com.apirest_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/apiserver")
public class ServerController {


	@GetMapping(produces = "application/json")
	public String find() {
		return "Hello World";
	}
}
