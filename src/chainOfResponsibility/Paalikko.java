package chainOfResponsibility;

public class Paalikko extends Taso {
	private final double valta = 5;

	@Override
	public void kasittelePyynto(double prosentti) {
		if (prosentti > valta && taso != null) {
			taso.kasittelePyynto(prosentti);
		} else {
			System.out.println("Päällikkö hyväksyy " + prosentti + "% palkankorotuksen.");
		}

	}

}