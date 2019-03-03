package instructions;

import org.omg.CORBA.SystemException;

import registers.Memory;
import registers.Registers;

/**
 * 
 * @author
 *
 * 		Test the Equality of Register and Register If c(rx) = c(ry), set
 *         cc(4) <- 1; else, cc(4) <- 0
 * 
 */
public class TRR extends Instructions {
	String registerX , registerY ;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		if(!instruction.substring(0, 6).equals("010110")) {
			System.out.println("Error, not a TRR instruction");
		}
		
		registerX = instruction.substring(6,8);
		System.out.println("rx: " + registerX);
		registerY = instruction.substring(8,10);
		System.out.println("ry: " + registerY);
		
		//int rxValue = UnitConverter.binaryStringToInteger(rx);
		//int ryValue = UnitConverter.binaryStringToInteger(ry);
		
		if(UnitConverter.binaryStringToInteger(register.getGPRj(registerX)) == UnitConverter.binaryStringToInteger(register.getGPRj(registerY)) ) {
			String currentConditionalCode = register.getCC();
			char[] currentConditionalCodeChars = currentConditionalCode.toCharArray();
			currentConditionalCodeChars[3] = '1';
			System.out.println("set cc[3] = " +1);
			currentConditionalCode = String.valueOf(currentConditionalCodeChars);
			// Set div zero flag on condition code
			register.setCC(currentConditionalCode);
			// register.setCc();
		}
		else {
			String currentConditionalCode = register.getCC();
			char[] currentConditionalCodeChars = currentConditionalCode.toCharArray();
			currentConditionalCodeChars[3] = '0';
			System.out.println("set cc[3] = " + 0);
			currentConditionalCode = String.valueOf(currentConditionalCodeChars);
			// Set div zero flag on condition code
			register.setCC(currentConditionalCode);
			// register.setCc();
		}
		
		register.incrementPC();
		printMessage();
		System.out.println("Increment register: PC = " + register.getPC());
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		System.out.println("TRR instruction: registerX = " + registerX + ", registerY = " + registerY);

String message = "TRR instruction: registerX = " + registerX + ", registerY = " + registerY;
return "TRR instruction: registerX = " + registerX + ", registerY = " + registerY;

	}

}
