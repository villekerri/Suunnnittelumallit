package prototype;

public class SekuntiViisari implements  Cloneable{

	private int sekunti = 0;

	public int getSekunti() {
		return sekunti;
	}

	public void setSekunti(int sekunti) {
		this.sekunti = sekunti;
	}
	
	public void addSekunti() {
		if (sekunti == 59) {
			sekunti = 0;
		} else {
			sekunti++;
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
