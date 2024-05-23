package lld_practice.structural.decorator;

public class SimpleCoffee implements Coffee{

	private static final int simpleDecafPrice = 100;
	
	@Override
	public int getCost() {
		return simpleDecafPrice;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Simple Coffee !!";
	}

}
