package br.com.desafioneki.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.desafioneki.domain.Imagem;

@Repository
public interface ImagemRepository extends JpaRepository<Imagem, UUID> {

}

