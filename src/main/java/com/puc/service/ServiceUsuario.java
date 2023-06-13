package com.puc.service;

import javax.persistence.EntityManager;

import com.puc.repository.InserindoObjetosService;

public class ServiceUsuario {
	
	EntityManager em;

	private InserindoObjetosService service; 
	
	public com.puc.entity.UsuarioFinal cargaBancoService(String nome, String senha) {
		
		return service.cargaBancoService(nome, senha);
	}
	
}
