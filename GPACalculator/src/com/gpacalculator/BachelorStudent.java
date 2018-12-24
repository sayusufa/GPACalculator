package com.gpacalculator;

import java.util.Formatter;

public class BachelorStudent extends Student {
	
	private static int bachelorStudentsCount = 0;
	private boolean isProjectApproved = false;
	
	public BachelorStudent(String firstName, String lastName, String matrixNum, String program, String[] courses) {
		
		super(firstName, lastName, matrixNum, program, courses);

		getGradePoint(courses);
		
		setBachelorStudentsCount(getBachelorStudentsCount() + 1);
	}


	@Override
	public void getGradePoint(String[] course) {
		
		GPA = 0;
		gradePoint = gradePoints(course);
		int length = gradePoint.length;
		for(int i=0; i<length; i++) {
			
			char grade = gradePoint[i];
			GPA += getIGradePoint(grade);
		}
		
		GPA /= length;
		
		if(GPA >= 2.7) {
			isProjectApproved = true;
		}
	}
	
	
	public void displayInfo() {
		
		Formatter fmt = new Formatter();
		fmt.format("%.2f", GPA);
		
		System.out.println("Program: " + program);
		super.displayInfo();
		System.out.println(
				"Your GPA is : " + fmt +
				"\nProject Status : " + isProjectApproved +
				"\nNumber in class : " + getBachelorStudentsCount()
				);
	}

	public static int getBachelorStudentsCount() {
		return bachelorStudentsCount;
	}

	public static void setBachelorStudentsCount(int bachelorStudentsCount) {
		BachelorStudent.bachelorStudentsCount = bachelorStudentsCount;
	}
	
	
}
