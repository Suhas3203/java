package com.javaprogram1;

public class ProblemSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte tempOfSubstance= -10;
		//for defining positive or negative number
		if (tempOfSubstance > 0) {
			System.out.println("Temperature is Positive for given substance");
		}
		else {
			System.out.println("Temperature is negative for given substance");
		}
		
		System.out.println("................................");
		
		byte number=125;
		//for defining number is divisible by divisor 2 or not
		if(number % 2 == 0) {									//modulo condition used for reminder value after division
			System.out.println("Given Number " + number + "is divisible by 2");
		}
		else {
			System.out.println("Given Number " + number + " is not divisible by 2");
		}
		
		System.out.println("................................");
		
		System.out.println(number % 2 == 0 ? "Given Number " + number + "is divisible by 2" : "Given Number " + number + " is not divisible by 2");
	}
		
}
