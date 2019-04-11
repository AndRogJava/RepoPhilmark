package com.etl.model;

<<<<<<< HEAD
import javax.persistence.*;

@Entity
@Table ( name = "UTENTI" )  
public class Utenti {



	private Integer id;
	private String username;
	private String nome;
	private String cognome;
	private String pass;
	private String email;
	private String indirizzo;
	private String citta;
	private String provincia;
	private Integer cap;


	public Utenti() {}


	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE, generator = "utentiSequence")
	
	@SequenceGenerator (name = "utentiSequence", allocationSize = 1, sequenceName = "UTENTISEQ")
	
	@Column (name = "ID_UTENTI", unique = true, nullable = false)
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

	@Column (name = "INDIRIZZO")
	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	@Column (name = "CITTA")
	public String getCitta() {
		return citta;
	}


	public void setCitta(String citta) {
		this.citta = citta;
	}

	@Column (name = "PROVINCIA")
	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Column (name = "CAP")
	public Integer getCap() {
		return cap;
	}


	public void setCap(Integer cap) {
		this.cap = cap;
	}



}

=======
public class Utenti {

}
>>>>>>> branch 'master' of https://github.com/AndRogJava/RepoPhilmark.git
