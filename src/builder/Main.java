package builder;

public class Main {

	public static void main(String[] args) {
		Kokki kokki = new Kokki();
		BurgerBuilder juustoBurgerBuilder = new JuustoBurgerBuilder();
		BurgerBuilder kanaBurgerBuilder = new KanaBurgerBuilder();

		kokki.setBurgerBuilder(juustoBurgerBuilder);
		kokki.makeBurger();
		Burger juustoBurger = kokki.getBurger();
		kokki.describeBurger();
		
		kokki.setBurgerBuilder(kanaBurgerBuilder);
		kokki.makeBurger();
		Burger kanaBurger = kokki.getBurger();
		kokki.describeBurger();
	}

}
