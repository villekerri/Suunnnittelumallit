package factory_method;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    };

    public Ruoka createRuoka() {
    	return new Keitto();
    }
    
}
