package com.javaprogram1;
		
public class PracticeString {
	
	String myProfession="Java Full Stack Developer";	//instance variable
	static char gradeInCourse='A';
	
	public static void main(String[] args) {
		//string literal
		String fName="Suhas ";		//local variable
		String lName="Deshmukh";
		
		System.out.print(fName);
		System.out.println(lName);
		
		//string object
		//below line fullName is object of new string
		String fullName=new String("Suhas B Deshmukh");
		System.out.println(".................................");
		System.out.println(fullName);
		System.out.println(".................................");
		//Array of string
		String friendList[]= {"Aniket Patil", "Anket Deshmukh", "Sameer Patil"};
		//output of array with index number
		System.out.println(friendList[0]);
	}
}
