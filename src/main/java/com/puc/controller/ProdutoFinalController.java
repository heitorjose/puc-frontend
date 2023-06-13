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

import com.puc.entity.ProdutoFinal;
import com.puc.repository.ProdutoFinalRepository;
import com.puc.service.ProdutoService;

@RestController
public class ProdutoFinalController {
	
	@Autowired
	private ProdutoFinalRepository repository;
	private ProdutoService service;
	
	@RequestMapping(value = "/produto", method = RequestMethod.POST)
	public ProdutoFinal salvarProduto(@RequestBody ProdutoFinal produto) {
		return repository.save(produto);
	}
	
	@RequestMapping(value = "/produto", method = RequestMethod.GET)
	public List<ProdutoFinal> listarProduto() {
		return repository.findAll();
	}
	
	@RequestMapping(value = "/produto", method = RequestMethod.PUT)
	public ProdutoFinal editarProduto(@RequestBody ProdutoFinal usuario) {
		return repository.save(usuario);
	}
	
	@RequestMapping(value = "/produto/venda", method = RequestMethod.PUT)
	public ProdutoFinal vendaProduto(@RequestBody ProdutoFinal produto) {
		return service.vendaProduto(produto);
	}

	 @RequestMapping(value = "/produto/{id}", method = RequestMethod.DELETE)
	    public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id)
	    {
	        Optional<ProdutoFinal> produto = repository.findById(id);
	        if(produto.isPresent()){
	            repository.delete(produto.get());
	            return new ResponseEntity<>(HttpStatus.OK);
	        }
	        else
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
}
