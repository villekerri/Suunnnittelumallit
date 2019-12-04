package builder;

public class Kokki {
	private BurgerBuilder burgerBuilder;
	
	public void setBurgerBuilder(BurgerBuilder builder) {
		this.burgerBuilder = builder;
	}
	
	public Burger getBurger() {
		return burgerBuilder.getBurger();
	}
	
	public void makeBurger() {
		burgerBuilder.createBurger();
		burgerBuilder.buildSampyla();
		burgerBuilder.buildPihvi();
		burgerBuilder.buildJuusto();
		burgerBuilder.buildKastike();
		burgerBuilder.buildKasvikset();
	}
	
	public void describeBurger() {
		System.out.println(burgerBuilder.getBurger().getSampyla() + ", jonka sisällä on " +
				burgerBuilder.getBurger().getPihvi() + ". \nHampurilainen sisältää myös " +
				burgerBuilder.getBurger().getJuusto() + ", " +
				burgerBuilder.getBurger().getKastike() + ", " +
				burgerBuilder.getBurger().getKasvikset() + ".\n");
	}
}
