package com.UserRegistration;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static junit.framework.TestCase.assertTrue;

class UserRegistrationTest {
	UserRegistration userObj = new UserRegistration();

	@Test
	void firstNameTest() {
		assertTrue(userObj.firstNameValidation("Naveen"));
	}

	@Test
	void lastNameTest() {
		assertTrue(userObj.lastNameValidation("Patekar"));
	}

	@Test
	void emailValidationTest() {
		assertTrue(userObj.emailValidation("Patekar@gmail.com"));
	}

	@Test
	void mobileValidationTest() {
		assertTrue(userObj.mobileValidation("091 9876543210"));
	}

	@ParameterizedTest
	@ValueSource(strings = { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
			"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com.com" })
	void emailValidationTest(String email) {
		assertTrue(userObj.emailValidation(email));
	}

	@Test
	void passwordValTest() {
		assertTrue(userObj.passwordVal("Abc@1234"));
	}
}