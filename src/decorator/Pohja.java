package decorator;

public class Pohja extends PizzaDecorator {
	private String tayte = "normaali pohja";
	private double hinta = 7.40;

	public Pohja(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String valmista() {
		return super.valmista() + "pizza, jossa " + tayte + ".";
	}
	
	@Override
	public double getHinta() {
		return super.getHinta() + this.hinta;
	}
	
}
