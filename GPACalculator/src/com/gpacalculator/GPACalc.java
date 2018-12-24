package com.gpacalculator;

import java.util.LinkedList;
import java.util.List;

public class GPACalc {

	public static void main(String[] args) {

		List<Student> students = new LinkedList<Student>();
		
		String file = "C:\\Users\\Yusuf\\Documents\\workspace-sts-3.9.4.RELEASE\\GPACalculator\\src\\stu_records.txt";
		
		List<String []> gradeRecords = com.utilities.CSV.read(file);
		
		for(String [] record : gradeRecords) {
			
			String matrix = record[0];
			String prog = record[1];
			String fname = record[2];
			String lname = record[3];
			String [] courseList = {record[4], record[5], record[6]};
			
			if(prog.equals("Bsc")) {
				
				students.add(new BachelorStudent(fname,lname,matrix,prog,courseList));
				
			} else if(prog.equals("Msc")) {
				
				students.add(new MasterStudent(fname,lname,matrix,prog,courseList));
			}
		}
		
		for(Student student : students) {
			
			System.out.println("\n************************");
			
			student.displayInfo();
		}
		
		System.out.println("\n************************");
		System.out.println("Number of Bachelor students : " + BachelorStudent.getBachelorStudentsCount());
		
		System.out.println("\n************************");
		System.out.println("Number of Master students : " + MasterStudent.getMasterStudentsCount());
	}

}
