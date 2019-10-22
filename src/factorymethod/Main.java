package factorymethod;

public class Main {

    public static void main(String[] args) {
    	AterioivaOtus opiskelija = new Opiskelija();
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus rehtori = new Rehtori();
        opiskelija.aterioi();
        opettaja.aterioi();
        rehtori.aterioi();
    }
}
