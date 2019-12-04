package prototype;

public class Kello implements Cloneable{
	private SekuntiViisari sekunti;
	private MinuuttiViisari minuutti;
	private TuntiViisari tunti;
	private int sek = 0, min = 0, h = 0;
	
	public Kello() {
		sekunti = new SekuntiViisari();
		minuutti = new MinuuttiViisari();
		tunti = new TuntiViisari();
	}

	public int getSek() {
		sekunti.addSekunti();
		sek = sekunti.getSekunti();
		return sek;
	}

	public void setSek(int sek) {
		this.sek = sek;
	}

	public int getMin() {
		if (sek == 59) {
			minuutti.addMinuutti();
		}
		min = minuutti.getMinuutti();
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getH() {
		if (min == 59) {
			tunti.addTunti();
		}
		h = tunti.getTunti();
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	public String getAika() {
		String aika = "Kello on " + getH() + ":" + getMin() + ":" + getSek();
		return aika;
	}
	
	public void setAika(int tunti, int minuutti, int sekunti) {
		this.sekunti.setSekunti(sekunti);
		this.minuutti.setMinuutti(minuutti);
		this.tunti.setTunti(tunti);
	}
	
	public Kello clone() {
		Kello kello = null;
		
		try {
			kello = (Kello) super.clone();
			kello.sekunti = (SekuntiViisari) sekunti.clone();
			kello.minuutti = (MinuuttiViisari) minuutti.clone();
			kello.tunti = (TuntiViisari) tunti.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return kello;
	}
	
}
