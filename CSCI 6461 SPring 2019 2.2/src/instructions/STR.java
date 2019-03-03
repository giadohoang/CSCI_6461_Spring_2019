package instructions;

import registers.Memory;
import registers.Registers;

public class STR extends Instructions {

	String r,ix,address,i;
	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		//Sanity check from index 0 to 5
				if(!instruction.substring(0, 6).equals("000010")) {
					System.out.println("Error, not a Store register to Memory - STR instruction");
				}
				//If it is a store instruction
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
					
					//Specifies one of 32 locations
					address = instruction.substring(11);
					
					String effectiveAddress = instructions.ComputingEffectiveAddress.computeEffectiveAddress(i, ix, address, register,memory);
					System.out.println("EA = " + effectiveAddress);
					
					//Move content of temp reg into the MAR. Temp reg now contains EA
					register.setMAR(effectiveAddress);
					System.out.println("Move content of temp reg into the MAR. Temp reg now contains EA: " + register.getMAR());
					
					//Move the contents of the reg to be store into the MBR
					System.out.println("Move the contents of the reg to be store into the MBR, before: " + register.getMBR());
					register.setMBR(register.getGPRj(r));
					System.out.println("Move the contents of the reg to be store into the MBR, after " + register.getMBR());
					
					//Store M[MAR] = MBR;
					
					memory.setMemory(UnitConverter.binaryStringToInteger(register.getMAR()), register.getMBR());
					//memory.getFromMemory(UnitConverter.stringToInteger(register.getMar())
					//signature: memory.getFromMemory( int address)
					System.out.println("Store M[MAR] = MBR: location" + register.getMAR() + ", content: " + memory.getFromMemory(UnitConverter.binaryStringToInteger(register.getMAR())));
					register.incrementPC();
					printMessage();
				}
				
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		System.out.println("STR instruction, R: " + r + ", IX: " + ix + ", address: " + address + ", I: " + i  );

String message = "STR instruction, R: " + r + ", IX: " + ix + ", address: " + address + ", I: " + i;
return "STR instruction, R: " + r + ", IX: " + ix + ", address: " + address + ", I: " + i;

	}

}
