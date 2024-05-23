package lld_practice.structural.decorator.facade;

public class Screen implements ElectronicDevice{

	private String description;
	private boolean isScreenConnected;
	
	public Screen(String description) {
		this.description = description;
	}
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Turning on Screen !!!");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Turning on Screen !!!");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.description;
	}
	
	public void up() {
		System.out.println(this.description + " going up !!!");
		this.isScreenConnected = true;
	}

}
