package instructions;

import registers.Memory;
import registers.Registers;

public class ComputingEffectiveAddress {
	UnitConverter unitConverter = new UnitConverter();

	public static String computeEffectiveAddress(String i, String ix, String address, Registers register, Memory memory) {
		System.out.println("Start calculating Effective Address: I= " + i + ", IX= " + ix + ", Address= " + address);
		//try {
		//	Thread.sleep(2000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
	//	}
		
		String ea = "";
		//No indirect addressing
		if (UnitConverter.binaryStringToInteger(i) == 0) {
			//If IX =00; EA = contents of the address field
			if(UnitConverter.binaryStringToInteger(ix)==0) {
				//ea = Integer.toString(UnitConverter.binaryToInteger(address));
				ea = address;
			}
			//if IX = 1..3, c(Xj) + contents of the Address field, where j = c(IX)
			// that is, the IX field has an index register number, the contents of which are added to the contents of the address field
				
			else {
				ea = UnitConverter.integerTo16BitBinary((UnitConverter.binaryToInteger(register.getIndexRegisterj(ix)) + UnitConverter.binaryToInteger(address)));
			}

		}
		//Indirect addressing is set
		//Move the content of the ALU result into the MAR and fetch again
		//MBR will now have contents which is the EA. Put this into temp reg
		else if ( UnitConverter.binaryStringToInteger(i)  == 1) {
			//Indirect addressing, but no indexing
			if(UnitConverter.binaryStringToInteger(ix)  == 0) {
				//fetch the contents of the memory address location specified by address
				ea = memory.getFromMemory(UnitConverter.binaryToInteger(address));
				register.setMAR(address);
				register.setMBR(ea);
			}
			//both indirect addressing and indexing
			else {
				//??? content of content of ( address + content of (ix)) result;
				//ea = content of content of( address + Xj)
				//ea = memory address add location (address + Xj)
				
				ea =memory.getFromMemory(UnitConverter.binaryToInteger(register.getIndexRegisterj(ix)) + UnitConverter.binaryToInteger(address));
				register.setMAR(Integer.toString((UnitConverter.binaryToInteger(register.getIndexRegisterj(ix)) + UnitConverter.binaryToInteger(address))));
				register.setMBR(ea);
			}
		}


		System.out.println("Finish calculating Effective Address= " + ea);
		return ea;
	} 

}
