package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory factory;
	
	public static EntityManager getEntityManager() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("progFinal1");
		}
		return factory.createEntityManager();
	}
	
	public static void main(String[] args) {
		JPAUtil.getEntityManager();
	}
}
