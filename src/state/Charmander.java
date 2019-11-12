package state;

public class Charmander extends State{

	private static Charmander charmander = null;
	private static String name = "Charmander";
	private static int level = 5;
	
	public static State getInstance() {
		if (charmander == null) {
			charmander = new Charmander();
		}
		return charmander;
	}
	
	@Override
	public void stats(Pokemon pokemon) {
		System.out.println("Your pokemon is " + name + ", lvl " + level + ".");
	}
	
	@Override
	public void attack(Pokemon pokemon) {
		System.out.println(name +  " used Scratch.");
	}
	
	@Override
	public void fly(Pokemon pokemon) {
		System.out.println(name + " tries to jump around.");
	}
	
	@Override
	public void evolve(Pokemon pokemon) {
		System.out.println("What?\n" + name + " is evolving!\n");
		changeState(pokemon, Charmeleon.getInstance());
	}
}
