package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer{

	private ClockTimer timer;
	
	public DigitalClock(ClockTimer clocktimer) {
		this.timer = clocktimer;
		timer.addObserver(this);
	}
	
	private void draw() {
		int second = timer.getSecond();
		int minute = timer.getMinute();
		int hour = timer.getHour();
		System.out.println(hour + ":" + minute + ":" + second);
	}

	@Override
	public void update(Observable o, Object arg) {
		draw();
	}

}
