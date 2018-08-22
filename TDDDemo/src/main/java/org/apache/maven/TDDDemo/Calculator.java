package org.apache.maven.TDDDemo;

import java.util.Arrays;

public class Calculator {

	public int addString(String input) {
        String inputString = input.replaceAll("\n", ",");

        String[] stringArray = input.trim().length() < 1 ? new String[0] : inputString.split(",");
        return Arrays.stream(stringArray).mapToInt(Integer::parseInt).sum();
 }

}
