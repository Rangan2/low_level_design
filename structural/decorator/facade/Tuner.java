package lld_practice.structural.decorator.facade;

public class Tuner implements ElectronicDevice{
	
	private String description;
	
	public Tuner(String description) {
		this.description = description;
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Turning on Tuner !!!");

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Turning off Tuner !!!");

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.description;
	}

}
