package lld_practice.structural.decorator.facade;

public class Projector implements ElectronicDevice{

	private String description;
	private boolean isDvdPlayerConnected;
	
	public Projector(String description) {
		this.description = description;
	}
	
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Turning on Projector !!!");

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Turning off Projector !!!");
	}
	
	public void withDvdPlayer(DvdPlayer dvdPlayer) {
		System.out.println(this.description + " connecting to DVD Player");
		this.isDvdPlayerConnected = true;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.getName();
	}
	
}
