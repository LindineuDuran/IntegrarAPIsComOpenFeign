package com.lduran.apiconsumidor.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioResponse
{
	private Long id;
	private String nome;
	private int idade;
}