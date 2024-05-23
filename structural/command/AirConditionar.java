package lld_practice.structural.command;

public class AirConditionar {

	private boolean isTurnOn = false;
	
	public void turnOn() {
		this.isTurnOn = true;
		System.out.println("Air Conditionar Turned On !!!");
	}
	
	public void turnOff() {
		this.isTurnOn = false;
		System.out.println("Air Conditionar Turned Off !!!");
	}
}
