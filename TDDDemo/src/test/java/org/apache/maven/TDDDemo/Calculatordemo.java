package org.apache.maven.TDDDemo;

public class Calculatordemo {

	public int add(String string) {
		if(string.length()==0)
		{
			return 0;
		}
		else if (string.length()==1) {
			return 1;
		}
		else{
			int sum=0;
			String[] strArray=string.split(",");
			for(String str : strArray){
				sum = sum + Integer.parseInt(str);
				System.out.println();
			}
			return sum;
		}
		
	}
}
