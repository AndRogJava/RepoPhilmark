package com.etl.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table ( name = "LIBRI" )  
public class Libri {

	private String titolo;
	private String autore;
	private String genere;
	private String casaEdit;
	private Double costo;
	private Integer anno;


	public Libri() {}
	
}
