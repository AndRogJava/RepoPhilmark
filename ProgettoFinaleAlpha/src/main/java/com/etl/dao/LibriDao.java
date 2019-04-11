package com.etl.dao;

import java.io.Serializable;
import java.util.List;

import com.etl.model.Libri;


public interface LibriDao <Libri, Id extends Serializable>{
	public void update(Libri libro);
	
	public void delete(Libri libro);
	public List<Libri> findAll();
}
