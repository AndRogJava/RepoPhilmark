package com.etl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table ( name = "ADMIN" )  
public class Admin {

	
	private Integer id;
	private String username;
	private String nome;
	private String cognome;
	private String pass;
	private String email;
	
	public Admin() {}

	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE, generator = "adminSequence")
	
	@SequenceGenerator (name = "adminSequence", allocationSize = 1, sequenceName = "ADMINSEQ")
	
	@Column (name = "ID_ADMIN", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column (name = "USERNAME", unique = true, nullable = false)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column (name = "NOME")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column (name = "COGNOME")
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Column (name = "PASSWORD")
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Column (name = "EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
