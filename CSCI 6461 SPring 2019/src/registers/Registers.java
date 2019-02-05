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
	String pc;

	/**
	 * Size: 4 bits
	 * Condition Code: set when arithmetic/logical operations are executed; it has
	 * four 1-bit elements: overflow, underflow, division by zero, equal-or-not.
	 * They may be referenced as cc(0), cc(1), cc(2), cc(3). Or by the names
	 * OVERFLOW, UNDERFLOW, DIVZERO, EQUALORNOT
	 */
	String cc;

	/**
	 * Size: 16 bits
	 * Instruction Register: holds the instruction to be executed
	 */
	String ir;

	/**
	 * Size: 16 bits
	 * Memory Address Register: holds the address of the word to be fetched from memory
	 */
	String mar;

	/**
	 * Size: 16 bits
	 * Memory Buffer Register: holds the word just fetched from or the word to be /last stored into memory
	 */
	String mbr;

	/**
	 * Size: 4 bits
	 * Machine Fault Register: contains the ID code if a machine fault after it occurs
	 */
	String mfr;

	/**
	 * Size: 16 bits
	 * Index Register: contains a base address that supports base register addressing of memory.
	 */
	String x1;

	String x2;

	String x3;

	String x4;

	/**
	 * Size: 16 bits
	 * General Purpose register
	 */

	String r0;
	
	String r1;

	String r2;

	String r3;

	public String getPc() {
		return pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getIr() {
		return ir;
	}

	public void setIr(String ir) {
		this.ir = ir;
	}

	public String getMar() {
		return mar;
	}

	public void setMar(String mar) {
		this.mar = mar;
	}

	public String getMbr() {
		return mbr;
	}

	public void setMbr(String mbr) {
		this.mbr = mbr;
	}

	public String getMfr() {
		return mfr;
	}

	public void setMfr(String mfr) {
		this.mfr = mfr;
	}

	public String getX1() {
		return x1;
	}

	public void setX1(String x1) {
		this.x1 = x1;
	}

	public String getX2() {
		return x2;
	}

	public void setX2(String x2) {
		this.x2 = x2;
	}

	public String getX3() {
		return x3;
	}

	public void setX3(String x3) {
		this.x3 = x3;
	}

	public String getX4() {
		return x4;
	}

	public void setX4(String x4) {
		this.x4 = x4;
	}

	public String getR0() {
		return r0;
	}

	public void setR0(String r0) {
		this.r0 = r0;
	}

	public String getR1() {
		return r1;
	}

	public void setR1(String r1) {
		this.r1 = r1;
	}

	public String getR2() {
		return r2;
	}

	public void setR2(String r2) {
		this.r2 = r2;
	}

	public String getR3() {
		return r3;
	}

	public void setR3(String r3) {
		this.r3 = r3;
	}


}
