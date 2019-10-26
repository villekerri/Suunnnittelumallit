package factory_method;

public class Rehtori extends AterioivaOtus {

	public Juoma createJuoma() {
		return new Mehu();
	}

	public Ruoka createRuoka() {
		return new Pihvi();
	}
	
}
