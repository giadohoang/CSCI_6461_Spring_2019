package instructions;

import registers.Memory;
import registers.Registers;
/**
 * 
 * @author 

Multiply Register by Register
rx, rx+1 <- c(rx) * c(ry)
rx must be 0 or 2
ry must be 0 or 2
rx contains the high order bits, rx+1 contains the low order bits of the result
Set OVERFLOW flag, if overflow

 *
 */
public class MLT extends Instructions{

	String rx, ry;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		if(!instruction.substring(0, 6).equals("010100")) {
			System.out.println("Error, not a MLT instruction");
		}
		
		rx = instruction.substring(6,8);
		ry = instruction.substring(8,10);
		
		int rxValue = UnitConverter.binaryStringToInteger(rx);
		int ryValue = UnitConverter.binaryStringToInteger(ry);
//		rx must be 0 or 2
//		ry must be 0 or 2

		if((rxValue ==0 || rxValue ==2) && (ryValue ==0 || ryValue ==2) ) {
			
			int multiple = UnitConverter.binaryStringToInteger(register.getGPRj(rx)) *  UnitConverter.binaryStringToInteger(register.getGPRj(ry));
			
			if(!register.isOverFlow(multiple) && !register.isUnderFlow(multiple)){
				register.setGPRj(rx, register.getHighOrderBit(multiple));
				
				register.setGPRj(UnitConverter.integerToBinary(rxValue+1), register.getLowOrderBit(multiple));
			}
		}
	}

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		
	}

}
