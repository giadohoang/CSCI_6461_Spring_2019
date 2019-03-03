package instructions;

public class UnitConverter {

	public static int binaryToInteger(String string) {
		return (Integer.parseInt(string, 2));
	}

	public static int binaryStringToInteger(String string) {
		return (Integer.parseInt(string, 2));
	}

	/**
	 * 
	 * @param integerValue: integer input
	 * @return 16 bit binary
	 * 			The idea here is to get the zero padding by putting a 1 in the 17th
	 *         place of your value, and then use String.substring() to chop off the
	 *         leading 1 this creates, thus always giving you exactly 16 binary
	 *         digits. (This works, of course, only when you are certain that the
	 *         input is a 16-bit number.)
	 */
	public static String integerTo16BitBinary(int integerValue) {
		System.out.println("Return from conversion: " + Integer.toBinaryString(0x10000 | integerValue).substring(1));
		return Integer.toBinaryString(0x10000 | integerValue).substring(1);
	}
	
	public static String integerToExactBinary(int integerValue) {
		return Integer.toBinaryString(integerValue);
	}

}
