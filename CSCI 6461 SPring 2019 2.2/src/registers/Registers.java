package registers;

import instructions.UnitConverter;

/**
 * 
 * @author CSCI 6461 Group This class contains all registers that include on
 *         classical CSCI computer
 */
public class Registers {

	/**
	 * Size: 12 bits Program Counter: address of next instruction to be executed.
	 * Note that 2^12 = 4096
	 */
	String pc;

	/**
	 * Size: 4 bits Condition Code: set when arithmetic/logical operations are
	 * executed; it has four 1-bit elements: overflow, underflow, division by zero,
	 * equal-or-not. They may be referenced as cc(0), cc(1), cc(2), cc(3). Or by the
	 * names OVERFLOW, UNDERFLOW, DIVZERO, EQUALORNOT
	 * 0000, 1000, 0100, 0010, 0001, etc
	 */
	String cc;

	/**
	 * Size: 16 bits Instruction Register: holds the instruction to be executed
	 */
	String ir;

	/**
	 * Size: 16 bits Memory Address Register: holds the address of the word to be
	 * fetched from memory
	 */
	String mar;

	/**
	 * Size: 16 bits Memory Buffer Register: holds the word just fetched from or the
	 * word to be /last stored Stringo memory
	 */
	String mbr;

	/**
	 * Size: 4 bits Machine Fault Register: contains the ID code if a machine fault
	 * after it occurs
	 */
	String mfr;

	/**
	 * Size: 16 bits Index Register: contains a base address that supports base
	 * register addressing of memory.
	 */
	String x1;

	String x2;

	String x3;

	String x4;

	/**
	 * Size: 16 bits General Purpose register
	 */

	String r0;

	String r1;

	String r2;

	String r3;
	
	 public boolean isInvalidInput() {
			return invalidInput;
		}

		public void setInvalidInput(boolean invalidInput) {
			this.invalidInput = invalidInput;
		}

		public String getInvalidReg() {
			return invalidReg;
		}

		public void setInvalidReg(String invalidReg) {
			this.invalidReg = invalidReg;
		}

		//out of boundary mark
	    boolean outOfBound = false;
	    
	    //out of boundary variable list
	    String outOfBoundReg = "";
	    
	    //The variable indicates invalid value for setting register value
	    boolean invalidInput = false;
	    
	    //The variable indicates register with invalid input value
	    String invalidReg = "";
	    
	    /**
	     * initializing registers
	     */
	    public Registers() {
	    	this.x1 = "0000000000000000";
	    	this.x2 = "0000000000000000";
	    	this.x3 = "0000000000000000";
	    	this.x4 = "0000000000000000";
	    	this.r0 = "0000000000000000";
	    	this.r1 = "0000000000000000";
	    	this.r2 = "0000000000000000";
	    	this.r3 = "0000000000000000";
	    	this.mar = "0000000000000000";
	    	this.mbr = "0000000000000000";
	    	this.pc = "000000000000";
	    	this.cc = "0000";
	    	this.ir = "0000000000000000";
	    	this.mfr = "0000";
	    }
	    
	    /**
	     * set 
	     * @param str
	     */
	    public void setZERO(String str) {
	    	x1 = "0000000000000000";
	        x2 = "0000000000000000";
	        x3 = "0000000000000000";
	        x4 = "0000000000000000";
	        r0 = "0000000000000000";
	        r1 = "0000000000000000";
	        r2 = "0000000000000000";
	        r3 = "0000000000000000";
	        mar = "0000000000000000";
	        mbr = "0000000000000000";
	        pc = "000000000000";
	        cc = "0000";
	        ir = "0000000000000000";
	        mfr = "0000";
	    }
	    

	public String getPC() {
		return pc;
	}

	public void setPC(String pc) {
		this.pc = pc;
    	//check if value of PC is out of boundary or contains invalid characters
    /*	if(pc.length()>12) {
        	outOfBound = true;
        }
        for (int i=0; i<pc.length();i++) {
			if (pc.charAt(i)!='0' && pc.charAt(i)!='1') {
				invalidInput = true;
				invalidReg = "PC";
				return;
			}
		}
        while(pc.length()<12) {
        	pc = "0" + pc;
		}
        //zero extend value of PC, and deliver it to MAR
    	this.pc = pc;*/
	}

	public String getCC() {
		return cc;
	}

