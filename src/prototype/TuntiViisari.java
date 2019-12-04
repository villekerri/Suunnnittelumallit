package prototype;

public class TuntiViisari implements  Cloneable{

	private int tunti = 0;

	public int getTunti() {
		return tunti;
	}

	public void setTunti(int tunti) {
		this.tunti = tunti;
	}
	
	public void addTunti() {
		if (tunti == 23) {
			tunti = 0;
		} else {
			tunti++;
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