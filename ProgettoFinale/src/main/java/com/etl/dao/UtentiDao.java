package com.etl.dao;

<<<<<<< HEAD
public class UtentiDao {

=======
import java.io.Serializable;
import java.util.List;

import com.etl.model.Utenti;

public interface UtentiDao <Utenti, Id extends Serializable>{
	public void update(Utenti utente);
	public Utenti findByEmail(String email);
	public void delete(Utenti utente);
	public List<Utenti> findAll();
>>>>>>> branch 'master' of https://github.com/AndRogJava/RepoPhilmark.git
}
