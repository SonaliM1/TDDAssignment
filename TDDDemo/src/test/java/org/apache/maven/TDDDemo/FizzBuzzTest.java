package org.apache.maven.TDDDemo;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void shouldReturnFizzIfDivisibleByThree() {
		FizzBuzz fizzBuzz=new FizzBuzz();
		String actual = fizzBuzz.checkInput(9);
		Assert.assertEquals("Fizz", actual);
	}
	
	@Test
	public void shouldReturnBuzzIfDivisibleByFive() {
		FizzBuzz fizzBuzz=new FizzBuzz();
		String actual = fizzBuzz.checkInput(10);
		Assert.assertEquals("Buzz", actual);
	}
	
	@Test
	public void shouldReturnFizzBuzzIfDivisibleByThreeAndFive() {
		FizzBuzz fizzBuzz=new FizzBuzz();
		String actual = fizzBuzz.checkInput(15);
		Assert.assertEquals("FizzBuzz", actual);
	}
	
	@Test
	public void shouldReturnSameInputIfInputNotDivisibleByThreeAndFive(){
		FizzBuzz fizzBuzz=new FizzBuzz();
		String actual = fizzBuzz.checkInput(17);
		System.out.println(actual);
		Assert.assertEquals("17", actual);
	}

}
