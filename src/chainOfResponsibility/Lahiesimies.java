package chainOfResponsibility;

public class Lahiesimies extends Taso {
	private final double valta = 2;

	@Override
	public void kasittelePyynto(double prosentti) {
		if (prosentti > valta && taso != null) {
			taso.kasittelePyynto(prosentti);
		} else {
			System.out.println("Lähiesimies hyväksyy " + prosentti + "% palkankorotuksen.");
		}

	}

}
