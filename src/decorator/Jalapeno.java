package decorator;

public class Jalapeno extends PizzaDecorator {
	private String tayte = "jalapeno";
	private double hinta = 1.80;

	public Jalapeno(Pizza pizza) {
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