package memento;

import java.util.concurrent.ThreadLocalRandom;

public class Arvuuttaja {
	private int oikealuku;

	public Object liityPeliin() {
		this.oikealuku = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		return new Memento(this.oikealuku);
	}
	
	public boolean arvaa(Object obj, int arvaus) {
		Memento memento = (Memento) obj;
		this.oikealuku = memento.luku;
		
		if (this.oikealuku == arvaus) {
			System.out.println("Oikein arvattu. Luku oli " + this.oikealuku + ".\n");
			return true;
		}
		System.out.println("Väärin. Oikea luku oli " + oikealuku + ".\n");
		return false;
	}
	
	private class Memento{
		private int luku;
		
		public Memento(int luku) {
			this.luku = luku;
		}
	}
}
