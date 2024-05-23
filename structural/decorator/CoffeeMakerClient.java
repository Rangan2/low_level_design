package lld_practice.structural.decorator;

public class CoffeeMakerClient {

	public static void main(String args[]) {
		Coffee simpleCoffee = new Caramel(new SimpleCoffee());
		System.out.println("Simple Coffee Price: " + simpleCoffee.getCost());
		
		Coffee decafCoffee = new Caramel(new Decaf());
		System.out.println("Decaf Coffee Price: "+decafCoffee.getCost());
	}
}
