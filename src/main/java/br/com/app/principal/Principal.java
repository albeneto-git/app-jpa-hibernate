package br.com.app.principal;

import javax.persistence.EntityManager;

import br.com.app.model.Pessoa;
import br.com.app.utils.JPAUtil;

public class Principal {

	public static void main(String[] args) {
		EntityManager entityManager = JPAUtil.getEntityManager();
/*
		Pessoa pessoa1 = new Pessoa(null, "Albertino Cardoso Neto", "albeneto72@gmail.com");
		Pessoa pessoa2 = new Pessoa(null, "Francineide Germano", "fran73@gmail.com");
		entityManager.getTransaction().begin();
		entityManager.persist(pessoa1);
		entityManager.persist(pessoa2);
		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("Pessoas cadastradas");
		System.out.println("Transação fechada e encerrada");
*/
		entityManager.getTransaction().begin();
		Pessoa pessoa = entityManager.find(Pessoa.class, 2);
		System.out.println("Pessoa pesquisada: " + pessoa.toString());
		System.out.println("Pessoa deletada");
		entityManager.remove(pessoa);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
}
