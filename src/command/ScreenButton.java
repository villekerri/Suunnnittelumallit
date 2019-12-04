package command;

public class ScreenButton {
	Command cmd;
	
	public ScreenButton(Command cmd) {
		this.cmd = cmd;
	}
	
	public void push() {
		cmd.execute();
	}
}
