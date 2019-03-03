package instructions;

import registers.Memory;
import registers.Registers;

public class LDR extends Instructions{
	String r,ix,i,address;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		//Sanity check from index 0 to 5
		if(!instruction.substring(0, 6).equals("000001")) {
			System.out.println("Error, not a LDR instruction");
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
			System.out.println("Address from instruction = " + address);
			String effectiveAddress = instructions.ComputingEffectiveAddress.computeEffectiveAddress(i, ix, address, register,memory);
			System.out.println("EA = " + effectiveAddress);
			printMessage();
			//Move content of temp reg into the MAR. Temp reg now contains EA
			register.setMAR(effectiveAddress);
			System.out.println("Move content of temp reg into the MAR. Temp reg now contains EA: " + register.getMAR());
			String temp = register.getMAR();
			System.out.println("temp = " + temp);
			int location = UnitConverter.binaryStringToInteger(temp);
			System.out.println("location = " + location);
			String valueLocation = memory.getFromMemory(location);
			System.out.println(valueLocation);
			//Fetch M[MAR] into MBR
			register.setMBR(memory.getFromMemory(UnitConverter.binaryStringToInteger(temp)));
			//register.setMbr(memory.getFromMemory(20));
			System.out.println("get from memory at M[getMar]: " + memory.getFromMemory(UnitConverter.binaryStringToInteger(register.getMAR())));
			System.out.println("Fetch M[MAR] into MBR: " + register.getMBR());
			
			//Move MAR into temp reg one of the GPRs
			//register.setGPRj(r, register.getMBR());
			register.setGPRj(r, memory.getFromMemory(UnitConverter.binaryStringToInteger(effectiveAddress)));
			//System.out.println("Move MAR into temp reg one of the GPRs: at register" + r + ", content: " + register.getMBR());
			System.out.println("Move MAR into temp reg one of the GPRs: at register" + r + ", content: " + register.getGPRj(r));
			
			
		}

	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		System.out.println("LDR instruction, R: " + r + ", IX: " + ix + ", address: " + address + ", I: " + i  );
		

String message = "LDR instruction, R: \" + r + \", IX: \" + ix + \", address: \" + address + \", I: \" + i ";
return "LDR instruction, R: " + r + ", IX: " + ix + ", address: " + address + ", I: " + i;


	}

}
