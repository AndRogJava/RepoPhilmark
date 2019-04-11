package com.etl.factory;

import com.etl.dao.*;

public class DaoFactory {
	private static AdminDao adminDao = new AdminDaoImpl();
	private static LibriDao libriDao = new LibriDaoImpl();
	private static UtentiDao utentiDao = new UtentiDaoImpl();

	public static AdminDao getAdminDao() {
		return adminDao;
	}
	
	public static LibriDao getLibriDao() {
		return libriDao;
	}
	
	public static UtentiDao getUtentiDao() {
		return utentiDao;
	}
	
}