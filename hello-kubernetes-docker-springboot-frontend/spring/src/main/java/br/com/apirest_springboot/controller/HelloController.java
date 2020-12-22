package br.com.apirest_springboot.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(value = "/apihello")
public class HelloController {
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping(produces = "application/json")
	public String find() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		String res =  restTemplate.exchange("http://springserver-service:8080/apiserver", HttpMethod.GET, entity, String.class)
				.getBody();
		return res;
	}
}
