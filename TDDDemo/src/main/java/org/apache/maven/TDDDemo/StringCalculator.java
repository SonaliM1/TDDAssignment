package org.apache.maven.TDDDemo;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class StringCalculator {
	
	private Logger logger =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public Integer addString(String input) {
        Integer sum = 0;
        String delimeter=null;
        if(input.startsWith("//")){
              delimeter = input.substring(2,3);
              input=input.substring(input.indexOf("\n")+1);
            
        }
        if (input.length() != 0) {
              List<String> listOfNumbers = Arrays.asList(input.split("\n|,|"+delimeter));
             
              sum =  listOfNumbers.stream().map(number -> Integer.parseInt(number)).filter(n->n<=1000)
                          .collect(Collectors.reducing((firstNumber, secondNumber) -> firstNumber + secondNumber)).get();
              
              
        }
        logger.info(sum.toString());
        return sum;

      

       
 }
}
 