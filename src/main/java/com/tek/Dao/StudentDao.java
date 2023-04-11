package com.tek.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tek.Dto.Student;

public class StudentDao {

	public Student saveStudent(Student student) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}

	public List<Student> getByName() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.createQuery("Select s from Student s order by firstName", Student.class).getResultList();

	}

	public List<Student> getByGrade() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.createQuery("Select s from Student s order by grade", Student.class).getResultList();
	}

	public List<Student> getAll() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.createQuery("Select s from Student s", Student.class).getResultList();

	}
public void deleteById(int id) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	Student student=entityManager.find(Student.class, id);
	EntityTransaction entityTransaction= entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.remove(student);
	entityTransaction.commit();
}

public Connection connection() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	return DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
}
}
