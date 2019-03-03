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
				System.out.println("Immediate = 0, do nothing");
			} else {
				int difference = UnitConverter.binaryStringToInteger(register.getGPRj(r)) - immediateValue;

				if (!register.isOverFlow(difference) && !register.isUnderFlow(difference)) {
					System.out.println("No over/ under flow");
					register.setGPRj(r, UnitConverter.integerTo16BitBinary(difference));
					System.out.println("Set GPR(" + r +"), value = " + UnitConverter.integerTo16BitBinary(difference));
				}

				else {
					String currentConditionalCode = register.getCC();
					char[] currentConditionalCodeChars = currentConditionalCode.toCharArray();
					// set cc(0) =1
					// if over flow
					if (register.isOverFlow(difference)) {
						
						currentConditionalCodeChars[0] = '1';
						currentConditionalCode = String.valueOf(currentConditionalCodeChars);
						// Set overflow flag on condition code
						register.setCC(currentConditionalCode);
						// register.setCc();
						System.out.println("Over flow, set CC = " + register.getCC());
					}

					// set cc(1) =1
					// if under flow
					else {
						currentConditionalCodeChars[1] = '1';
						currentConditionalCode = String.valueOf(currentConditionalCodeChars);
						// Set overflow flag on condition code
						register.setCC(currentConditionalCode);
						// register.setCc();
						System.out.println("Under flow, set CC = " + register.getCC());
					}
				}
			}

		}
		printMessage();
		register.incrementPC();
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		System.out.println("SIR instruction: r = " + r + ", immediate = " + immediate);

String message = "SIR instruction: r = " + r + ", immediate = " + immediate;
return "SIR instruction: r = " + r + ", immediate = " + immediate;

	}

}
