package com.etl.model;

import javax.persistence.*;

@Entity
@Table ( name = "LIBRI" )  
public class Libri {
	private Integer id;
	private String titolo;
	private String autore;
	private String genere;
	private String casaEdit;
	private Double costo;
	private Integer anno;


	public Libri() {}
	
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE, generator = "libriSequence")
	
	@SequenceGenerator (name = "libriSequence", allocationSize = 1, sequenceName = "LIBRISEQ")
	
	@Column (name = "ID_LIBRI", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column (name = "TITOLO")
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	@Column (name = "AUTORE")
	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}
	
	@Column (name = "GENERE")
	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	@Column (name = "CASAEDIT")
	public String getCasaEdit() {
		return casaEdit;
	}

	public void setCasaEdit(String casaEdit) {
		this.casaEdit = casaEdit;
	}
	
	@Column (name = "COSTO")
	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}
	
	@Column (name = "ANNO")
	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}
	
	

}
