package instructions;

import registers.Memory;
import registers.Registers;

/**
 * 
 * @author
 *
 * 		Subtract Immediate from Register, r = 0..3 r <-- c(r) - Immed Note:
 *         1. if Immed = 0, does nothing 2. if c(r) = 0, loads r1 with –(Immed)
 *         IX and I are ignored in this instruction
 * 
 */
public class SIR extends Instructions {
	String r, immediate;

	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		if (!instruction.substring(0, 6).equals("000111")) {
			System.out.println("Error, not a SIR instruction");
		}

		else {

			// r: Register number. From index 6 to 7
			// Specifies one of four general purpose registers; may be referred to by R0 –
			// R3
			r = instruction.substring(6, 8);
			immediate = instruction.substring(11);
			int immediateValue = UnitConverter.binaryStringToInteger(immediate);

			if (immediateValue == 0) {
				// do nothing
			} else {
				int difference = UnitConverter.binaryStringToInteger(register.getGPRj(r)) - immediateValue;

				if (!register.isOverFlow(difference) && !register.isUnderFlow(difference)) {
					register.setGPRj(r, UnitConverter.integerToBinary(difference));
				}

				else {
					String currentConditionalCode = register.getCc();
					char[] currentConditionalCodeChars = currentConditionalCode.toCharArray();
					// set cc(0) =1
					// if over flow
					if (register.isOverFlow(difference)) {
						currentConditionalCodeChars[0] = '1';
						currentConditionalCode = String.valueOf(currentConditionalCodeChars);
						// Set overflow flag on condition code
						register.setCc(currentConditionalCode);
						// register.setCc();
					}

					// set cc(1) =1
					// if under flow
					else {
						currentConditionalCodeChars[1] = '1';
						currentConditionalCode = String.valueOf(currentConditionalCodeChars);
						// Set overflow flag on condition code
						register.setCc(currentConditionalCode);
						// register.setCc();
					}
				}
			}

		}
		register.incrementPC();
	}

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub

	}

}
