package com.lduran.apifornecedor.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lduran.apifornecedor.domain.model.UsuarioResponse;

@RestController
@RequestMapping("/usuario")
public class UsuarioController
{
	@GetMapping
	public UsuarioResponse retornaUsuario()
	{
		return UsuarioResponse.builder().id(1L).nome("Lindineu Duran").idade(53).build();
	}
}
