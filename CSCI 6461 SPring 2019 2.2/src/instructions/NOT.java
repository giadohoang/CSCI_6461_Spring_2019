package instructions;

import registers.Memory;
import registers.Registers;

/**
 * 
 * @author
 *
 * 		Logical Not of Register To Register C(rx) <- NOT c(rx)
 * 
 */
public class NOT extends Instructions {
	String registerX;

	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		if (!instruction.substring(0, 6).equals("011001")) {
			System.out.println("Error, not a NOT instruction");
		} else {
			registerX = instruction.substring(6, 8);
			int registerRxValue = UnitConverter.binaryStringToInteger(register.getGPRj(registerX));
			// Not operation
			// 0 0 1 0 0 1 0 0
			// --> 1 1 0 1 1 0 1 1
			printMessage();
			System.out.println("Before: " + registerRxValue);
			registerRxValue = ~registerRxValue;
			System.out.println("After NOT instruction: " + registerRxValue);
			register.setGPRj(registerX, UnitConverter.integerTo16BitBinary(registerRxValue));
			System.out.println("Set: GPR(" + registerX + ")" + UnitConverter.integerTo16BitBinary(registerRxValue));
			register.incrementPC();
			System.out.println("Increment PC");
		}
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		System.out.println("NOT Instrution: registerX = " + registerX);

String message = "NOT Instrution: registerX = " + registerX;
return "NOT Instrution: registerX = " + registerX;

	}

}
