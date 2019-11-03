package observer;

import java.util.Observable;

public class ClockTimer extends Observable{

	private int second;
	private int minute;
	private int hour;
	
	public ClockTimer(int second, int minute, int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	void tick() {
		this.second++;
		if (this.second > 59) {
			this.second = 0;
			this.minute++;
			if (this.minute > 59) {
				this.minute = 0;
				this.hour++;
				if (this.hour > 23) {
					this.hour = 0;
				}
			}
		}
		setChanged();
		notifyObservers();
	}
	
}
