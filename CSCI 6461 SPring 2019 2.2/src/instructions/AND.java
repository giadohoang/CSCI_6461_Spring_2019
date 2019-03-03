package instructions;

import registers.Memory;
import registers.Registers;
/**
 * 
 * @author
 * 
 * Logical And of Register and Register
c(rx) <- c(rx) AND c(ry)

 *
 */
public class AND extends Instructions{
String rx, ry;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		if(!instruction.substring(0, 6).equals("010111")) {
			System.out.println("Error, not a AND instruction");
		}
		
		rx = instruction.substring(6,8);
		ry = instruction.substring(8,10);
		int registerRxValue = UnitConverter.binaryStringToInteger(register.getGPRj(rx));
		int registerRyValue = UnitConverter.binaryStringToInteger(register.getGPRj(ry));
		/**
		 *int a = 4;
		 *int b = 7;
		 *System.out.println(a & b);
		 * ->prints 4
		 *meaning in an 32 bit system
		 *00000000 00000000 00000000 00000100
		 *00000000 00000000 00000000 00000111
		 *===================================
		 *00000000 00000000 00000000 00000100
		 */
		register.setGPRj(rx, UnitConverter.integerTo16BitBinary(registerRxValue & registerRyValue));
		
		
		register.incrementPC();
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		String message = "AND instruction, RegisterX = " + rx + ", RegisterY = " + ry;
		return "AND instruction, RegisterX = " + rx + ", RegisterY = " + ry;
	}

}
