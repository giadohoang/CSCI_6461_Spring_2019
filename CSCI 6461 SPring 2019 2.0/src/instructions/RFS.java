package instructions;

import registers.Memory;
import registers.Registers;

/**
 * 
 * @author
 *
 * 		Return From Subroutine w/ return code as Immed portion (optional)
 *         stored in the instruction’s address field. R0 <- Immed; PC <- c(R3)
 *         IX, I fields are ignored.
 * 
 */
public class RFS extends Instructions {
	String r, ix, i, address;

	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// Sanity check from index 0 to 5
		if (!instruction.substring(0, 6).equals("001111")) {
			System.out.println("Error, not a RFS instruction");
		}
		// If it is a load instruction
		// Extract r,x,i, and effective address (EA)
		else {
			//IX, I fields are ignored
			
			//extract immediate from index 11 to end from the instruction
			String immed = instruction.substring(11);
			//R0 <- Immed
			register.setR0(immed);
			// PC <- c(R3)
			register.setPc(register.getR3());
			

		}
	}

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub

	}

}