	public void setCC(String cc) {
		this.cc = cc;
		//check if input is out of boundary
		/*	if (cc.length()>4) {
			outOfBound = true;
			outOfBoundReg = "CC ";
			return;
		}
    	//check if input value contains invalid charaters 
    	for (int i=0; i<cc.length();i++) {
			if (cc.charAt(i)!='0'&&cc.charAt(i)!='1') {
				invalidInput = true;
				invalidReg = "cc";
				return;
			}
		}
    	//zero extend input string when its length is less than standard
        while(cc.length()<4) {
        	cc = "0" + cc;
		}
        invalidInput = false;
        outOfBound = false;
        this.cc = cc;*/
	}

	public String getIR() {
		return ir;
	}

	public void setIR(String ir) {
		this.ir = ir;
		/*	if (ir.length()>16) {
			outOfBound = true;
			outOfBoundReg = "IR ";
			return;
		}
    	for (int i=0; i<ir.length();i++) {
			if (ir.charAt(i)!='0'&&ir.charAt(i)!='1') {
				invalidInput = true;
				invalidReg = "IR";
				return;
			}
		}
        while(ir.length()<16) {
        	ir = "0" + ir;
		}
        invalidInput = false;
        outOfBound = false;
        this.ir = ir;*/
	}

	public String getMAR() {
		return mar;
	}

	public void setMAR(String mar) {
		this.mar = mar;
	/*	if (mar.length()>16) {
			outOfBound = true;
			outOfBoundReg = "MAR ";
			return;
		}
    	for (int i=0; i<mar.length();i++) {
			if (mar.charAt(i)!='0'&&mar.charAt(i)!='1') {
				invalidInput = true;
				invalidReg = "MAR";
				return;
			}
		}
        while(mar.length()<16) {
        	mar = "0" + mar;
		}
        invalidInput = false;
        outOfBound = false;
        this.mar = mar;*/
	}

	public String getMBR() {
		return mbr;
	}

	public void setMBR(String mbr) {
		this.mbr = mbr;
	/*	if (mbr.length()>16) {
			outOfBound = true;
			outOfBoundReg = "MBR ";
			return;
		}
    	for (int i=0; i<mbr.length();i++) {
			if (mbr.charAt(i)!='0'&&mbr.charAt(i)!='1') {
				invalidInput = true;
				invalidReg = "MBR";
				return;
			}
		}
        while(mbr.length()<16) {
        	mbr = "0" + mbr;
		}
        invalidInput = false;
        outOfBound = false;
        this.mbr = mbr;*/
	}

	public String getMFR() {
		return mfr;
	}

	public void setMFR(String mfr) {
		this.mfr = mfr;
	/*	if (mfr.length()>4) {
			outOfBound = true;
			outOfBoundReg = "MFR ";
			return;
		}
    	for (int i=0; i<mfr.length();i++) {
			if (mfr.charAt(i)!='0'&&mfr.charAt(i)!='1') {
				invalidInput = true;
				invalidReg = "MFR";
				return;
			}
		}
        while(mfr.length()<4) {
        	mfr = "0" + mfr;
		}
        invalidInput = false;
        outOfBound = false;
        this.mfr = mfr;*/
	}

	public String getX1() {
		return x1;
	}

	public void setX1(String x1) {
		this.x1 = x1;
		/*	if (x1.length()>16) {
			outOfBound = true;
			outOfBoundReg = "X1 ";
			return;
		}
    	for (int i=0; i<x1.length();i++) {
			if (x1.charAt(i)!='0'&&x1.charAt(i)!='1') {
				invalidInput = true;
				invalidReg = "X1";
				return;
			}
		}
        while(x1.length()<16) {
			x1 = "0" + x1;
		}
        invalidInput = false;
        outOfBound = false;
        this.x1 = x1;*/
	}

	public String getX2() {
		return x2;
	}

	public void setX2(String x2) {
		this.x2 = x2;
		/*	if (x2.length()>16) {
			outOfBound = true;
			outOfBoundReg = "X2 ";
			return;
		}
    	for (int i=0; i<x2.length();i++) {
			if (x2.charAt(i)!='0'&&x2.charAt(i)!='1') {
				invalidInput = true;
				invalidReg = "X2";
				return;
			}
		}
        while(x2.length()<16) {
			x2 = "0" + x2;
		}
        invalidInput = false;
        outOfBound = false;
        this.x2 = x2;*/
	}

	public String getX3() {
		return x3;
	}

