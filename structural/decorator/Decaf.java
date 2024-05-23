package lld_practice.structural.decorator;

public class Decaf implements Coffee{

	private static final int simpleDecafPrice = 50;

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return simpleDecafPrice;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Simple Decaf Coffee !!";
	}

}
