package builder;

public abstract class BurgerBuilder {
	protected Burger burger;
	public abstract void buildSampyla();
	public abstract void buildPihvi();
	public abstract void buildJuusto();
	public abstract void buildKastike();
	public abstract void buildKasvikset();
	
	public Burger getBurger() {
		return burger;
	}
	
	public void createBurger() {
		this.burger = new Burger();
	}
	
}
