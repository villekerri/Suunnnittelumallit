package visitor;

public class Pokemon {
	private State state;
	
	public Pokemon() {
		this.state = Charmander.getInstance();
	}
	
	protected void changeState(State state) {
		this.state = state;
	}
	
	public void stats() {
		state.stats(this);
	}
	
	public void evolve() {
		state.evolve(this);
	}
	
	public void attack() {
		state.attack(this);
	}
	
	public void fly() {
		state.fly(this);
	}
	
	public void accept(Visitor visitor) {
		state.accept(visitor);
	}
	
	public void getBonusPoints() {
		state.getBonusPoints(this);
	}
}
