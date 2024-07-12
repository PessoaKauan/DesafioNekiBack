package br.com.desafioneki.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafioneki.security.domain.Role;
import br.com.desafioneki.security.enums.RoleEnum;

@Repository("role")
public interface RoleRepository extends JpaRepository<Role, Integer>{
	Optional<Role> findByName(RoleEnum name);
}

