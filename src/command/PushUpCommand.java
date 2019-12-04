package command;

public class PushUpCommand implements Command {
	private Screen screen;

	public PushUpCommand(Screen screen) {
		this.screen = screen;
	}
	
	@Override
	public void execute() {
		screen.moveUp();
	}

}
