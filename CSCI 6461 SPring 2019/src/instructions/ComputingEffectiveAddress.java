package instructions;

import registers.Memory;
import registers.Registers;

public class ComputingEffectiveAddress {

	public static int computeEffectiveAddress(int i, int ix, int address, Registers register, Memory memory) {
		int ea=0;
		//No indirect addressing
		if (i == 0) {
			//If IX =00; EA = contents of the address field
			if(ix==0) {
				ea = address;
			}
			//if IX = 1..3, c(Xj) + contents of the Address field, where j = c(IX)
			// that is, the IX field has an index register number, the contents of which are added to the contents of the address field
				
			else {
				ea = register.getIndexRegisterj(ix) + address;
			}

		}
		//Indirect addressing is set
		//Move the content of the ALU result into the MAR and fetch again
		//MBR will now have contents which is the EA. Put this into temp reg
		else if (i == 1) {
			//Indirect addressing, but no indexing
			if(ix ==0) {
				//fetch the contents of the memory address location specified by address
				ea = memory.getFromMemory(address);
				register.setMar(address);
				register.setMbr(ea);
			}
			//both indirect addressing and indexing
			else {
				//??? content of content of ( address + content of (ix)) result;
				//ea = content of content of( address + Xj)
				//ea = memory address add location (address + Xj)
				
				ea = memory.getFromMemory(register.getIndexRegisterj(ix) + address);
				register.setMar(register.getIndexRegisterj(ix) + address);
				register.setMbr(ea);
			}
		}



		return ea;
	} 

}
