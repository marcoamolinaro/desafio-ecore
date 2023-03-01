package com.ecore.desafio.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecore.desafio.model.User;

@RestController
@RequestMapping("/ecore")
@ResponseBody
public class UserController {

	@GetMapping("/users")
	public List<User> getAllUsers() {
		String uri = "https://cgjresszgg.execute-api.eu-west-1.amazonaws.com/users";
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<User[]> response =
				  restTemplate.getForEntity(
				  uri,
				  User[].class);
		User[] users = response.getBody();
						
		return Arrays.asList(users);
	}
}
