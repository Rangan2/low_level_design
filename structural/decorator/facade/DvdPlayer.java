package lld_practice.structural.decorator.facade;

public class DvdPlayer implements ElectronicDevice{

	private String description;
	private boolean movieLoaded;
	
	public DvdPlayer(String description) {
		// TODO Auto-generated constructor stub
		this.description = description;
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Turning on DvdPlayer !!!");

	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Turning on DvdPlayer !!!");

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.description;
	}
	
	public void loadMovie(String movieName) {
		this.movieLoaded = true;
		System.out.println("Movie Loading Completed !!!");
	}
	
	public void play() {
		if(this.movieLoaded) {
			System.out.println(this.description + " playing movie !!!");
		}else {
			System.out.println(this.description + " no movie loaded !!!");
		}
	}
	
	public void stop() {
		System.out.println(description + " stopping movie !!!");
		this.movieLoaded = false;
	}
	
	public void eject() {
		if(this.movieLoaded) {
			this.movieLoaded = false;
			System.out.println(this.description + " ejecting movie !!!");
		}
	}
}
