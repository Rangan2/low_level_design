package lld_practice.structural.command;

public class RemoteController {

	private ICommand iCommand;

	public RemoteController() {
	}

	public void setiCommand(ICommand iCommand) {
		this.iCommand = iCommand;
	}
	
	public void pressButton() {
		this.iCommand.execute();
	}
	
}
