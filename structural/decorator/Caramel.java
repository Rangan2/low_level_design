package lld_practice.structural.decorator;

public class Caramel implements ToppingsDecorator{

	private static final int caramelAddonPrice = 5;
	Coffee coffee;
	
	public Caramel(Coffee coffee) {
		// TODO Auto-generated constructor stub
		this.coffee = coffee;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.coffee.getCost() + caramelAddonPrice;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.coffee.getDescription() + " with Caramel";
	}

}
