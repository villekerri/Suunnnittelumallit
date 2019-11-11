package decorator;

public class Kana extends PizzaDecorator {
	private String tayte = "kana";
	private double hinta = 4.00;

	public Kana(Pizza pizza) {
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
