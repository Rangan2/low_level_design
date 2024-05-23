package lld_practice.structural.command;

public class TurnOnCommand implements ICommand{
	
	private AirConditionar airConditionar;
	
	public TurnOnCommand(AirConditionar airConditionar) {
		this.airConditionar = airConditionar;
	}

	@Override
	public void execute() {
		System.out.println("Turning on Air Conditionar!!");
		this.airConditionar.turnOn();
	}

}
