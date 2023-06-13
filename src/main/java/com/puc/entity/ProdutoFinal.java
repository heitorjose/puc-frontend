package com.puc.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class ProdutoFinal implements Serializable{
	
	private static final long serialVersionUID = 8344365466814585866L;

	
	public ProdutoFinal(Long id, String nmProduto, FornecedorFinal fornecedor, Date validade,
			List<TipoLocalProdutoFinal> localProdutos) {
		super();
		this.id = id;
		this.nmProduto = nmProduto;
		this.fornecedor = fornecedor;
		this.validade = validade;
		this.localProdutos = localProdutos;
	}

	public ProdutoFinal(Long id, String nmProduto, FornecedorFinal fornecedor, Date validade) {
		super();
		this.id = id;
		this.nmProduto = nmProduto;
		this.fornecedor = fornecedor;
		this.validade = validade;
	}


	public ProdutoFinal(Long id, String nmProduto, Date validade) {
		super();
		this.id = id;
		this.nmProduto = nmProduto;
		this.validade = validade;
	}


	public ProdutoFinal() {
		super();
	}


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

	@Column(name = "nome")
	private String nmProduto;
	
	@OneToOne()
	private FornecedorFinal fornecedor;
	
	@Column(name = "validade")
	private Date validade;
	
	@OneToMany(cascade = CascadeType.MERGE)
	private List<TipoLocalProdutoFinal> localProdutos;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNmProduto() {
		return nmProduto;
	}

	public void setNmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
	}

	public FornecedorFinal getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(FornecedorFinal fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public List<TipoLocalProdutoFinal> getLocalProdutos() {
		return localProdutos;
	}

	public void setLocalProdutos(List<TipoLocalProdutoFinal> localProdutos) {
		this.localProdutos = localProdutos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fornecedor, id, localProdutos, nmProduto, validade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoFinal other = (ProdutoFinal) obj;
		return Objects.equals(fornecedor, other.fornecedor) && Objects.equals(id, other.id)
				&& Objects.equals(localProdutos, other.localProdutos) && Objects.equals(nmProduto, other.nmProduto)
				&& Objects.equals(validade, other.validade);
	}

	
}
