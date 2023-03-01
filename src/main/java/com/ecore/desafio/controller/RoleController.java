package com.ecore.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecore.desafio.model.Role;
import com.ecore.desafio.services.RoleService;

@RestController
@RequestMapping("/ecore")
public class RoleController {
	
	@Autowired
	private RoleService service;

	@GetMapping("/roles")
	public List<Role> getRoles() {
		return service.getRoles();
	}
}
