package com.ecore.desafio.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecore.desafio.model.Team;

@RestController
@RequestMapping("/ecore")
@ResponseBody
public class TeamController {

	@GetMapping("/teams")
	public List<Team> getAllTeams() {
		String uri = "https://cgjresszgg.execute-api.eu-west-1.amazonaws.com/teams";
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Team[]> response =
				  restTemplate.getForEntity(
				  uri,
				  Team[].class);
		Team[] teams = response.getBody();
						
		return Arrays.asList(teams);
	}
}
