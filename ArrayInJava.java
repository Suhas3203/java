package com.javaprogram1;

public class ArrayInJava {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array with declaration & defining continuous memory for it 
			String arrayOfLearners[] = new String[10];		//1Dimensional Array
			
			arrayOfLearners[0]="Suhas";
			arrayOfLearners[1]="Aniket";
			arrayOfLearners[2]="Rohit";
			arrayOfLearners[3]="Sameer";
			arrayOfLearners[9]="Samual";
			System.out.println(arrayOfLearners[0]);
			System.out.println(arrayOfLearners[1]);
			System.out.println(arrayOfLearners[2]);
			System.out.println(arrayOfLearners[3]);
			System.out.println(arrayOfLearners[4]);
			System.out.println(arrayOfLearners[9]);
			System.out.println(arrayOfLearners.getClass());
			
			int applNoArray[]=new int[5];
			
			applNoArray[0]= 20001;
			applNoArray[1]= 20002;
			applNoArray[2]= 20003;
			applNoArray[3]= 20004;
			applNoArray[4]= 20005;
			
			System.out.println(applNoArray[0]);
			System.out.println(applNoArray[1]);
			System.out.println(applNoArray[2]);
			System.out.println(applNoArray[3]);
			System.out.println(applNoArray[4]);
			System.out.println(applNoArray.getClass());
			
			byte marksInAssessment[]= {70,75,80,90,92};
			
			System.out.println(marksInAssessment[0]);
			System.out.println(marksInAssessment[1]);
			System.out.println(marksInAssessment[2]);
			System.out.println(marksInAssessment[3]);
			System.out.println(marksInAssessment.getClass().getSuperclass());
			
			System.out.println("...................");
			
			long salaryPerAnnum[]=new long[2];
			salaryPerAnnum[0]= 3600000;
			salaryPerAnnum[1]= 5400000;
			
			long total_salary_expected[]= salaryPerAnnum.clone();			//cloning of array
			
			System.out.println(total_salary_expected[0]);
			System.out.println(total_salary_expected[1]);
			System.out.println(total_salary_expected);			//shows base address of array
			
			System.out.println("...............................................");
			char noWithFriendName[][]=new char[4][5];		//2Dimensional Array(MultiDimensional Array)
			
			noWithFriendName[0][0]= 'b';
			
			System.out.println(noWithFriendName[0][0]); 
			System.out.println(noWithFriendName[0][0]==noWithFriendName[0][1]);			//compares with values
			
			int noOfAssessmentsTaken[][]=new int[4][];
			
			noOfAssessmentsTaken[0]=new int[2];		//1st row with 2 columns
			noOfAssessmentsTaken[1]=new int[4];		//2nd row with 4 columns
			noOfAssessmentsTaken[2]=new int[5];		//3rd row with 5 columns
			noOfAssessmentsTaken[3]=new int[3];		//4th row with 3 columns
			
			noOfAssessmentsTaken[0][1]= 5;			//Domain Assessments
			noOfAssessmentsTaken[3][1]= 3;			//coding Assessments
			
			System.out.println(noOfAssessmentsTaken[0][1]);
			System.out.println(noOfAssessmentsTaken[1][2]);
			System.out.println(noOfAssessmentsTaken[2][4]);
			System.out.println(noOfAssessmentsTaken[3][2]);
			
			char myNames[][]= new char[5][2];
			
			myNames[0][1]= 'H';
			char num= 201;
			myNames[1][1]= num;
			System.out.println(myNames[1][1]);
			System.out.println(noWithFriendName== myNames);		//comparing two arrays of same datatype 
			
	}

}
