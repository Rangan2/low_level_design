package lld_practice.structural.command;

public class User1 {

	public static void main(String args[]) {
		AirConditionar blueStarAc = new AirConditionar();
		RemoteController remoteController = new RemoteController();
		
		ICommand turnOnCommand = new TurnOnCommand(blueStarAc);
		remoteController.setiCommand(turnOnCommand);
		remoteController.pressButton();
		
		ICommand turnOffCommand = new TurnOffCommand(blueStarAc);
		remoteController.setiCommand(turnOffCommand);
		remoteController.pressButton();
	}
}
