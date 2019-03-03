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

	String registerX , registerY ;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		if(!instruction.substring(0, 6).equals("010100")) {
			System.out.println("Error, not a MLT instruction");
		}
		else {
		//extracted binary value
		registerX = instruction.substring(6,8);
		registerY = instruction.substring(8,10);
		
		int rxValue = UnitConverter.binaryStringToInteger(registerX);
		int ryValue = UnitConverter.binaryStringToInteger(registerY);
//		rx must be 0 or 2
//		ry must be 0 or 2

		if((rxValue ==0 || rxValue ==2) && (ryValue ==0 || ryValue ==2) ) {
			printMessage();
			int multiple = UnitConverter.binaryStringToInteger(register.getGPRj(registerX)) *  UnitConverter.binaryStringToInteger(register.getGPRj(registerY));
			
			if(!register.isOverFlow(multiple) && !register.isUnderFlow(multiple)){
				register.setGPRj(registerX, register.getHighOrderBit(multiple));
				
				register.setGPRj(UnitConverter.integerToExactBinary(rxValue+1), register.getLowOrderBit(multiple));
			}
		}
		register.incrementPC();
	}
}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		System.out.println("MLT instruction: registerX = " + registerX + ", registerY = "+ registerY);

String message = "MLT instruction: registerX = " + registerX + ", registerY = "+ registerY;
return "MLT instruction: registerX = " + registerX + ", registerY = "+ registerY;

	}

}
