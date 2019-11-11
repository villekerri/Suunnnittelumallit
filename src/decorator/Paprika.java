package decorator;

public class Paprika extends PizzaDecorator {
	private String tayte = "paprika";
	private double hinta = 1.20;

	public Paprika(Pizza pizza) {
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