package org.apache.maven.TDDDemo;


import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PasswordVarifierTest {
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none(); 
	
	
	@Test
	public void ExceptionWhenPasswordIsNull() throws Exception {
		PasswordVarifier passwordVarifier = new PasswordVarifier();
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("Password should not be empty...");
		 passwordVarifier.verify("");
	}
	 
    @Test
    public void ExceptionWhenPasswordWithLowerCaseAndLengthLessThanEight(){
    	PasswordVarifier passwordVarifier = new PasswordVarifier();
                    expectedException.expect(RuntimeException.class);
                    expectedException.expectMessage("Password should have at least one upper case letter and one digit with minimum 8 characters..");
                    passwordVarifier.verify("pass");
    }
    
    @Test
    public void ExceptionWhenPasswordWithAtleastOneLowerCase(){
    	PasswordVarifier passwordVarifier = new PasswordVarifier();
                    expectedException.expect(RuntimeException.class);
                    expectedException.expectMessage("Password should have at least one lower case letter");
                    passwordVarifier.verify("PASSWORDS");
    }
    
    @Test
    public void returnIfPasswordHasLowerAndUpperLetterAndDigitWithRequiredLength(){
    	PasswordVarifier passwordVarifier = new PasswordVarifier();
           Assert.assertEquals("Password is OK..", passwordVarifier.verify("Sonali@123"));
     }
    
    @Test
    public void returnIfPasswordHasLowerAndUpperLetterAndDigitWithMinimumLength(){
    	PasswordVarifier passwordVarifier = new PasswordVarifier();
           Assert.assertEquals("Password is OK..", passwordVarifier.verify("Sonal@3"));
     }
    
    @Test
    public void returnIfPasswordHasLowerAndUpperLetterAndNoDigitWithMinimumLength(){
    	PasswordVarifier passwordVarifier = new PasswordVarifier();
           Assert.assertEquals("Password is OK..", passwordVarifier.verify("Sonali@mane"));
     }
    
    @Test
    public void returnIfPasswordHasLowerLetterButNoUpperLetterWithNoDigitAndMinimumLength(){
    	PasswordVarifier passwordVarifier = new PasswordVarifier();
           Assert.assertEquals("Password is OK..", passwordVarifier.verify("sonali@123"));
     }



	

}
