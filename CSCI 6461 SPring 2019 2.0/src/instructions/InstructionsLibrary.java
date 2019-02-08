package instructions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Gia
 *This class will store all known instruction with its correspending binary opcode
 *000000 for HLT, 100100 for TRAP, etc.
 *When fetching an instruction, it will extract opcode (indexing 0 to 5) and lookup on this library to find type of instruction
 *Using getter only to avoid any modification
 */
public class InstructionsLibrary {
	
	//Create a hashmap that store all known instructions along with its binary signature
	HashMap<String, String> ListOfInstructions = new HashMap<>();
	public InstructionsLibrary() {
		ListOfInstructions.put("000000", "HLT");
		ListOfInstructions.put("100100", "TRAP");
		ListOfInstructions.put("000001", "LDR");
		ListOfInstructions.put("000010", "STR");
		ListOfInstructions.put("000011", "LDA");
		ListOfInstructions.put("101001", "LDX");
		ListOfInstructions.put("101010", "STX");
		ListOfInstructions.put("001010", "JZ");
		ListOfInstructions.put("001011", "JNE");
		ListOfInstructions.put("001100", "JCC");
		ListOfInstructions.put("001101", "JMA");
		ListOfInstructions.put("001110", "JSR");
		ListOfInstructions.put("001111", "RFS");
		ListOfInstructions.put("010000", "SOB");
		ListOfInstructions.put("010001", "JGE");
		ListOfInstructions.put("000100", "AMR");
		ListOfInstructions.put("000101", "SMR");
		ListOfInstructions.put("000110", "AIR");
		ListOfInstructions.put("000111", "SIR");
		ListOfInstructions.put("010100", "MLT");
		ListOfInstructions.put("010101", "DVD");
		ListOfInstructions.put("010110", "TRR");
		ListOfInstructions.put("010111", "AND");
		ListOfInstructions.put("011000", "ORR");
		ListOfInstructions.put("011001", "NOT");
		ListOfInstructions.put("011111", "SRC");
		ListOfInstructions.put("100000", "RRC");
		ListOfInstructions.put("111101", "IN");
		ListOfInstructions.put("111110", "OUT");
		ListOfInstructions.put("111111", "CHK");
		ListOfInstructions.put("100001", "FADD");
		ListOfInstructions.put("100010", "FSUB");
		ListOfInstructions.put("100011", "VADD");
		ListOfInstructions.put("100100", "VSUB");
		ListOfInstructions.put("100101", "CNVRT");
		ListOfInstructions.put("110010", "LDFR");
		ListOfInstructions.put("110011", "STFR");

		
	}
	
	public boolean hasCode(String opcode) {
		return ListOfInstructions.containsKey(opcode);
	}
	
	public String getCode(String opcode) {
		if(ListOfInstructions.containsKey(opcode)) {
			return ListOfInstructions.get(opcode);
		}
		return null;
	}
}
