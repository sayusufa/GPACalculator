package com.gpacalculator;

public interface IGradeBachelor {
	
	default double getIGradePoint(char grade) {
		
		if(grade == 'A') {
			return 4.0;
		} else if(grade == 'B') {
			return 3.3;
		} else if(grade == 'C') {
			return 3.0;
		} else if(grade == 'D') {
			return 1.67;
		} else if(grade == 'E') {
			return 1.0;
		} else {
			
			return 0.0;
		}
	}
}
