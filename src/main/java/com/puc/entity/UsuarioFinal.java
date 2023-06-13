package com.puc.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class UsuarioFinal implements Serializable{
	
	private static final long serialVersionUID = 5602756702936276450L;
	
	

	public UsuarioFinal(Long id, String name, String email, String senha) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.senha = senha;
	}


	public UsuarioFinal() {
		super();
	}

	

	public UsuarioFinal(String name, String senha) {
		super();
		this.name = name;
		this.senha = senha;
	}



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "nome", length = 50, nullable = false)
    private String name;

	@Column(name = "email")
	private String email;
	
	
	@Column(name = "senha")
	private String senha;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "setor_id")
	private Setor setor;
	
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Setor getSetor() {
		return setor;
	}


	public void setSetor(Setor setor) {
		this.setor = setor;
	}


	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, senha, setor);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioFinal other = (UsuarioFinal) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(senha, other.senha) && Objects.equals(setor, other.setor);
	}

	
}
