package execute;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import instructions.Instructions;
import instructions.InstructionsLibrary;
import instructions.UnitConverter;
import registers.Memory;
import registers.Registers;
public class Execute {
	
	static InstructionsLibrary instructionsLibrary = new InstructionsLibrary();
	static Registers register = new Registers();
	static Memory memory = new Memory();
	static Memory memory2 = new Memory();
	
	//String BinaryInstruction1 = "0000011100011110";
//	String BinaryInstruction1a = "0000010100011111";
//	String BinaryInstruction2 = "0000011100011111";
//	String BinaryInstruction3 = "0000011100011111";
//	String BinaryInstruction4 = "0000011100011111";
	
	
	
	
	
	//instructions.LDR.execute(BinaryInstruction, register, memory);
	public void runExecute(String pc) {
		register.setMar(pc);
		System.out.println("Read pc into MAR: " + pc);
		System.out.println("MAR is now: " + register.getMar() +", " + UnitConverter.binaryStringToInteger(register.getMar()));
		//something wrong here
		//System.out.println("Read pc into MAR: " + pc);
		register.setMbr(memory.getFromMemory(UnitConverter.binaryStringToInteger(register.getMar())));
		//System.out.println("M[" + register.getMar() +"]: " + memory.getFromMemory(UnitConverter.binaryStringToInteger(register.getMar())));
		//System.out.println("MBR is now:          " + register.getMbr());
		System.out.println("Set MBR = M[MAR] " + memory.getFromMemory(UnitConverter.binaryStringToInteger(register.getMar())));
		
		decode(register.getMbr());

		
		//		decode(BinaryInstruction1);
//		decode(BinaryInstruction1a);
//		decode(BinaryInstruction2);
//		decode(BinaryInstruction4);
//		decode(BinaryInstruction3);
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
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		//Create a reference to the libary
		Execute execute = new Execute();
		String pc = "0000000000001101";
		System.out.println("Assume we have following value on registers:");
		register.setR0("0111110110111001");
		register.setR1("1000010001101101");
		register.setR2("1000101011001010");
		register.setR3("1010000100101000");
		
		register.setX1("0011011101010101");
		register.setX2("1111111001111001");
		register.setX3("0101101011000000");
		register.setPc(pc);
		register.printRegisterState();
		
		
		execute.runExecute(pc);
		System.out.println("After execution steps, we have:");
		register.printRegisterState();
	}

}
