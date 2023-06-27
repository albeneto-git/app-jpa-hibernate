package br.com.app.utils;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

public class JPAUtilTest {

	@Test
	public void deveConectar() {
		EntityManager entityManager = JPAUtil.getEntityManager();
		System.out.println("Conectado");
		entityManager.close();
		System.out.println("Conexão fechada");
	}
}
