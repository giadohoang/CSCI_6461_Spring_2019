package instructions;

import registers.Memory;
import registers.Registers;

public class OUT extends Instructions{
	String r, devID;
	int devIDNum;

	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		// Sanity check from index 0 to 5
		if (!instruction.substring(0, 6).equals("111110")) {
			System.out.println("Error, not a OUT instruction");
		} else {
			r = instruction.substring(6, 8);
			devID = instruction.substring(11);
			printMessage();
			// conver devID to integer
			devIDNum = UnitConverter.binaryStringToInteger(devID);
		/*
		 * Send this value out to console at DevID
		 */
			
			register.incrementPC();
		}
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		System.out.println("OUT Instruction: r = " + r + ", DEVID = " + devID );

String message = "OUT Instruction: r = " + r + ", DEVID = " + devID ;
return  "OUT Instruction: r = " + r + ", DEVID = " + devID;

	}

}
