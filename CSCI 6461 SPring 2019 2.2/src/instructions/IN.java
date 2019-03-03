package instructions;

import registers.Memory;
import registers.Registers;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

import ioDevices.*;
/**
 * 
 * @author CSCI 6461 Group Input Character To Register from Device, r = 0..3
 */
public class IN extends Instructions {
	Keyboard keyboard;
	Printer printer;
	String r, devID;
	int devIDNum;
	String input ="";
	String output ="";

	@Override
	public void execute(String instruction, Registers register, Memory memory) {
		// TODO Auto-generated method stub
		// Sanity check from index 0 to 5
		if (!instruction.substring(0, 6).equals("111101")) {
			System.out.println("Error, not a IN instruction");
		} else {
			printMessage();
			r = instruction.substring(6, 8);
			devID = instruction.substring(11);
			// conver devID to integer
			devIDNum = UnitConverter.binaryStringToInteger(devID);
			
			//if devIDNum = 0: input character to register from Console Keyboard
			if(devIDNum == instructions.InstructionsLibrary.DevID.KEYBOARD.getValue() ) {
				System.out.println("IN instruction: DEVID = 0, console keyboard");
				input = keyboard.getInput();
				int temp =0;
				try {
					temp = Integer.parseInt(input);
				}
				catch(NumberFormatException e) {
					System.out.println("Not an integer");
				}
				register.setGPRj(r, UnitConverter.integerTo16BitBinary(temp));
				
			}
			//if devIDNum = 1: input character to register from Console Printer
			else if( devIDNum == instructions.InstructionsLibrary.DevID.PRINTER.getValue()) {
				System.out.println("IN instruction: DEVID = 1, console Printer");
				output = printer.getOutput();
				int temp = 0;
				try {
					temp = Integer.parseInt(output);
				}
				catch(NumberFormatException e) {
					System.out.println("Not an integer");
				}
				register.setGPRj(r, UnitConverter.integerTo16BitBinary(temp));
				
			}
			//if devIDNum = 2: input character to register from Card Reader
			else if(devIDNum == instructions.InstructionsLibrary.DevID.CARDREADER.getValue()) {
				System.out.println("IN instruction: DEVID = 2, console card reader");
			}
			//if devIDNum = 3 - 31: input character to register from Console Registers, switches, etc
			else {
				System.out.println("IN instruction: DEVID = 3 ->31, console registers, switches, etc. ");
			}
			
			register.incrementPC();
		}
	}

	@Override
	public String printMessage() {
		// TODO Auto-generated method stub
		System.out.println("IN instruction: Input Character To Register from Device, r = 0..3");
		String message = "IN instruction: Input Character To Register from Device, r = 0..3";
		return "IN instruction: Input Character To Register from Device, r = " + r + ", DEVID = " + devID;
		
	}

}
