package com.skilldistillery.entities;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.skilldistillery.application.RentalStoreQuizApp;

class RentalStoreTests {
	// TODO: make necessary declarations
	RentalStoreQuizApp rents = new RentalStoreQuizApp();
	Store store = new Store();
	Customer ct2 = new Customer();

	@BeforeEach
	void setUp() throws Exception {
		}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	@DisplayName("test you can not register a duplicate customer")
	void testCustomers() {
		rents.registerCustomerAtStore(store, ct2);
		rents.registerCustomerAtStore(store, ct2);
		assertEquals("That customer is already a member",  );
	}

}
