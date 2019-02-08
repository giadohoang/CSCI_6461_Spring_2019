package instructions;

public class UnitConverter {
	
	public static int binaryToInteger(String string) {
		return (Integer.parseInt(string,2));
	}
	
	public static int stringToInteger(String string) {
		return (Integer.parseInt(string));
	}
	
	public static String integerToBinary(int integer) {
		return Integer.toBinaryString(integer);
	}
	
	

}
