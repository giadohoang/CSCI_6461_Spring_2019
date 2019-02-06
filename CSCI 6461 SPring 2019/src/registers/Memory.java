package registers;

import java.util.ArrayList;

public class Memory {
	//Create a memory of size 2048 ( 0 -> 2047)
	ArrayList<Integer> memory = new ArrayList<Integer>();
	
	//Initilaize memory to 0
	public Memory() {
		for(int i =0;i <= 2047;i++) {
			//Set memory at location i to 0
			memory.add( 0);
		}
	}
	
	/**
	 * 
	 * @param address: location on the memory
	 * @return: content on memory
	 */
	public int getFromMemory(int address) {
		
		return (memory.get(address));
	}
	
	public void setMemory(int address, int content) {
		
		memory.set(address, content);
	}
	
	

}
