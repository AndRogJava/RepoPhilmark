package com.etl.factory;

import com.etl.service.*;

public class ServiceFactory {
	private static UtentiService utentiService = new UtentiServiceImpl();
	private static LibriService libriService = new LibriServiceImpl();
	private static AdminService adminService = new AdminServiceImpl();

	public static UtentiService getUtentiService() {
		return utentiService;
	}
	
	public static LibriService getLibriService() {
		return libriService;
	}
	
	public static AdminService getAdminService() {
		return adminService;
	}
	
}
