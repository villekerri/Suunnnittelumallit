package prototype;

public class MinuuttiViisari implements  Cloneable{

	private int minuutti = 0;

	public int getMinuutti() {
		return minuutti;
	}

	public void setMinuutti(int minuutti) {
		this.minuutti = minuutti;
	}
	
	public void addMinuutti() {
		if (minuutti == 59) {
			minuutti = 0;
		} else {
			minuutti++;
		}
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}