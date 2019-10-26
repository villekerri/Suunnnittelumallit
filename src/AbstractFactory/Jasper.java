package AbstractFactory;

public class Jasper {
	private Lippis lippis;
	private Paita paita;
	private Housut housut;
	private Kengat kengat;

	public Jasper(Tehdas tehdas) {
		lippis = tehdas.createLippis();
		paita = tehdas.createPaita();
		housut = tehdas.createHousut();
		kengat = tehdas.createKengat();
	}
	
	public void luetteleTuotteet() {
		System.out.println("\"Minulla on päässäni " + lippis + ". Päälläni minulla on " + paita + " ja " + housut + ". Jaloissani minulla on " + kengat + ".\"");
	}
}
