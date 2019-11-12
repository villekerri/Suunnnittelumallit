package state;

public class Main {

	public static void main(String[] args) {
		
		Pokemon pokemon = new Pokemon();

		for (int i = 0; i < 3; i++) {
			pokemon.stats();
			pokemon.attack();
			pokemon.fly();
			pokemon.evolve();
		}
		
	}
}
