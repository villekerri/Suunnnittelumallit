package chainOfResponsibility;

public class Toimitusjohtaja extends Taso {
	private final double valta = 2;

	@Override
	public void kasittelePyynto(double prosentti) {
		System.out.println("Toimitusjohtaja hyväksyy " + prosentti + "% palkankorotuksen.");
	}

}