package com.javaprogram1;

public class ProblemFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName="deshmukh";							//String Literal
		String lastName= new String("suhas");			//String Object
		//output First line
		System.out.println(firstName.length() + lastName.length());
		//output Second line
		System.out.println(firstName.compareTo(lastName)>=0 ? "Yes": "No");
		//output Third line
		System.out.println(firstName.substring(0, 1).toUpperCase()+firstName.substring(1)+" "+lastName.substring(0, 1).toUpperCase()+lastName.substring(1));
		
	}

}
