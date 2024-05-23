package lld_practice.structural.decorator.facade;

public class Amplifier implements ElectronicDevice{
	private String description;

	public Amplifier(String description) {
		this.description = description;
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Turning on Amplifier !!!");
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Turning off Amplifier !!!");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.description;	
}

}
