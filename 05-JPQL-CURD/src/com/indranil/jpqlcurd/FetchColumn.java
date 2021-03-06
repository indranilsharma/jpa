package com.indranil.jpqlcurd;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchColumn {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpql_curd");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		 //single list only
		 Query query = em.createQuery("Select s.first_name from Student s");
		
		 @SuppressWarnings("unchecked")
		 List<String> list = query.getResultList();
		 System.out.println("Student Name :");
		 for (String s : list) {
		
		 System.out.println(s);

		 }

		em.close();
		emf.close();

	}

}
