package ioDevices;
import GUI.FrontEnd;
public class Keyboard {
	FrontEnd frontEnd;
	String input = "";
	
	public Keyboard() {
		frontEnd = new FrontEnd();
	}
	
	public Keyboard(String in) {
		this.input = in;
	
	}
	
	public String getInput() {
	//	input = frontEnd.;
		return input;
	}
	
	public void setInput(String in) {
	
			this.input = in;
		
		
	}
	
	
	
}
