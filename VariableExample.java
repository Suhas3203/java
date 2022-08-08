package com.javaprogram1;

public class VariableExample {

	public static void main(String[] args ) {
		
		Learners suhasDeshmukh= new Learners();
		
		suhasDeshmukh.assessment1=95;
		suhasDeshmukh.assessment2=95;
		suhasDeshmukh.assessment3=95;
		
		
		System.out.println(suhasDeshmukh.assessment1);
		System.out.println(suhasDeshmukh.assessment2);
		System.out.println(suhasDeshmukh.assessment3);
		System.out.println(suhasDeshmukh.assessment4);
		
		System.out.println(Learners.companyName);
		
		System.out.println(suhasDeshmukh instanceof Learners);		//instanceof operator defines variable is in which class and given location is true or false 
	}
}
