package decorator;

public class Sipuli extends PizzaDecorator {
	private String tayte = "sipuli";
	private double hinta = 1.00;

	public Sipuli(Pizza pizza) {
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