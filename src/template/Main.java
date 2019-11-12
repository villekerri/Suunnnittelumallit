package template;

public class Main {

	public static void main(String[] args) {
		/* 
		 * Pelissä on kaksi pelaajaa. 
		 * Pelaajat arvaavat vuorotellen tuleeko kruuna vai klaava.
		 * Pelaaja, joka arvaa 100 kertaa oikein ensimmäisenä voittaa. 
		 */
		KolikonHeitto peli = new KolikonHeitto();
		peli.playOneGame(2);

	}

}
