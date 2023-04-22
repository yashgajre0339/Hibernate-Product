package com.jsp.productcustomer.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.productcustomer.dto.Customer;



public class CustomerDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("yash");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	
	
	public Customer saveCustomer(Customer customer) {
		
		
		if(customer!=null) {
		
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		
		
		return customer;
		}
		else {
		return null;
		}
	}
	
	 public Customer getCustomerById( int id) {
		 return entityManager.find(Customer.class,id );
		 
	 }
	 
	 public Customer updateCustomer(Customer customer) {
		 if(customer!=null) {
			 entityTransaction.begin();
				entityManager.merge(customer);
				entityTransaction.commit();
			 return customer;
		 }
		return null;
	 }
	 
	 public Customer deleteCustomerByid(int id){
		 Customer customer =entityManager.find(Customer.class, id);
		 
		 if(customer!=null) {
			 entityTransaction.begin();
				entityManager.remove(customer);
				entityTransaction.commit();
			 
		 }
		return customer;
		 
	 }
	 
		
}