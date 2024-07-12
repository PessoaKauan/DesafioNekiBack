package br.com.desafioneki.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafioneki.domain.SkillUsuario;
import br.com.desafioneki.domain.SkillUsuarioKey;
	
@Repository
	public interface SkillUsuarioRepository  extends JpaRepository<SkillUsuario, SkillUsuarioKey> {
		List<SkillUsuario> findAllByUsuarioUsuarioId(Long usuarioId);
		
	}	
