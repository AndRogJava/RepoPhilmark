package com.etl.util;

<<<<<<< HEAD
public class HibernateUtil {

=======
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	 private static StandardServiceRegistry standardRegistry = null;

	    private static SessionFactory buildSessionFactory() {
	        try {
	            StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
	                    .configure().build();
	            Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
	            return metadata.getSessionFactoryBuilder().build();

	        } catch (HibernateException he) {
	            System.out.println("Session Factory creation failure");
	            throw he;
	        }
	    }

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	    
	    public static void shutdown() {
	        if (standardRegistry != null) {
	          StandardServiceRegistryBuilder.destroy(standardRegistry);
	          sessionFactory.close();
	        }
	    }	 
>>>>>>> branch 'master' of https://github.com/AndRogJava/RepoPhilmark.git
}
