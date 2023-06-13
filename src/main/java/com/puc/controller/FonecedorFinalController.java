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

import com.puc.entity.FornecedorFinal;
import com.puc.entity.ProdutoFinal;
import com.puc.repository.FornecedorFinalRepository;
import com.puc.repository.ProdutoFinalRepository;

@RestController
public class FonecedorFinalController {
	
	@Autowired
	private FornecedorFinalRepository repository;
	
	@RequestMapping(value = "/fornecedor", method = RequestMethod.POST)
	public FornecedorFinal salvarFornecedor(@RequestBody FornecedorFinal fornecedor) {
		return repository.save(fornecedor);
	}
	
	@RequestMapping(value = "/fornecedor", method = RequestMethod.GET)
	public List<FornecedorFinal> listarFornecedor() {
		return repository.findAll();
	}
	
	@RequestMapping(value = "/fornecedor", method = RequestMethod.PUT)
	public FornecedorFinal editarFornecedor(@RequestBody FornecedorFinal fornecedor) {
		return repository.save(fornecedor);
	}

	 @RequestMapping(value = "/fornecedor/{id}", method = RequestMethod.DELETE)
	    public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id)
	    {
	        Optional<FornecedorFinal> fornecedor = repository.findById(id);
	        if(fornecedor.isPresent()){
	            repository.delete(fornecedor.get());
	            return new ResponseEntity<>(HttpStatus.OK);
	        }
	        else
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
}
