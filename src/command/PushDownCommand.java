package command;

public class PushDownCommand implements Command {
	private Screen screen;

	public PushDownCommand(Screen screen) {
		this.screen = screen;
	}
	
	@Override
	public void execute() {
		screen.moveDown();
	}

}
