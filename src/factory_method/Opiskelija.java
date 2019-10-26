package factory_method;

public class Opiskelija extends AterioivaOtus {

	public Juoma createJuoma() {
		return new Maito();
	}

	public Ruoka createRuoka() {
    	return new Leipa();
    }
	
}
