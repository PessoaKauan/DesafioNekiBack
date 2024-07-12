package br.com.desafioneki.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafioneki.domain.Imagem;
import br.com.desafioneki.dto.ImagemDTO;
import br.com.desafioneki.repository.ImagemRepository;

@Service
public class ImagemService {
	
	@Autowired
	ImagemRepository imagemRepository;
	
	public List<ImagemDTO> listarTudo(){
		List<Imagem> imagems = imagemRepository.findAll();
		List<ImagemDTO> imagemDTO = new ArrayList<>();
		
		for(Imagem imagem : imagems) {
			ImagemDTO imagemReturnDTO = new ImagemDTO();
			imagemReturnDTO.setDados(imagem.getDados());
			imagemReturnDTO.setImagemId(imagem.getImagemId());
			imagemReturnDTO.setNome(imagem.getNome());
			imagemReturnDTO.setTipo(imagem.getTipo());
			imagemDTO.add(imagemReturnDTO);
		}
		return imagemDTO;
	}
	
	public ImagemDTO buscarImagemId(UUID id) {
		Optional<Imagem> encontrarImagem = imagemRepository.findById(id);
		Imagem imagem = encontrarImagem.get();
		ImagemDTO imagemReturnDTO = new ImagemDTO();
		
		imagemReturnDTO.setDados(imagem.getDados());
		imagemReturnDTO.setImagemId(imagem.getImagemId());
		imagemReturnDTO.setNome(imagem.getNome());
		imagemReturnDTO.setTipo(imagem.getTipo());
			
		return imagemReturnDTO;
	}
	
	public Imagem salvarImagem(Imagem imagem) {
		return imagemRepository.save(imagem);
	}
	
	public void excluirImagem(UUID id) {
		imagemRepository.deleteById(id);
	}
}

