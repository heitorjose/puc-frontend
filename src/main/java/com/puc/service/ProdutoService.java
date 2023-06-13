package com.puc.service;

import java.lang.System.Logger;

import org.hibernate.annotations.common.util.impl.LoggerFactory;

import com.puc.entity.ProdutoFinal;
import com.puc.repository.ProdutoFinalRepository;


public class ProdutoService {

	private static final Logger LOGGER = (Logger) LoggerFactory.logger(ProdutoFinalRepository.class);
	
	private ProdutoFinalRepository repository;
	
	public ProdutoFinal vendaProduto(ProdutoFinal produto) {
	Long id_produto = produto.getId();
		
		try {
		ProdutoFinal produtoBanco = new ProdutoFinal();
		
		if(repository.existsById(id_produto)) {
			produtoBanco = repository.getById(id_produto);
			Integer estoque = (produtoBanco.getLocalProdutos().get(0).getQuantidade()) -  (produto.getLocalProdutos().get(0).getQuantidade());
			produtoBanco.getLocalProdutos().get(0).setQuantidade(estoque);
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		return produto;
	}


}
