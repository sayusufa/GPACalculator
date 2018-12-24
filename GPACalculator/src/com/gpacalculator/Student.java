package com.gpacalculator;

public abstract class Student implements IGradeBachelor, IGradeMaster {
	
	private String firstName;
	private String lastName;
	private String matrixNum;
	private String [] courses;
	protected char [] gradePoint;
	protected double GPA;
	protected String program;
	
	
	public Student(String firstName, String lastName, String matrixNum, String program, String [] courses) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.matrixNum = matrixNum;
		this.program = program;
		this.courses = courses;
	}
	
	public char [] gradePoints(String[] course) {
		
		String pointSet = "ABCDEF";
		int length = course.length;
		char[] points = new char[length];
		
		for(int i=0; i<length; i++) {
			
			int randNum = (int) (Math.random() * pointSet.length());
			points[i] = pointSet.charAt(randNum);
		}
		
		return points;
	}
	
	public abstract void getGradePoint(String[] course);

	
	public void displayInfo() {
		
		System.out.println(
				"Name : " + firstName + " " + lastName +
				"\nMatrix Number : " + matrixNum );
	}
	
	
}
