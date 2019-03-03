package instructions;

import registers.Memory;
import registers.Registers;
/**
 * 
 * @author
 *Jump If Condition Code
cc replaces r for this instruction
cc takes values 0, 1, 2, 3 as above and specifies the bit in the Condition Code Register to check;
If cc bit  = 1, PC <-- EA 
Else PC <- PC + 1

 */
public class JCC extends Instructions{
	
	int ccBit =0;
	String r,ix,i,cc,address;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		
		// TODO Auto-generated method stub
				//Sanity check from index 0 to 5
				if(!instruction.substring(0, 6).equals("001100")) {
					System.out.println("Error, not a JCC instruction");
				}
				//If it is a load instruction
				//Extract r,x,i, and effective address (EA)
				else {
					printMessage();
					//r: Register number. From index 6 to 7
					//Specifies one of four general purpose registers; may be referred to by R0 – R3
					//this case we use cc instead of r
					cc=instruction.substring(6, 8);


					//Specifies one of three index registers; may be referred to by X1 – X3. O value indicates no indexing.
					//The value of IX is used to select an index register and to specify indirect addressing:
					//00			No Indexing
					//01			Index Register 1
					//10			Index Register 2
					//11			Index Register 3
					ix = instruction.substring(8,10);


					//If I =1, specifies indirect addressing; otherwise, no indirect addressing.
					i=instruction.substring(10, 11);

					/**
					 * Computing the Effective Address:
											Effective Address (EA) = 
					if I field = 0: 
								// NO indirect addressing			
								if  IX = 00, EA = contents of the Address field
								// just indexing
								if IX = 1..3, c(Xj) + contents of the Address field, where j = c(IX)
								// that is, the IX field has an index register number, the contents of which are added to the contents of the address field
					
					if I field  = 1: 
								
								// indirect addressing, but NO indexing
								if IX = 00, c(Address)
								
								// both indirect addressing and indexing
								if IX = 1..3, c(c(Xj) + Address), where j = c(IX)

					 */
					//Specifies one of 32 locations
					address = instruction.substring(11);
					
					String effectiveAddress = instructions.ComputingEffectiveAddress.computeEffectiveAddress(i, ix, address, register,memory);
					System.out.println("EA = " + effectiveAddress);
					
					ccBit = UnitConverter.binaryStringToInteger(cc);
					
					if(ccBit == 1) {
						System.out.println("ccBit = 1, set PC <- Effective Address");
						register.setPC(effectiveAddress);
					}
					else {
						System.out.println("ccBit != 1, increment PC");
						register.incrementPC();
					}
					
				}
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		System.out.println("JCC instruction: cc = " + cc + ", ix = " + ix +", i = " + i + ", ccBit = "+ ccBit);
		String message = "JCC instruction: cc = " + cc + ", ix = " + ix +", i = " + i + ", ccBit = "+ ccBit;
		return "JCC instruction: cc = " + cc + ", ix = " + ix +", i = " + i + ", ccBit = "+ ccBit;
	}

}
