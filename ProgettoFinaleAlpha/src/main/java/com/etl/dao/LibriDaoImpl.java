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

import com.etl.model.Libri;
import com.etl.util.*;

public class LibriDaoImpl implements LibriDao<Libri, Serializable>{
	
	private Session currentSession;
	private Transaction currentTransaction;
	private static StandardServiceRegistry registry;
	
	private static SessionFactory sessionFactory ;
	
	public LibriDaoImpl() {
		
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
	
	public void persist(Libri entity) {
		openCurrentSessionwithTransaction();
		getCurrentSession().save(entity);

	}
	
	public void update(Libri entity) {
		getCurrentSession().update(entity);
		
	}

	public void delete(Libri entity) {

		getCurrentSession().delete(entity);
		
	}

	public List<Libri> findAll() {
		List<Libri> libri = (List<Libri>) getCurrentSession().createQuery("from libri").list();

		return libri;
	}
	
}
