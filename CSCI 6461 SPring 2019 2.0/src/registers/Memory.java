package registers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Memory {
	//Create a memory of size 2048 ( 0 -> 2047)
	static ArrayList<String> memory = new ArrayList<String>();
	//ArrayList<String> memory2 = new ArrayList<String>();
	
	
	//Initilaize memory to 0
	public Memory() {
		for(int i =0; i <= 2048; i++) {
			memory.add("");
		}
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\Gia\\eclipse-workspace\\CSCI 6461 SPring 2019/memory.txt"));
			String line = reader.readLine();
			int i = 0;
			while (line != null) {
				//System.out.println(line);
				// read next line
				Memory.setMemory(i, line.trim());	
				line = reader.readLine();
				i++;
				
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @param address: location on the memory
	 * @return: content on memory
	 */
	public String getFromMemory(int address) {
		
		return (memory.get(address));
	}
	
	public static void setMemory(int address, String content) {
		
		memory.set(address, content);
	}
	
	

}
