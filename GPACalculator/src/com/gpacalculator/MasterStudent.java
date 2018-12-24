package com.gpacalculator;

import java.util.Formatter;

public class MasterStudent extends Student {
	
	private static int masterStudentsCount = 0;
	private boolean isResearchApproved = false;
	
	public MasterStudent(String firstName, String lastName, String matrixNum, String program,  String[] courses) {
		
		super(firstName, lastName, matrixNum, program, courses);
		getGradePoint(courses);
		
		setMasterStudentsCount(getMasterStudentsCount() + 1);
	}


	@Override
	public void getGradePoint(String[] course) {
		
		GPA = 0;
		gradePoint = gradePoints(course);
		int length = gradePoint.length;
		for(int i=0; i<length; i++) {
			
			char grade = gradePoint[i];
			GPA += getIGradMaster(grade);
		}
		
		GPA /= length;
		
		if(GPA >= 2.9) {
			isResearchApproved = true;
		}
	}
	
	public void displayInfo() {
		
		Formatter fmt = new Formatter();
		fmt.format("%.2f", GPA);
		
		System.out.println("Program: " + program);
		super.displayInfo();
		System.out.println(
				"Your GPA is : " + fmt +
				"\nProject Status : " + isResearchApproved +
				"\nNumber in class : " + getMasterStudentsCount()
				);
	}
	
	public void displayCount() {
		System.out.println("Total number in class" + getMasterStudentsCount());
	}


	public static int getMasterStudentsCount() {
		return masterStudentsCount;
	}


	public static void setMasterStudentsCount(int masterStudentsCount) {
		MasterStudent.masterStudentsCount = masterStudentsCount;
	}

}
