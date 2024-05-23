package lld_practice.structural.decorator.facade;

public class Client {

	public static void main(String args[]) {
		Amplifier amplifier = new Amplifier(" BS Electronics Amplifier");
		DvdPlayer dvdPlayer = new DvdPlayer("Elsa Electronics");
		Projector projector = new Projector("BenQ Projectors");
		Screen screen = new Screen("Moniz  Projectro Screen");
		Tuner tuner = new Tuner("Tuner");
		HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, dvdPlayer, projector, screen);
		homeTheaterFacade.watchMovie(amplifier, projector, dvdPlayer, screen);
		System.out.println("");
		System.out.println("=======================================");
		System.out.println("");
		homeTheaterFacade.endMovie(amplifier, projector, dvdPlayer, screen);
	}
}
