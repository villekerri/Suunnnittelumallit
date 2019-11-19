package memento;

import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		
		Asiakas asiakas1 = new Asiakas("Ville");
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		int arvaus = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		
		System.out.println(asiakas1.getNimi() + " arvaa lukua " + arvaus + ".");
		asiakas1.liityPeliin(arvuuttaja);
		asiakas1.arvaa(arvuuttaja, 1);
		
	}
}
