package visitor;

public class Charmeleon extends State{

	private static Charmeleon charmeleon = null;
	private static String name = "Charmeleon";
	private static int level = 16;
	
	public static State getInstance() {
		if (charmeleon == null) {
			charmeleon = new Charmeleon();
		}
		return charmeleon;
	}
	
	@Override
	public void stats(Pokemon pokemon) {
		System.out.println("Your pokemon is " + name + ", lvl " + level + ".");
	}
	
	@Override
	public void attack(Pokemon pokemon) {
		System.out.println(name +  " used Ember.");
	}
	
	@Override
	public void fly(Pokemon pokemon) {
		System.out.println(name + " jumps high.");
	}
	
	@Override
	public void evolve(Pokemon pokemon) {
		System.out.println("What?\n" + name + " is evolving!\n");
		changeState(pokemon, Charizard.getInstance());
	}

	@Override
	public void giveBonusPoints(int bonusPoints) {
		this.bonusPoints += bonusPoints;
	}
	
	@Override
	public void getBonusPoints(Pokemon pokemon) {
		System.out.println(name + " has " + bonusPoints + " bonus points.");
		
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
}