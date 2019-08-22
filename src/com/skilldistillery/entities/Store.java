package com.skilldistillery.entities;

import java.util.ArrayList;
import java.util.List;

public class Store {
	// TODO: each store has an id
	private int id = 0;

	// TODO: each store has 0 or more unique Customers
	// A set would have handled the multiple customer issue, but I handled using a list
	// in my addCustomers(); method
	private List<Customer> customers = new ArrayList<>();

	public Store() {

	}

	public Store(int id, List<Customer> customers) {
		super();
		this.id = id;
		this.customers = customers;
	}

	// TODO: implement the required methods to:
	// * Add a customer (no duplicates allowed)
	// * Return the number of customers
	// * Display all data
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("This stores id# is: ");
		builder.append(id + "\n");
		builder.append("Our customers include \n");
		for (Customer customer : customers) {
			builder.append(customer + "\n");
			
		}
		return builder.toString();
	}
	
	

	public void addCustomer(Customer customer) {
		if(customers.contains(customer)){
			//Prints when customer is REGISTERED, otherwise people 
			//existing with the same name is a nonissue
			System.out.println("That customer is already a member");
		} else {
		customers.add(customer);
		System.out.println(customer + "added");
		}
	}

}
