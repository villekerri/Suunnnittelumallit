package template;

import java.util.Random;

public class KolikonHeitto extends Game{
	private int heittojenMaara, arvaukset1, arvaukset2;
	private boolean arvaus, heitto;
	private Random random;
	
	
	@Override
	void initializeGame() {
		heittojenMaara = 0;
		arvaukset1 = 0;
		arvaukset2 = 0;
		random = new Random();
		System.out.println("Peli on valmis alkamaan.\n");
	}

	@Override
	void makePlay(int player) {
		player++;	// muuten pelaajat on 0 ja 1
		arvaus = random.nextBoolean();
		heitto = random.nextBoolean();
		heittojenMaara++;
		
		// true on kruuna ja false klaava
		if (arvaus == true) {
			System.out.println("Pelaaja " + player + " arvaa: kruuna.");
		} else {
			System.out.println("Pelaaja " + player + " arvaa: klaava.");
		}
		
		System.out.println("Kolikko heitetään. ");
		if (heitto == arvaus) {
			System.out.println("Kruuna. Pelaaja " + player + " arvasi oikein.\n");
			if (player == 1) {
				arvaukset1++;
			} else {
				arvaukset2++;
			}
		} else {
			System.out.println("Klaava. Pelaaja " + player + " arvasi väärin.\n");
		}
		
	}

	// peli päättyy kun jompikumpi arvaa yhteensä 100 kertaa oikein
	@Override
	boolean endOfGame() {
		if (arvaukset1 < 100 && arvaukset2 < 100) {
			return false;
		} else {
			return true;
		}
	}

	// tulostetaan heittojen määrä yhteensä sekä molempien pelaajien oikeiden arvauksien määrä.
	@Override
	void printWinner() {
		System.out.println("Heitot yhteensä: " + heittojenMaara + 
				". \nPelaaja 1 arvattu oikein " + arvaukset1 + " kertaa. "
				+ "\nPelaaja 2 arvasi oikein " + arvaukset2 + " kertaa.\n");
		if (arvaukset1 > arvaukset2) {
			System.out.println("Pelaaja 1 voitti.");
		} else {
			System.out.println("Pelaaja 2 voitti.");
		}
	}

}
