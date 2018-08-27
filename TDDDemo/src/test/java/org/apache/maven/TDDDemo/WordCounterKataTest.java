package org.apache.maven.TDDDemo;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class WordCounterKataTest {

	@Test
	public void shouldReturnCountOfWordsWithWords() {
		WordCounterKata wordCounterKata = new WordCounterKata();
		Map<String, Integer> actualWordCount = new HashMap<>();
		actualWordCount.put("Boom", 1);
		actualWordCount.put("Bang", 2);
		//actualWordCount.put("abc", 3);
		
		Assert.assertEquals(actualWordCount , wordCounterKata.wordCounter(" Boom, Bang, Boom"));
		
		
		
	}

}
