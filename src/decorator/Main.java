package decorator;

public class Main {

	public static void main(String[] args) {
		Pizza pizza1 = new Pohja(new Kana(new Jalapeno(new Valkosipuli("kyllä"))));
		Pizza pizza2 = new Pohja(new Kinkku(new Paprika(new Valkosipuli("ei"))));
		Pizza pizza3 = new Pohja(new Salami(new Sipuli(new Valkosipuli("kyllä"))));
		System.out.println(pizza1.valmista() + " Hinta: " + pizza1.getHinta());
		System.out.println(pizza2.valmista() + " Hinta: " + pizza2.getHinta());
		System.out.println(pizza3.valmista() + " Hinta: " + pizza3.getHinta());

	}

}
