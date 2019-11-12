package state;

public abstract class State {
	void changeState(Pokemon pokemon, State state) {
		pokemon.changeState(state);
	}
	void stats(Pokemon pokemon) {}
	void evolve(Pokemon pokemon) {}
	void attack(Pokemon pokemon) {}
	void fly(Pokemon pokemon) {}
	
}
