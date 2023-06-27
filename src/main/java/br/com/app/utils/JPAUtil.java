package br.com.app.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("appJpaPU");

	public static EntityManager getEntityManager() {
		return fabrica.createEntityManager();
	}

}
