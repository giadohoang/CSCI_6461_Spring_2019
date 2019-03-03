package instructions;

import registers.*;
import instructions.Instructions;
import instructions.InstructionsLibrary;

public class Execution {
    private InstructionsLibrary instructionsLibrary;
    private Registers registers;
    private Memory memory;
    
    public Execution() {
        this.instructionsLibrary = new InstructionsLibrary();
        this.registers = new Registers();
        this.memory = new Memory();
    }
    
    /**
     * read instruction from PC and execute the instruction
     * @param none
     * @return none
     */
    public void execute(){
     //   String instruction = RDI();
     //   this.execute(instruction);
    }
    
    /**
     * execute instructions
     * @param binaryInstruction : input binary instructions 
     * @return none
     */
    public void execute(String binaryInstruction) {
        System.out.println("Instruction: "+ binaryInstruction);
        String opcode = binaryInstruction.substring(0, 6);
        //get opcode
        opcode = instructionsLibrary.getCode(opcode);
        Instructions instruction;
        //dispatch different instructions to different methods
        try {
            instruction = (Instructions) Class.forName("instructions." +opcode).newInstance();
            System.out.println(instruction.getClass());
            instruction.execute(binaryInstruction, this.registers, this.memory);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
    
    /**
     * get all of the registers
     * @param none
     * @return none
     */
    public Registers getRegisters() {
        return this.registers;
    }
    
    /**
     * get all of memory
     * @param none
     * @return none
     */
    public Memory getMemory() {
        return this.memory;
    }
    
    /**
     * store instructions into specific address of memory
     * @param instruction: input binary instructions
     * @param addr: specific address of memory
     * @return none
     */
   // public void STI(String instruction, String addr){
      //  int index = UnitConverter.binaryToInteger(addr);
      //  for(char t: instruction.toCharArray()){
     //       this.memory.setMemory(index, t+"");
    //        index += 1;
   //     }
  //  }
    
    /**
     * read instructions from PC
     * @param none
     * @return none
     */
    public String RDI(){
        int index = UnitConverter.binaryToInteger(this.registers.getPC());
        //read instructions from memory and store it in a string
        String res = "";
       // for(int i = 0; i < 16; i++){
       //     res += this.memory.getFromMemory(index+i);
        res = this.memory.getFromMemory(index);
       // }
        return res;
    }
}
