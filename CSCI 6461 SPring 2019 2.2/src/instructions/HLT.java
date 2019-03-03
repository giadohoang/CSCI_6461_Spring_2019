package instructions;

import registers.Memory;
import registers.Registers;

public class HLT extends Instructions {

	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		//Halt is when instruction ends with 00000000
				if (instruction.substring(0, 6).equals("00000000")) {
					System.out.println("Halt Instruction 00000000");
					System.out.println("Stop the machine");
				}
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		System.out.println("Halt instruction");
		String message = "Halt instruction";
		return "Halt instruction";
	}

	

	
}
