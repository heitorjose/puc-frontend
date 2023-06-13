package com.puc.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_fornecedor")
public class FornecedorFinal implements Serializable{
	
	private static final long serialVersionUID = 8824531465822586428L;


	public FornecedorFinal(Long id, String name, Integer cnpj, String endereco) {
		super();
		this.id = id;
		this.name = name;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	public FornecedorFinal() {
		super();
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "nome", length = 50, nullable = false)
    private String name;
    
    @Column(name = "cnpj")
    private Integer cnpj;
    
    @Column(name = "endereco")
    private String endereco;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj, endereco, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FornecedorFinal other = (FornecedorFinal) obj;
		return Objects.equals(cnpj, other.cnpj) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
    
    

}
