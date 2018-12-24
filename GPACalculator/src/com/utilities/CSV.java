package com.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
	
	public static List<String []> read(String file){
		
		List<String []> data = new LinkedList<String []>();
		
		String dataRaw;
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			while((dataRaw = br.readLine()) != null) {
				
				String [] dataRecords = dataRaw.split(",");
				data.add(dataRecords);
			} 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return data;
		
	}
}
