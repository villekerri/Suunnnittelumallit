package singleton;

public class Main {
	public static void main(String[] args) {
		Singleton tili1 = Singleton.getInstance();
		Singleton tili2 = Singleton.getInstance();
		
		// voi olla vain yksi ilmentymä, jotenka molemmat muuttuvat nordeaksi
		tili1.createTili("nordea");
		tili1.readTili();
		tili2.readTili();
		
		// molemmat muuttuvat op-pankiksi
		tili2.createTili("op");
		tili1.readTili();
		tili2.readTili();
	}
}
