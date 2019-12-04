package visitor;

public class Main {

	public static void main(String[] args) {
		
		Pokemon pokemon = new Pokemon();
		Visitor visitor = new Visitor();

		for (int i = 0; i < 3; i++) {
			pokemon.stats();
			pokemon.accept(visitor);
			pokemon.getBonusPoints();
			pokemon.attack();
			pokemon.fly();
			pokemon.evolve();
		}
		
	}
}
