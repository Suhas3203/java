package com.javaprogram1;

public class practiceDatatypes {

	

	public static void main(String []args) {
		boolean isProcessDone= true;
		
		char fLetterOfName='S';
		
		byte ageOfPerson=27;
		
		System.out.println(isProcessDone);
		
		System.out.println(fLetterOfName);
		
		System.out.println(ageOfPerson);
		
		System.out.println("..................................");
		
		//datatypes
		
		int myAge=22;
		
		short rollNum=101;
		
		long salaryCtc=750000L;
		
		float valueOfBill=128.354f;
		
		//double amountOfBill=119.23456789345;
		//implicit typecasting
		double amountOfBill=valueOfBill;
		//explicit typecasting
		float finalAmount=(float)amountOfBill;
		
		System.out.println(myAge);
		
		System.out.println(rollNum);
		
		System.out.println(salaryCtc);
		
		System.out.println(valueOfBill);
		
		System.out.println(amountOfBill);
		
		System.out.println(finalAmount);
		
		System.out.println("............................");
		//characters inside in integer with ASCII with 256 numbers
		char splChar='@';
		int numOfChar=	splChar;
		
		System.out.println(numOfChar);
		
		int numValue=66;
		
		char charNum=(char)numValue;
		
		System.out.println(charNum);
	}
}
