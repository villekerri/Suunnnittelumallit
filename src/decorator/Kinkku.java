package decorator;

public class Kinkku extends PizzaDecorator {
	private String tayte = "kinkku";
	private double hinta = 3.30;

	public Kinkku(Pizza pizza) {
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
