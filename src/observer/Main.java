package observer;

public class Main {
	public static void main(String[] args) {
		ClockTimer timer = new ClockTimer(0, 0, 0);
		DigitalClock dClock = new DigitalClock(timer);
		
		for (int i = 0; i < 86400; i++) {
			try {
				Thread.sleep(1000);
				timer.tick();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
