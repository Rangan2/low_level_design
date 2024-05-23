package lld_practice.structural.command;

public class TurnOffCommand implements ICommand{
	
	private AirConditionar airConditionar;
	
	public TurnOffCommand(AirConditionar airConditionar) {
		this.airConditionar = airConditionar;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Turning off Air Conditionar!!");
		this.airConditionar.turnOff();
	}
	

}
