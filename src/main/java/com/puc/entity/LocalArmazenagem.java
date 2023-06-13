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
@Table(name = "tb_local")
public class LocalArmazenagem implements Serializable{
	
	private static final long serialVersionUID = -1091634670178038171L;

	public LocalArmazenagem() {
		super();
	}

	public LocalArmazenagem(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "nome", length = 50, nullable = false)
    private String name;

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

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LocalArmazenagem other = (LocalArmazenagem) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
   
}
