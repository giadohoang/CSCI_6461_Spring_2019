package registers;

/**
 * 
 * @author CSCI 6461 Group This class contains all registers that include on
 *         classical CSCI computer
 */
public class Registers {
	/**
	 * Size: 12 bits
	 * Program Counter: address of next instruction to be executed.
	 * Note that 212 = 409
	 */
	int pc;

	/**
	 * Size: 4 bits
	 * Condition Code: set when arithmetic/logical operations are executed; it has
	 * four 1-bit elements: overflow, underflow, division by zero, equal-or-not.
	 * They may be referenced as cc(0), cc(1), cc(2), cc(3). Or by the names
	 * OVERFLOW, UNDERFLOW, DIVZERO, EQUALORNOT
	 */
	int cc;

	/**
	 * Size: 16 bits
	 * Instruction Register: holds the instruction to be executed
	 */
	int ir;

	/**
	 * Size: 16 bits
	 * Memory Address Register: holds the address of the word to be fetched from memory
	 */
	int mar;

	/**
	 * Size: 16 bits
	 * Memory Buffer Register: holds the word just fetched from or the word to be /last stored into memory
	 */
	int mbr;

	/**
	 * Size: 4 bits
	 * Machine Fault Register: contains the ID code if a machine fault after it occurs
	 */
	int mfr;

	/**
	 * Size: 16 bits
	 * Index Register: contains a base address that supports base register addressing of memory.
	 */
	int x1;

	int x2;

	int x3;

	int x4;

	/**
	 * Size: 16 bits
	 * General Purpose register
	 */

	int r0;
	
	int r1;

	int r2;

	int r3;

	public int getPc() {
		return pc;
	}

	public void setPc(int pc) {
		this.pc = pc;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

	public int getIr() {
		return ir;
	}

	public void setIr(int ir) {
		this.ir = ir;
	}

	public int getMar() {
		return mar;
	}

	public void setMar(int mar) {
		this.mar = mar;
	}

	public int getMbr() {
		return mbr;
	}

	public void setMbr(int mbr) {
		this.mbr = mbr;
	}

	public int getMfr() {
		return mfr;
	}

	public void setMfr(int mfr) {
		this.mfr = mfr;
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getX4() {
		return x4;
	}

	public void setX4(int x4) {
		this.x4 = x4;
	}

	public int getR0() {
		return r0;
	}

	public void setR0(int r0) {
		this.r0 = r0;
	}

	public int getR1() {
		return r1;
	}

	public void setR1(int r1) {
		this.r1 = r1;
	}

	public int getR2() {
		return r2;
	}

	public void setR2(int r2) {
		this.r2 = r2;
	}

	public int getR3() {
		return r3;
	}

	public void setR3(int r3) {
		this.r3 = r3;
	}
	
	//Increment program counter pc
	public void incrementPC(){
		this.pc++;
	}
	
	//Find the content of the index register (IX) with its number corresponding to the input
	public int getIndexRegisterj(int input) {
		switch (input) {
		//register X1
		case 1:
			return x1;
			//register X2	
		case 2:
			return x2;
			//register X3
		case 3:
			return x3;
		
			//0 value indicate NO indexing
		default:
			return 0;
		
		}
	}
	
	//Find the content of the index register (IX) with its number corresponding to the input
		public void setIndexRegisterj
		(int xj, int input) {
			switch (xj) {
			//register X1
			case 1:
			 this.x1 = input;
				//register X2	
			case 2:
				this.x2 = input;
				//register X3
			default:
				this.x3 = input;
			
			
			}
		}
	
		
		//Find the content of the GPRs (Rj) with its number corresponding to the input
		//
		public int getGPRj(int input) {
			switch (input) {
			//register R0
			case 0:
				return r0;
			
			//register R1
			case 1:
				return r1;
				//register R2	
			case 2:
				return r2;
				//register R3
			default:
				return r3;
			}
	}

		/**
		 * 
		 * @param generalPurposeRegister: determine which GPR register to move data into
		 * @param value: value to store in GPR
		 */
		public void setGPRj(int generalPurposeRegister, int value) {
			// TODO Auto-generated method stub
			switch (generalPurposeRegister) {
			//register R0
			case 0:
				this.r0 = value;
			//register R1
			case 1:
				this.r1 = value;
				//register R2	
			case 2:
				this.r2 = value;
				//register R3
			default:
				this.r3 = value;
			}
		}


}
