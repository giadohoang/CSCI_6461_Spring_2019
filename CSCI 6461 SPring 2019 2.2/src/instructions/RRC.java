package instructions;

import registers.Memory;
import registers.Registers;

/**
 * 
 * @author
 *
 *
 * 		Rotate Register by Count c(r) is rotated left (L/R = 1) or right (L/R
 *         =0) either logically (A/L =1) XX, XXX is ignored Count = 0…15
 * 
 */
public class RRC extends Instructions {
	String al, lr, r, result, left, right;
	
	int count, registerRxValue;

	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		// Sanity check from index 0 to 5
		if (!instruction.substring(0, 6).equals("100000")) {
			System.out.println("Error, not a RRC instruction");
		}
		
		else {
			r = instruction.substring(6, 8);
			al = instruction.substring(8, 9);
			lr = instruction.substring(9, 10);
			count = UnitConverter.binaryStringToInteger(instruction.substring(12));
			registerRxValue = UnitConverter.binaryStringToInteger(register.getGPRj(r));
			printMessage();
			if(count == 0) { 
				//no rotate occur
				System.out.println("Count = 0, no rotate occur");
			}
			else {
				//if value in register Rx is positive, its leading binary is 0
		//		if(registerRxValue >= 0)
		//			result = result.replace("0000000000000000", "");
		//		if(registerRxValue < 0)
		//			result = result.replace("1111111111111111", "");
				
				if(lr.equals("1")) {
					//c(r) is rotated left
					left = result.substring(count);
					right = result.substring(0, count);
					result = left+right;
					System.out.println("lr = 1, result = " + result);
				}
				
				else if(lr.equals("0")) {
					//c(r) is rotated right
					left = result.substring(0, 16- count);
					right = result.substring(16-count);
					result = left+right;
					System.out.println("lr = 0, result = " + result);
				}
				
				register.setGPRj(r, result);
				System.out.println("Set GPR(" + r + "), with value = " + result);
			}
			
			register.incrementPC();
			System.out.println("Increment pointer");
		}
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		System.out.println("RRC Instruction: r = " + r + ", al = " + al + ", lr = " + lr + ", count = " + count);

String message = "RRC Instruction: r = " + r + ", al = " + al + ", lr = " + lr + ", count = " + count;
return "RRC Instruction: r = " + r + ", al = " + al + ", lr = " + lr + ", count = " + count;

	}

}
