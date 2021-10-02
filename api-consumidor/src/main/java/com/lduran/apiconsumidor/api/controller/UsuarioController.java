package com.lduran.apiconsumidor.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lduran.apiconsumidor.model.Fornecedor;
import com.lduran.apiconsumidor.model.UsuarioResponse;

@RestController
@RequestMapping("consumidor")
public class UsuarioController
{

	@Autowired
	Fornecedor fornecedor;

	@GetMapping
	public UsuarioResponse retornaUsuario()
	{
		return fornecedor.retornaUsuario();
	}

}