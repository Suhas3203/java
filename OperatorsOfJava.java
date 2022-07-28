package com.javaprogram1;

public class OperatorsOfJava {
	
	public static void main(String[] args) {
		
		byte number1 = 50;
		byte number2 = 20;
		
		System.out.println(number1);
		System.out.println(number2);
		//unary operator i.e. (++)increment,(--)decrement,(~)compliment,(!)not
		System.out.println(++number1);   //Pre-increment
		System.out.println(number2++);	  //Post-increment
		
		System.out.println(--number1);	//pre-decrement
		System.out.println(number2--);	//post-decrement
		
		System.out.println(number1);
		System.out.println(number2);
		
		boolean isPassedAssessment=true;
		System.out.println(!isPassedAssessment);	//not

		System.out.println("-----------------------------------------");
		int markOfExam=20;
		System.out.println(~markOfExam);		//compliment  (+ve)
		
		int tempOfBody=-10;
		System.out.println(~tempOfBody);		//(-ve)  compliment
		System.out.println("-----------------------------------------");
		//Arithmetic Operators
		//markOfExam=20 & tempOfBody=-10
		System.out.println(++markOfExam + --tempOfBody);	//markOfExam=21  & tempOfBody=-11 
		System.out.println(markOfExam - tempOfBody);		//markOfExam=21  & tempOfBody=-11
		System.out.println(markOfExam++ * tempOfBody--);	//markOfExam=21  & tempOfBody=-11   but after equation values are markOfExam=22  & tempOfBody=-12
		System.out.println(++markOfExam / ++tempOfBody);		//markOfExam=23  & tempOfBody=-11
		System.out.println(markOfExam % tempOfBody);		//markOfExam=23  & tempOfBody=-11		here % is for modulo i.e. reminder
		
		System.out.println("-----------------------------------------");
		//markOfExam=23  & tempOfBody=-11
		//logical operators
		System.out.println(markOfExam > tempOfBody && tempOfBody>0);	//AND operator -All conditions should be true 
		
		System.out.println(markOfExam > tempOfBody || tempOfBody>0);	//OR operator - Any one condition should be true
		
		System.out.println("-----------------------------------------");
		//bitwise operator
		//markOfExam=23  & tempOfBody=-11
		System.out.println(markOfExam & tempOfBody);	//in bitwise AND operator work between binary code of value 0 is false also 1 is true
		/* Here,
		 *    	1st value=23 ----> 1 0 1 1 1
		 *  				2nd value=-11 ---> 0 1 0 1 1
		 *      for (-ve) value -->1 0 1 0 0   inverse of binary digits
		 *      -------------------------------
		 * 						   1 0 1 0 0------>20
		 */
		System.out.println(markOfExam | tempOfBody);	//work in binary codes for any one true condition
		System.out.println(markOfExam ^ tempOfBody);
		
		System.out.println("-----------------------------------------");
		byte numb1 = 20;  
		byte numb2 = 25;
		System.out.println(numb1& numb2);
		
		System.out.println("-----------------------------------------");
		
		System.out.println("-----------------------------------------");
		//markOfExam=23  & tempOfBody=-11
		//Assignment operator
		markOfExam=markOfExam +20;		
		System.out.println(markOfExam);		//markOfExam=43
		System.out.println(markOfExam+=7);	//markOfExam=50
		tempOfBody=tempOfBody +47;			
		System.out.println(tempOfBody);		//tempOfBody=36
		System.out.println(tempOfBody*=2);	//tempOfBody=72
		
		
	}
}
