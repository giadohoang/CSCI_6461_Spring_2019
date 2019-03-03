package instructions;

import registers.Memory;
import registers.Registers;
/**
 * 
 * @author 
 *
 *
 *Divide Register by Register
rx, rx+1 <- c(rx)/ c(ry)
rx must be 0 or 2
rx contains the quotient; rx+1 contains the remainder
ry must be 0 or 2
If c(ry) = 0, set cc(3) to 1 (set DIVZERO flag)

 */
public class DVD extends Instructions{
	String registerX, registerY;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if(!instruction.substring(0, 6).equals("010101")) {
					System.out.println("Error, not a DVD instruction");
				}
				//binary value extracted
				registerX = instruction.substring(6,8);
				registerY = instruction.substring(8,10);
				
				//value in real number
				int rxValue = UnitConverter.binaryStringToInteger(registerX);
				
				int ryValue = UnitConverter.binaryStringToInteger(registerY);
//				rxValue must be 0 or 2
//				ryValue must be 0 or 2

				if((rxValue ==0 || rxValue ==2) && (ryValue ==0 || ryValue ==2) ) {
					
					if(UnitConverter.binaryStringToInteger(register.getGPRj(registerY)) ==0) {
						//Divide by zero, set flag on CC
						String currentConditionalCode = register.getCC();
						char[] currentConditionalCodeChars = currentConditionalCode.toCharArray();
						currentConditionalCodeChars[2] = '1';
						currentConditionalCode = String.valueOf(currentConditionalCodeChars);
						// Set div zero flag on condition code
						register.setCC(currentConditionalCode);
						// register.setCc();
					}
					
					else {
						int quotent = (int) UnitConverter.binaryStringToInteger(register.getGPRj(registerX)) /
								UnitConverter.binaryStringToInteger(register.getGPRj(registerY));
						int remainder = (int) UnitConverter.binaryStringToInteger(register.getGPRj(registerX)) %
								UnitConverter.binaryStringToInteger(register.getGPRj(registerY));
						register.setGPRj(registerX, UnitConverter.integerTo16BitBinary(quotent));
						
						register.setGPRj(UnitConverter.integerToExactBinary(rxValue +1), UnitConverter.integerTo16BitBinary(remainder));
						
					}
					
					register.incrementPC();
				}

	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		String message = "DVD instruction, RegisterX = " + registerX + ", RegisterY = " + registerY;
		return "DVD instruction, RegisterX = " + registerX + ", RegisterY = " + registerY;
	}

}
