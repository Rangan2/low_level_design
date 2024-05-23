package lld_practice.structural.decorator.facade;

public class HomeTheaterFacade {

	private Amplifier amplifier;
	private Tuner tuner;
	private DvdPlayer dvdPlayer;
	private Projector projector;
	private Screen screen;
	
	public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, Projector projector, Screen screen) {
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.projector = projector;
		this.screen = screen;
	}
	
	public void watchMovie(Amplifier amplifier, Projector projector, DvdPlayer dvdPlayer, Screen screen) {
		amplifier.on();
		dvdPlayer.on();
		projector.on();
		screen.on();
		System.out.println("Movie Stated Playing !!!");
	}
	
	public void endMovie(Amplifier amplifier, Projector projector, DvdPlayer dvdPlayer, Screen screen) {
		System.out.println("Movie Stopped Playing !!!");
		
		System.out.println("Amplifier Turning off !!!");
		amplifier.off();

		System.out.println("Dvd Player Turning off !!!");
		dvdPlayer.off();

		System.out.println("Projector Turning off !!!");
		projector.off();
		
		System.out.println("Screen Turning off !!!");
		screen.off();
		
	}
}
