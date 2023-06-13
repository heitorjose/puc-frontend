package com.puc.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tipo_local_produto")
public class TipoLocalProdutoFinal implements Serializable{
	

	private static final long serialVersionUID = -4348845502383715677L;

	public TipoLocalProdutoFinal(Long id, LocalArmazenagem local, Integer quantidade) {
		super();
		this.id = id;
		this.local = local;
		this.quantidade = quantidade;
	}

	public TipoLocalProdutoFinal() {
		super();
	}


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

	@OneToOne(cascade = CascadeType.ALL)
    private LocalArmazenagem local;
    
    @Column(name = "quantidade")
    private Integer quantidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalArmazenagem getLocal() {
		return local;
	}

	public void setLocal(LocalArmazenagem local) {
		this.local = local;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, local, quantidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoLocalProdutoFinal other = (TipoLocalProdutoFinal) obj;
		return Objects.equals(id, other.id) && Objects.equals(local, other.local)
				&& Objects.equals(quantidade, other.quantidade);
	}

}