	public void setX3(String x3) {
		this.x3 = x3;
	/*	if (x3.length()>16) {
			outOfBound = true;
			outOfBoundReg += "X3";
			return;
		}
    	for (int i=0; i<x3.length();i++) {
			if (x3.charAt(i)!='0'&&x3.charAt(i)!='1') {
				invalidInput = true;
				invalidReg = "X3";
				return;
			}
		}
        while(x3.length()<16) {
			x3 = "0" + x3;
		}
        invalidInput = false;
        outOfBound = false;
        this.x3 = x3;*/
	}

	public String getX4() {
		return x4;
	}

	public void setX4(String x4) {
		this.x4 = x4;
	/*	if (x4.length()>16) {
			outOfBound = true;
			outOfBoundReg += "X4";
			return;
		}
    	for (int i=0; i<x4.length();i++) {
			if (x4.charAt(i)!='0'&&x4.charAt(i)!='1') {
				invalidInput = true;
				invalidReg = "X4";
				return;
			}
		}
        while(x4.length()<16) {
        	x4 = "0" + x4;
		}
        invalidInput = false;
        outOfBound = false;
        this.x4 = x4; */
	}

	public String getR0() {
		return r0;
	}

	public void setR0(String r0) {
		this.r0 = r0;
	   /*	if (r0.length()>16) {
				outOfBound = true;
				outOfBoundReg += "R0";
				return;
			}
	    	for (int i=0; i<r0.length();i++) {
				if (r0.charAt(i)!='0'&&r0.charAt(i)!='1') {
					invalidInput = true;
					invalidReg = "R0";
					return;
				}
			}
	        while(r0.length()<16) {
				r0 = "0" + r0;
			}
	        invalidInput = false;
	        outOfBound = false;
	        this.r0 = r0;*/
	}

	public String getR1() {
		return r1;
	}

	public void setR1(String r1) {
		this.r1 = r1;
	/*	if (r1.length()>16) {
			outOfBound = true;
			outOfBoundReg += "R1";
			return;
		}
    	for (int i=0; i<r1.length();i++) {
			if (r1.charAt(i)!='0'&&r1.charAt(i)!='1') {
				invalidInput = true;
				invalidReg = "R1";
				return;
			}
		}
        while(r1.length()<16) {
			r1 = "0" + r1;
		}
        invalidInput = false;
        outOfBound = false;
        this.r1 = r1;*/
	}

	public String getR2() {
		return r2;
	}

	public void setR2(String r2) {
		this.r2 = r2;
	/*	if (r2.length()>16) {
			outOfBound = true;
			outOfBoundReg += "R2";
			return;
		}
    	for (int i=0; i<r2.length();i++) {
			if (r2.charAt(i)!='0'&&r2.charAt(i)!='1') {
				invalidInput = true;
				invalidReg = "R2";
				return;
			}
		}
        while(r2.length()<16) {
			r2 = "0" + r2;
		}
        invalidInput = false;
        outOfBound = false;
        this.r2 = r2;*/
	}

	public String getR3() {
		return r3;
	}

	public void setR3(String r3) {
		this.r3 = r3;
	/*	if (r3.length()>16) {
			outOfBound = true;
			outOfBoundReg += "R3";
			return;
		}
    	for (int i=0; i<r3.length();i++) {
			if (r3.charAt(i)!='0'&&r3.charAt(i)!='1') {
				invalidInput = true;
				invalidReg = "R3";
				return;
			}
		}
        while(r3.length()<16) {
			r3 = "0" + r3;
		}
        invalidInput = false;
        outOfBound = false;
        this.r3 = r3;*/
	}

	// Increment program counter pc
	public void incrementPC() {
		int temp = UnitConverter.binaryStringToInteger(pc);
		temp++;
		pc = UnitConverter.integerTo16BitBinary(temp);
	}

	// Find the content of the index register (IX) with its number corresponding to
	// the input
	public String getIndexRegisterj(String input) {
		switch (input) {
		// register X1
		case "01":
			return x1;
		// register X2
		case "10":
			return x2;
		// register X3
		case "11":
			return x3;

		// 0 value indicate NO indexing
		default:
			return "0";

		}
	}

	// Find the content of the index register (IX) with its number corresponding to
	// the input
	public void setIndexRegisterj(String xj, String input) {
		switch (xj) {
		// register X1
		case "01":
			this.x1 = input;
			break;
			// register X2
		case "10":
			this.x2 = input;
			break;
			// register X3
		default:
			this.x3 = input;
			break;

		}
	}

