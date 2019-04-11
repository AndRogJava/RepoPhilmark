package com.etl.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.etl.model.Admin;
import com.etl.util.HibernateUtil;

public class AdminDaoImpl implements AdminDao<Admin, Serializable>{
	
	private Session currentSession;
	private Transaction currentTransaction;
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory ;
	
	public AdminDaoImpl() {
		
		
	}
	
	public Session openCurrentSession() {

		Session currentSession = HibernateUtil.getSessionFactory().openSession();
		return currentSession;
	   

	}
//
	public Transaction openCurrentSessionwithTransaction() {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
	   Transaction currentTransaction  =  session.beginTransaction();
		return currentTransaction;

	}
//
	public void closeCurrentSession() {

		currentSession.close();

	}
//
//
//
	public void closeCurrentSessionwithTransaction() {

		currentTransaction.commit();

		currentSession.close();

	}



	  public static SessionFactory getSessionFactory() {
	    if (sessionFactory == null) {
	      try {
	        // Create registry
	        registry = new StandardServiceRegistryBuilder()
	            .configure()
	            .build();

	        // Create MetadataSources
	        MetadataSources sources = new MetadataSources(registry);

	        // Create Metadata
	        Metadata metadata = sources.getMetadataBuilder().build();

	        // Create SessionFactory
	        sessionFactory = metadata.getSessionFactoryBuilder().build();

	      } catch (Exception e) {
	        e.printStackTrace();
	        if (registry != null) {
	          StandardServiceRegistryBuilder.destroy(registry);
	        }
	      }
	    }
	    return sessionFactory;
	  }

	public Session getCurrentSession() {

		  return currentSession     = HibernateUtil.getSessionFactory().getCurrentSession();
		  
	}

	public void setCurrentSession(Session currentSession) {

		this.currentSession = currentSession;

	}

	public void persist(Admin entity) {
		openCurrentSessionwithTransaction();
		getCurrentSession().save(entity);

	}
	
	public void update(Admin entity) {
		getCurrentSession().update(entity);
		
	}

	public Admin findByEmail(String email) {
		Admin admin = (Admin) getCurrentSession().get(Admin.class, email);

		return admin;
	}

	public void delete(Admin entity) {
		getCurrentSession().delete(entity);
		
	}

	public List<Admin> findAll() {
		List<Admin> admins = (List<Admin>) getCurrentSession().createQuery("from admin").list();

		return admins;
	}

}
