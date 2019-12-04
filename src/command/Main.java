package command;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Screen screen = new Screen();
		
		Command buttonUp = new PushUpCommand(screen);
		Command buttonDown = new PushDownCommand(screen);
		ScreenButton button1 = new ScreenButton(buttonUp);
		ScreenButton button2 = new ScreenButton(buttonDown);
		
		button1.push();
		button2.push();
		
		
		

		int laskuri = 0;
		Random random = new Random();
		
		for (int i = 0; i < 100000; i++) {
			if (random.nextBoolean() == true) {
				button1.push();
				laskuri++;
			} else {
				button2.push();
				laskuri--;
			}
		}
		System.out.println(laskuri);
	}
}
