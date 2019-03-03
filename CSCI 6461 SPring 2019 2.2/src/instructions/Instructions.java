package instructions;

import registers.Memory;
import registers.Registers;

/**
 * 
 * @author CSCI 6461 group
 * Abstract class for all instructions
 * Load, Store, Jump, Return, Subtract, Add, Multiply, Divide, Test, Logical
 * 
 */

public abstract class Instructions {

	

	
	/**
	 * 
	 * @param instruction: input from user in binary
	 * Different instruction will use different part of this instruction input to determine Opcode, R, IX, I, and Address
	 * 
	 * @param register: Taken opcode from the register to determine type of intruction and call corresponding registers
	 */
	public abstract void execute(String instruction, Registers register, Memory memory);
	
	/**
	 * For debugging purpose
	 * Print String message
	 * @return 
	 */
	public abstract String printMessage();
}
