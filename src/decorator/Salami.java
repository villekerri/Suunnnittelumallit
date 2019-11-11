package decorator;

public class Salami extends PizzaDecorator {
	private String tayte = "salami";
	private double hinta = 3.80;

	public Salami(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String valmista() {
		return super.valmista() + tayte;
	}
	
	@Override
	public double getHinta() {
		return super.getHinta() + this.hinta;
	}
	
}
