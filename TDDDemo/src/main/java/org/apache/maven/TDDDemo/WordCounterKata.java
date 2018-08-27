package org.apache.maven.TDDDemo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class WordCounterKata {
	
		
		public Map wordCounter(String string){
		   
		    String[] strArray=string.split(",");
		    List<String> words = Arrays.stream(strArray).collect(Collectors.toList());
			
			
			Map<String, Integer> wordCountMap = new HashMap<>();
		
			words.forEach(word -> wordCountMap.merge(word, 1, (v,newV) -> v + newV ));
			
			System.out.println(wordCountMap);
			return wordCountMap;
			
			
		}
		
	}

