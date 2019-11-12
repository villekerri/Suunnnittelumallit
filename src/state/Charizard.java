package state;

public class Charizard extends State{

	private static Charizard charizard = null;
	private static String name = "Charizard";
	private static int level = 36;
	
	public static State getInstance() {
		if (charizard == null) {
			charizard = new Charizard();
		}
		return charizard;
	}
	
	@Override
	public void stats(Pokemon pokemon) {
		System.out.println("Your pokemon is " + name + ", lvl " + level + ".");
	}
	
	@Override
	public void attack(Pokemon pokemon) {
		System.out.println(name +  " used Flamethrower.");
	}
	
	@Override
	public void fly(Pokemon pokemon) {
		System.out.println(name + " takes flight.");
	}
	
	@Override
	public void evolve(Pokemon pokemon) {
		System.out.println("Oh no! You forgot to save your game and your GameBoy have ran out of batteries.\n"
				+ "You start a new game and pick Charmander again. \n");
		changeState(pokemon, Charmander.getInstance());
	}
	
}