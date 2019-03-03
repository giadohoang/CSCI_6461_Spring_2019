package instructions;

import registers.Memory;
import registers.Registers;

/**
 * 
 * @author
 *
 * 		Shift Register by Count c(r) is shifted left (L/R =1) or right (L/R =
 *         0) either logically (A/L = 1) or arithmetically (A/L = 0) XX, XXX are
 *         ignored Count = 0…15 If Count = 0, no shift occurs
 *
 * 
 */
public class SRC extends Instructions {
	String r, al, lr;
	int count;

	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		// Sanity check from index 0 to 5
		if (!instruction.substring(0, 6).equals("011111")) {
			System.out.println("Error, not a SRC instruction");
		}

		r = instruction.substring(6, 8);
		al = instruction.substring(8, 9);
		lr = instruction.substring(9, 10);
		count = UnitConverter.binaryStringToInteger(instruction.substring(12));

		// if count =0
		if (count == 0) {
			//no shit occur
		} else {
			int registerRxValue = UnitConverter.binaryStringToInteger(register.getGPRj(r));
			/**
			 * A Left Logical Shift of one position moves each bit to the left by one. The
			 * vacant least significant bit (LSB) is filled with zero and the most
			 * significant bit (MSB) is discarded.
			 * 
			 * A Right Logical Shift of one position moves each bit to the right by one. The
			 * least significant bit is discarded and the vacant MSB is filled with zero.
			 */
			// A/L ==1: logically
			if (al.equals("1")) {
				// if L/R == 1: shift c(r) left
				if (lr.equals("1")) {
					registerRxValue = registerRxValue << count;
					System.out.println("al =1, Lr = 1 with shift left");
				}
				// if L/R == 0: shift c(r) right
				else if (lr.equals("0")) {
					if (registerRxValue >= 0) {
						registerRxValue = registerRxValue >>> count;
						// todo right shift with 100000000000000 leading
						System.out.println("al =1, Lr = 0 with registerRxValue >= 0, shift right");
					}

					else {
						registerRxValue = registerRxValue << count;
						System.out.println("al =1, Lr = 0 with shift left");
					}
				}
			}
			/**
			 * A Left Arithmetic Shift of one position moves each bit to the left by one.
			 * The vacant least significant bit (LSB) is filled with zero and the most
			 * significant bit (MSB) is discarded. It is identical to Left Logical Shift.
			 * 
			 * A Right Arithmetic Shift of one position moves each bit to the right by one.
			 * The least significant bit is discarded and the vacant MSB is filled with the
			 * value of the previous (now shifted one position to the right) MSB.
			 * 
			 */
			// A/L ==0: arithmetically
			else {
				// if L/R == 0: shift c(r) right
				if (lr.equals("0")) {
					registerRxValue = registerRxValue >> count;
						System.out.println("al =0, Lr = 0 with shift right");
				}
				// if L/R == 1: shift c(r) left
				else if (lr.equals("1")) {
					registerRxValue = registerRxValue << count;
					System.out.println("al =0, Lr = 1 with shift left");
				}
			}

			register.setGPRj(r, UnitConverter.integerTo16BitBinary(registerRxValue));
			System.out.println("SET GPR(" + r +"), value = " + register.getGPRj(r));
		}
		register.incrementPC();
		printMessage();
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		System.out.println("SRC instruction, r = " + r + ", al = " + al + ", lr = " + lr +", count = " + count);

String message = "SRC instruction, r = " + r + ", al = " + al + ", lr = " + lr +", count = " + count;
return "SRC instruction, r = " + r + ", al = " + al + ", lr = " + lr +", count = " + count;

	}

}
