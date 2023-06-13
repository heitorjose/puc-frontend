package com.puc.repository;

import java.lang.System.Logger;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.slf4j.LoggerFactory;

public class InserindoObjetosService implements ServiceObjeto{

	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(UsuarioFinal.class);
	@PersistenceContext
	private EntityManager em;
	public static final String NAME = "";
	
	@Override
	public com.puc.entity.UsuarioFinal cargaBancoService(String nome, String senha) {
		
		com.puc.entity.UsuarioFinal retorno = new com.puc.entity.UsuarioFinal();
		try {
					
			CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
			CriteriaQuery<com.puc.entity.UsuarioFinal> query = criteriaBuilder.createQuery(com.puc.entity.UsuarioFinal.class);
			Root<com.puc.entity.UsuarioFinal> root = query.from(com.puc.entity.UsuarioFinal.class);
		
			List<Predicate> autentica = new ArrayList<>();
			Predicate predicate = criteriaBuilder.equal(root.get("name"), nome);
			Predicate predicateSenha = criteriaBuilder.equal(root.get("senha"), senha);
			autentica.add(predicate);
			autentica.add(predicateSenha);
			query.where(autentica.toArray(new Predicate[0]));
			
			retorno = em.createQuery(query).getSingleResult();
				
		}catch (PersistenceException e) {
			// TODO: handle exception
			((org.slf4j.Logger) LOGGER).error("Erro ao buscar Solicitação Classificação com paginação", e);
		}
		return retorno;		
	}
	
}
