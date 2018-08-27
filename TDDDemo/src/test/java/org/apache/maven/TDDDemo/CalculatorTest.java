package org.apache.maven.TDDDemo;

import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {
	
	@InjectMocks
	StringCalculator stringCalculator;
	
	@Mock
	Logger logger;
	
	@Test
	public void shouldReturnZeroWhenStringIsEmpty() {
		StringCalculator stringCalculator = new StringCalculator();
		//Assert.assertEquals(0, stringCalculator.addString(""));
		Assert.assertEquals(new Integer(0), stringCalculator.addString(""));
	}
	 
	
	@Test
	public void shouldReturnOneWhenSingleInput(){
		StringCalculator stringCalculator = new StringCalculator();
		int actual = stringCalculator.addString("5");
		Assert.assertEquals(5, actual);
	}

	@Test
	public void shouldReturnSumOfTwoInput(){
		StringCalculator stringCalculator = new StringCalculator();
		int actual = stringCalculator.addString("10,65");
		Assert.assertEquals(75, actual);
	}
	
	@Test
	public void shouldReturnSumOfInputWithSeperator(){
		StringCalculator stringCalculator = new StringCalculator();
		int actual = stringCalculator.addString("2\n3");
		Assert.assertEquals(5, actual);
	}
	
	@Test
	public void shouldReturnSumOfInputWithDelimeterSeperator(){
		StringCalculator stringCalculator = new StringCalculator();
		int actual = stringCalculator.addString("//;\n2;3");
		Assert.assertEquals(5, actual);
	}
	
	@Test
	public void shouldReturnSumOfNumberLessThanThousand(){
		StringCalculator stringCalculator = new StringCalculator();
		int actual = stringCalculator.addString("10,65,3,1001");
		Assert.assertEquals(78, actual);
		
	}
	
	@Test
	public void shouldReturnSumUsingLogger(){
		Mockito.doNothing().when(logger).info("5");
		stringCalculator.addString("//;\n2;3");
		Mockito.verify(logger).info("5");
		
	}
	
	@Test(expected = RuntimeException.class)
	public void shouldReturnExceptionWhenNegativeNumberasInput(){
		//Mockito.when(stringCalculator.addString("3,-5,6,-9")).thenThrow(new NegativeNumberException("Negative Numbers are not allowed.."));
		stringCalculator.addString("3,-5,6,-9");
	}
	
}
