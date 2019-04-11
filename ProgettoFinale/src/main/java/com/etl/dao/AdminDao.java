package com.etl.dao;

import java.io.Serializable;
import java.util.List;

public interface AdminDao <Admin, Id extends Serializable> {
	public void update(Admin admin);
	public Admin findByEmail(String email);
	public void delete(Admin admin);
	public List<Admin> findAll();
}
