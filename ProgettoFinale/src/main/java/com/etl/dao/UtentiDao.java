package com.etl.dao;

import java.util.List;

import com.etl.model.Utenti;

public interface UtentiDao {
	public void update(Utenti utente);
	public Utenti findByEmail(String email);
	public void delete(Utenti utente);
	public List<Utenti> findAll();
}
