package br.com.desafioneki.dto;

import br.com.desafioneki.security.dto.SignupRequestDTO;

public class RegistrarUsuarioDTO {
	
	private SignupRequestDTO signupRequestDTO;

	public SignupRequestDTO getSignupRequestDTO() {
		return signupRequestDTO;
	}

	public void setSignupRequestDTO(SignupRequestDTO signupRequestDTO) {
		this.signupRequestDTO = signupRequestDTO;
	}
}