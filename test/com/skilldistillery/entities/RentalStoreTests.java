package com.skilldistillery.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.skilldistillery.application.RentalStoreQuizApp;

class RentalStoreTests {
	// TODO: make necessary declarations
	RentalStoreQuizApp rents = new RentalStoreQuizApp();
	Store store = new Store();
	Customer ct2 = new Customer("Testy", "TestFace");

	@BeforeEach
	void setUp() throws Exception {
		//adds the cust to the store initially
		rents.registerCustomerAtStore(store, ct2);
		}

	@AfterEach
	void tearDown() throws Exception {
		
	}
	
	@Test
	@DisplayName("test you can not register a duplicate customer")
	void testCustomers() {
		// adds the SAME customer
		String actual = rents.registerCustomerAtStore(store, ct2);
		assertEquals("That customer is already a member", actual);
	}

}
