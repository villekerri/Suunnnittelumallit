package decorator;

public class Valkosipuli implements Pizza {
	private String valinta;
	
	public Valkosipuli(String valinta) {
		this.valinta = valinta;
	}

	@Override
	public String valmista() {
		if(valinta=="kyllä") {
			return "Valkosipulilla, ";
		} else {
			return "Ei valkosipulia, ";
		}
	}

	@Override
	public String getNimi() {
		return "valkosipuli";
	}

	@Override
	public double getHinta() {
		if(valinta=="kyllä") {
			return 0.50;
		} else {
			return 0;
		}
	}

}
