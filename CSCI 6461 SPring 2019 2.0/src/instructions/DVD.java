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
	String rx, ry;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if(!instruction.substring(0, 6).equals("010101")) {
					System.out.println("Error, not a DVD instruction");
				}
				
				rx = instruction.substring(6,8);
				ry = instruction.substring(8,10);
				
				int rxValue = UnitConverter.binaryStringToInteger(rx);
				int ryValue = UnitConverter.binaryStringToInteger(ry);
//				rx must be 0 or 2
//				ry must be 0 or 2

				if((rxValue ==0 || rxValue ==2) && (ryValue ==0 || ryValue ==2) ) {
				}
	}

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		
	}

}
