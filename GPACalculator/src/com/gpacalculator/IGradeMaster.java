package com.gpacalculator;

public interface IGradeMaster {
	
	default double getIGradMaster(char grade) {
		
		if(grade == 'A') {
			return 4.0;
		} else if(grade == 'B') {
			return 3.37;
		} else if(grade == 'C') {
			return 3.35;
		} else if(grade == 'D') {
			return 3.0;
		} else if(grade == 'E') {
			return 2.7;
		} else {
			
			return 0.0;
		}
	}
}
