package AbstractFactory;

public class Main {

	public static void main(String[] args) {
		AdidasTehdas adidas = new AdidasTehdas();
		BossTehdas boss = new BossTehdas();
		
		Jasper opiskelevaJasper = new Jasper(adidas);
		Jasper valmistunutJasper = new Jasper(boss);

		System.out.println("Jasper opiskellessa: ");
		opiskelevaJasper.luetteleTuotteet();
		
		System.out.println("Jasper valmistuttua: ");
		valmistunutJasper.luetteleTuotteet();
	}

}
