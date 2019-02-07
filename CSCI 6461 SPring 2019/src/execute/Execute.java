package execute;
import instructions.Instructions;
import instructions.InstructionsLibrary;
import registers.Memory;
import registers.Registers;
public class Execute {
	
	static InstructionsLibrary instructionsLibrary = new InstructionsLibrary();
	static Registers register = new Registers();
	static Memory memory = new Memory();
	String BinaryInstruction1 = "0000011100011111";
	String BinaryInstruction1a = "0000011100011111";
	String BinaryInstruction2 = "0000011100011111";
	String BinaryInstruction3 = "0000011100011111";
	String BinaryInstruction4 = "0000011100011111";
	
	
	
	//instructions.LDR.execute(BinaryInstruction, register, memory);
	public void runExecute() {
		decode(BinaryInstruction1);
		decode(BinaryInstruction1a);
		decode(BinaryInstruction2);
	
	//	decode(BinaryInstruction4);
	//	decode(BinaryInstruction3);
	}
	
	public void decode(String binaryInstruction) {
		System.out.println("Instruction: "+binaryInstruction);
		String opcode = binaryInstruction.substring(0, 6);
		opcode = instructionsLibrary.getCode(opcode);
		Instructions instruction;
		try {
			instruction = (Instructions) Class.forName("instructions." +opcode).newInstance();
			System.out.println(instruction.getClass());
			instruction.execute(binaryInstruction, register, memory);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a reference to the libary
		Execute execute = new Execute();
		execute.runExecute();
		//Try a binary instruction as input
		
	/*	
		
		//extract opcode as from index 0 to 5
		String opCode = BinaryInstruction.substring(0,6);
		
		//Find type of intruction from opCode
		String typeOfInstruction = "";
		if(instructionsLibrary.hasCode(opCode)) {
			typeOfInstruction = instructionsLibrary.getCode(opCode);
		};
		try {
			Instructions instruction = (Instructions) Class.forName("instructions.LDR").newInstance();
			System.out.println("Run instructions.LDR");
			
			//instruction.execute(instruction, register, memory);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
//		Instructions instruction = Class.forName("" + typeOfInstruction)
		
	}

}
