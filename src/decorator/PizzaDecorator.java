package decorator;

public abstract class PizzaDecorator implements Pizza {
	private Pizza pizza;
	protected String nimi;
	protected double hinta;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String valmista() {
		return pizza.valmista();
	}

	@Override
	public String getNimi() {
		return pizza.getNimi();
	}

	@Override
	public double getHinta() {
		return pizza.getHinta();
	}

}
