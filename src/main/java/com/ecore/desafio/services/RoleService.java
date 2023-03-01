package com.ecore.desafio.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecore.desafio.model.Role;
import com.ecore.desafio.util.Util;

@Service
public class RoleService {

	public List<Role> createRole(String name) {
		
		List<Role> roles = new ArrayList<>();
				
		for (String n : Util.exitingRoles) {
			Role role = new Role(n);
			roles.add(role);
		}
		
		Role role = new Role(name);
		
		if (!roles.contains(role)) {
			roles.add(role);
			Util.exitingRoles[Util.exitingRoles.length+1] = role.getName();
		}
	
		return roles;
	}
	
	public List<Role> getRoles() {
		List<Role> roles = new ArrayList<>();
		
		for (String n : Util.exitingRoles) {
			Role role = new Role(n);
			roles.add(role);
		}
		
		return roles;
	}
	
}
