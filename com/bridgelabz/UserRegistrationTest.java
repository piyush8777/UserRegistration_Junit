
/**
 * ************************** 
 * Purpose: JUnit Test for Validate User Entries
 *
 * @author Piyush Shaw
 * @version 1.0
 * @since 20-06-2021
 * **************************
 */

package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {
	 UserRegistration object = new UserRegistration();
	    @Test
	    public void checkFirstName(){
	        Assertions.assertTrue(object.validateFirstName("[A-Z]{1}[a-z]{2,}","Piyush"));
	    }
	    @Test
	    public void checkLastName(){
	        Assertions.assertTrue(object.validateLastName("[A-Z]{1}[a-z]{2,}","Shaw"));
	    }
	    @Test
	    public void checkEmail(){
	        Assertions.assertTrue(object.validateEmail("^[a-zA-Z0-9]+[\\.\\-\\+\\_]?[a-zA-Z0-9]*@[a-zA-Z]+[.]?[a-zA-Z]{2,4}[\\.]?([a-z]{2})?$","piyush.shaw@gmail.com.in"));
	    }
	    @Test
	    public void checkPhoneNumber(){
	        Assertions.assertTrue(object.validatePhoneNumber("^[0-9]{2}[ ][0-9]{10}$","91 1234567809"));
	    }
	    @Test
	    public void checkPassword(){
	        Assertions.assertTrue(object.validatePassward("^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[^a-zA-Z0-9\\s][a-zA-Z0-9]*$)","Password@123"));
	    }


}
