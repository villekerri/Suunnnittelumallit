package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		Lahiesimies lahiesimies = new Lahiesimies();
		Paalikko paalikko = new Paalikko();
		Toimitusjohtaja toimitusjohtaja = new Toimitusjohtaja();
		
		lahiesimies.setNextTaso(paalikko);
		paalikko.setNextTaso(toimitusjohtaja);
		
		lahiesimies.kasittelePyynto(1);
		lahiesimies.kasittelePyynto(3);
		lahiesimies.kasittelePyynto(6);

	}

}
