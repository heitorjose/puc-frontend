package com.puc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.puc.repository.ServiceObjeto;
import com.puc.repository.UsuarioFinal;

@RestController
public class UsuarioFinalController {
	
	@Autowired
	private UsuarioFinal repository;
	
//	@Autowired
//	private ServiceObjeto service;
	
	@RequestMapping(value = "/usuario", method = RequestMethod.POST)
	public com.puc.entity.UsuarioFinal salvarUsuario(@RequestBody com.puc.entity.UsuarioFinal usuario) {
		return repository.save(usuario);
	}
	
	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public List<com.puc.entity.UsuarioFinal> listarUsuario() {
		return repository.findAll();
	}
	
	@RequestMapping(value = "/usuario/autentica/{nome}/{senha}", method = RequestMethod.GET)
	public com.puc.entity.UsuarioFinal procuraUsuario(@PathVariable String nome, @PathVariable String senha) {
		return repository.findByNameAndSenha(nome, senha);
	}
	
	@RequestMapping(value = "/usuario", method = RequestMethod.PUT)
	public com.puc.entity.UsuarioFinal editarUsuario(@RequestBody com.puc.entity.UsuarioFinal usuario) {
		return repository.save(usuario);
	}

	 @RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE)
	    public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id)
	    {
	        Optional<com.puc.entity.UsuarioFinal> usuario = repository.findById(id);
	        if(usuario.isPresent()){
	            repository.delete(usuario.get());
	            return new ResponseEntity<>(HttpStatus.OK);
	        }
	        else
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
}
