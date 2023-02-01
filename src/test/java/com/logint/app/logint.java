package test.java.com.logint.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.com.login.app.login;

class logint {

	@Test
	void testvalidation1email() {
		assertTrue(login.emailvalidation("Rahul@1234.com"));
		assertFalse(login.emailvalidation("Rahul@1234com"));		
		
	}
	@Test
	void testvalidation2email() {
		assertFalse(login.emailvalidation("kartikbalekarugmail.com"));
		assertTrue(login.emailvalidation("Kartikbalekaru@gmail.com"));
	}
	
	@Test
	void testvalidation3email() {
		assertFalse(login.emailvalidation("Ramparavi_@gmail.com"));
		assertTrue(login.emailvalidation("Ramparavi@gmail.com"));
		assertTrue(login.emailvalidation("Ramparavi@gmail.com"));
		
	}
	
	@Test
	void testvalidation4email() {
		assertTrue(login.emailvalidation("Vikaschalapathi@gmail.com"));
		assertFalse(login.emailvalidation("vikaschalapathi@gmail.com"));
		
	}
	
	
	@Test
	void testvalidation1Password() {
		assertTrue(login.validation("Rahul@123"));
		assertTrue(login.validation("Rahuls@123"));
		
		
	}
	
	
	@Test
	void testvalidation2Password() {
		assertTrue(login.validation("Kartik!4537"));
		assertFalse(login.validation("kartik!4537"));
		
	}
	
	@Test
	void testvalidation3Password() {
		assertTrue(login.validation("Ravirampa#89755"));
		assertFalse(login.validation("ravirampa#89755"));
		
	}
	@Test
	void testvalidation4Password() {
		assertTrue(login.validation("Vikas%456789"));
		assertFalse(login.validation("vikas%456789"));
            assertFalse(login.validation("vikas%456789"));		
	}
	
	
	





}