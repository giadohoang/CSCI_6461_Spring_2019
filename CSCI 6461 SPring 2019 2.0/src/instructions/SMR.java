package instructions;

import registers.Memory;
import registers.Registers;
/**
 * 
 * @author 
 *
 *Subtract Memory From Register, r = 0..3
r <- c(r) – c(EA)

 */
public class SMR extends Instructions{
	String r,ix,i,address;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//Sanity check from index 0 to 5
				if(!instruction.substring(0, 6).equals("000101")) {
					System.out.println("Error, not a SMR instruction");
				}
				//If it is a load instruction
				//Extract r,x,i, and effective address (EA)
				else {
					
					//r: Register number. From index 6 to 7
					//Specifies one of four general purpose registers; may be referred to by R0 – R3
					r=instruction.substring(6, 8);


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
					//keep effective address into MAR
					register.setMar(effectiveAddress);
					
					//keep content from memory at address stored in MAR
					register.setMbr(memory.getFromMemory(UnitConverter.binaryStringToInteger(register.getMar())));
					
					//Calculate the sum betwwen value stored in MBR + value stored in general register R (extracted from instruction above)
					int difference = UnitConverter.binaryStringToInteger(register.getGPRj(r)) - UnitConverter.binaryStringToInteger(register.getMbr());
					
					if(!register.isOverFlow(difference) &&  !register.isUnderFlow(difference)) {
						//store sum value back to general register R
						register.setGPRj(r, UnitConverter.integerToBinary(difference));
					}
					else {
						String currentConditionalCode = register.getCc();
						char[] currentConditionalCodeChars = currentConditionalCode.toCharArray();
						//set cc(0) =1
						//if over flow
						if(register.isOverFlow(difference)) {
						currentConditionalCodeChars[0] = '1';
						currentConditionalCode = String.valueOf(currentConditionalCodeChars);
						//Set overflow flag on condition code
						register.setCc(currentConditionalCode);
						//register.setCc();
						}
						
						//set cc(1) =1
						//if under flow
						else {
							currentConditionalCodeChars[1] = '1';
							currentConditionalCode = String.valueOf(currentConditionalCodeChars);
							//Set overflow flag on condition code
							register.setCc(currentConditionalCode);
							//register.setCc();
						}
					}
					
					register.incrementPC();
					}
					
					
	}

	@Override
	public void printMessage() {
		// TODO Auto-generated method stub
		
	}

}
