package instructions;

import registers.Memory;
import registers.Registers;


/**
 * 
 * @author Traps to memory address 0, which contains the address of a table in
 *         memory. Stores the PC+1 in memory location 2. The table can have a
 *         maximum of 16 entries representing 16 routines for user-specified
 *         instructions stored elsewhere in memory. Trap code contains an index
 *         into the table, e.g. it takes values 0 – 15. When a TRAP instruction
 *         is executed, it goes to the routine whose address is in memory
 *         location 0, executes those instructions, and returns to the
 *         instruction stored in memory location 2. The PC+1 of the TRAP
 *         instruction is stored in memory location 2.
 *
 */
public class TRAP extends Instructions {
	String trapCode = "";
	int trapValue = 0;

	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		trapCode = instruction.substring(12);
		trapValue = UnitConverter.binaryStringToInteger(trapCode);
		// invalid trap code
		if (trapValue > 15 || trapValue < 0) {
			int value = InstructionsLibrary.MachineFaultCode.ILLEGAL_TRAP_CODE.getFaultValue();
			String message = InstructionsLibrary.MachineFaultCode.ILLEGAL_TRAP_CODE.getFaultMessage();
			System.out.println("ILLEGAL TRAP CODE: message-" + message + ", value = " + value);
		}
		/*
		 * store current pc into memory location 2
		 */
		// store memory location 2 into MAR
		register.setMAR("0000000000000010");
		// calculate PC +1
		int temp = UnitConverter.binaryStringToInteger(register.getPC()) + 1;
		// store into MBR
		register.setMBR(UnitConverter.integerTo16BitBinary(temp));
		// store into memory
		memory.setCache(UnitConverter.binaryStringToInteger(register.getMAR()), register.getMBR());

		/*
		 * fetches the address from Location 0 (Trap) or 1 (Machine Fault) into the PC
		 * which becomes the next instruction to be executed. This address will be the
		 * first instruction of a routine which handles the trap or machine fault.
		 */
		// This case, it is a trap -> fetches the address from location 0
		register.setMAR("0000000000000000");
		// store address of the first instruction of the routine
		register.setMBR(memory.getFromCache(UnitConverter.binaryStringToInteger(register.getMAR())));
		// parse this address into PC
		register.setPC(register.getMBR());

		// perform the routine ?
		while(!register.getIR().equals("0000000000000000")) {
			register.setMAR(register.getPC());
			
			register.setMBR(memory.getFromCache(UnitConverter.binaryStringToInteger(register.getMAR())));
			
			register.setIR(register.getMBR());
			
			String fetchedInstruction = register.getIR();
			String opcode = fetchedInstruction.substring(0, 6);
			Instructions newInstruction;
			try {
				newInstruction = (Instructions) Class.forName("instructions." + opcode).newInstance();
				System.out.println(newInstruction.getClass());
				newInstruction.execute(fetchedInstruction, register, memory);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		

		// AFter the routine is finished
		// returns to the instruction stored in memory location 2. The PC+1 of the TRAP
		// instruction is stored in memory location 2.
		register.setMAR("0000000000000010");
		
		register.setMBR(memory.getFromCache(UnitConverter.binaryStringToInteger(register.getMAR())));
		
		register.setPC(register.getMBR());
		
		printMessage();
		System.out.println("Next PC after routine: " + register.getPC());
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		System.out.println("Trap Instruction, trap code = " + trapCode);

String message = "Trap Instruction, trap code = " + trapCode;
return "Trap Instruction, trap code = " + trapCode;

	}

}
