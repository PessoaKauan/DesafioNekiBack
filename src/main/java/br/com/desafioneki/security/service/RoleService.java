package br.com.desafioneki.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafioneki.security.domain.Role;
import br.com.desafioneki.security.repository.RoleRepository;
@Service
public class RoleService {

	@Autowired
	RoleRepository roleRepository;
	
	public Role save(Role role) {
		return roleRepository.save(role);
	}
}