	// Find the content of the GPRs (Rj) with its number corresponding to the input
	//
	public String getGPRj(String input) {
		switch (input) {
		// register R0
		case "00":
			return r0;

		// register R1
		case "01":
			return r1;
		// register R2
		case "10":
			return r2;
		// register R3
		default:
			return r3;
		}
	}

	/**
	 * 
	 * @param generalPurposeRegister:
	 *            determine which GPR register to move data Stringo
	 * @param value:
	 *            value to store in GPR
	 */
	public void setGPRj(String generalPurposeRegister, String value) {
		// TODO Auto-generated method stub
		switch (generalPurposeRegister) {
		// register R0
		case "00":
			this.r0 = value;
			break;
			// register R1
		case "01":
			this.r1 = value;
			break;
			// register R2
		case "10":
			this.r2 = value;
			break;
			// register R3
		default:
			this.r3 = value;
			break;
		}
	}

	public boolean isOverFlow(int number){
		return (number > 32768);
	}
	
	public boolean isUnderFlow(int number){
		return (number < -32767);
	}
	
	public void printRegisterState() {
		System.out.print("X1: " + x1 + " | X2 " + x2 + " | X3 " + x3 + " | X4 " + x4 + "\n" + "R0: " + r0 + " | R1: "
				+ r1 + " | R2: " + r2 + " | R3: " + r3 + "\n" + "MAR: " + mar + " | MBR: " + mbr + "\n" + "PC: " + pc
				+ " | CC: " + cc + " | IR: " + ir + " | MFR: " + mfr);
		System.out.println();
	}

	public String getHighOrderBit(int multiple) {
		// TODO Auto-generated method stub
		return UnitConverter.integerTo16BitBinary(multiple >> 16);
	}

	public String getLowOrderBit(int multiple) {
		// TODO Auto-generated method stub
		
		return UnitConverter.integerTo16BitBinary(multiple & 0xFFFF);
	}

	  public String help() {
	    	return 	"Instruction of setting value for registers(input value must be binary sequence):\nSET + space + Register name(Uppercase limited) + space + value\nDUMP\n" +
	    			"e.g. SET R0 1\n DUMP\n is used to set value of R0 to 1\n\n" +
	    			"Instruction of setting value for PC(input value must be binary sequence):\nSET + space + PC(Uppercase limited) + space + value\nDUMP\n" +
	    			"e.g. SET PC 1\n DUMP\n is used to set value of PC to 1\n\n" +
	    			"Instruction of setting all values to zero : \nSET + space + ZERO + space + 0\nDUMP\n" +
	    			"e.g. SET ZERO 0\n DUMP\n is used to set value of all registers to 0\n\n" +
	    			"Instruction of running a specific instruction (input value must be 16 BIT binary sequence):\nRUN + space + instruction(16 bit binary sequence only)\nDUMP\n" +
	    			"e.g. RUN 0000010101111111\n DUMP\n is executing this instruction\n\n" +
	    			"Instrutions of store a specific instruction(must be a 16bit binary sequence)\n into any address of memory(also in binary sequence):\n" +
	    			"STI + space + 16 bits Instruction + space + any legal address of memory(0-2047, in binary)\n" +
	    			"e.g. STI 0000010100100111 1110\nDUMP\n is to store the 16 bits instruction into memory location of 1110\n\n" +
	    			"Instruction of inquiring instrcution: HELP\n";
	    }

	    public String dump() {
	    	if (this.outOfBound) {
				return "input for " + outOfBoundReg + " is out of boundary, please enter a binary sequence with valid length.\n";
			}
	    	if (this.invalidInput) {
				return "input for " + invalidReg + " is invalid, please enter a BINARY sequence.\n";
			}
	        return "X1: " + x1 + " | X2 " + x2 + " | X3 " + x3 + " | X4 " + x4 + "\n" +
	                "R0: " + r0 + " | R1: " + r1 +" | R2: " + r2 +" | R3: " + r3 + "\n" +
	                "MAR: " + mar + " | MBR: " + mbr + "\n" +
	                "PC: " + pc + " | CC: " + cc + " | IR: " + ir + " | MFR: " + mfr + "\n" + 
	                "Memory content in MAR: " + mbr;
	        		
	    }
}
