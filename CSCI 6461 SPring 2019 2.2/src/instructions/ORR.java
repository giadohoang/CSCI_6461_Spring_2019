package instructions;

import registers.Memory;
import registers.Registers;
/**
 * 
 * @author
 *
 *Logical Or of Register and Register
c(rx) <- c(rx) OR c(ry)

 */
public class ORR extends Instructions{
	String registerX , registerY ;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if(!instruction.substring(0, 6).equals("011000")) {
					System.out.println("Error, not a ORR instruction");
				}else {
				
				registerX = instruction.substring(6,8);
				registerY = instruction.substring(8,10);
				
			
				int registerRxValue = UnitConverter.binaryStringToInteger(register.getGPRj(registerX));
				int registerRyValue = UnitConverter.binaryStringToInteger(register.getGPRj(registerY));
				/**
				 *int a = 4;
				 *int b = 7;
				 *System.out.println(a | b);
				 * ->prints 4
				 *meaning in an 32 bit system
				 *00000000 00000000 00000000 00000100
				 *00000000 00000000 00000000 00100111
				 *===================================
				 *00000000 00000000 00000000 00100111
				 */
				printMessage();
				register.setGPRj(registerX, UnitConverter.integerTo16BitBinary(registerRxValue | registerRyValue));
				System.out.println("Set GPR(" + registerX+ ") value of " + UnitConverter.integerTo16BitBinary(registerRxValue | registerRyValue));
				
				register.incrementPC();
				System.out.println("Increment PC: " + register.getPC());
				}
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		System.out.println("ORR Instruction: registerX = " + registerX + ", registerY = " + registerY);

String message = "ORR Instruction: registerX = " + registerX + ", registerY = " + registerY;
return "ORR Instruction: registerX = " + registerX + ", registerY = " + registerY;

	}

}
