package com.puc.repository;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuarioFinal extends JpaRepository<com.puc.entity.UsuarioFinal, Long>{

	public com.puc.entity.UsuarioFinal findByNameAndSenha(String name, String senha);
}
