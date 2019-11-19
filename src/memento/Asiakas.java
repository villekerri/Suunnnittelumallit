package memento;

public class Asiakas {
	private String nimi;
	private Object memento;
	private int arvaus;
	
	public Asiakas(String nimi) {
		this.nimi = nimi;
	}
	
	public String getNimi() {
		return nimi;
	}

	public void liityPeliin(Arvuuttaja arvuuttaja) {
		this.memento = arvuuttaja.liityPeliin();
	}
	
	public void arvaa(Arvuuttaja arvuuttaja, int arvaus) {
		this.arvaus = arvaus;
		arvuuttaja.arvaa(memento, this.arvaus);
	}
}
