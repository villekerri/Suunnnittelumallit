package prototype;

public class Main {
	public static void main(String[] args) {
		Kello kello = new Kello();
		System.out.println(kello.getAika());				// kello alkaa ajasta 0:0:1

		Kello klooni = kello.clone();
		System.out.println("(Klooni)" + klooni.getAika());	// klooni alkaa ajasta 0:0:2
		
		kello.setAika(5, 5, 5);			// ei vaikuttanut kloonin aikaan
		System.out.println(kello.getAika());
		System.out.println("(Klooni)" + klooni.getAika());
		
		klooni.setAika(10, 10, 10);		// ei vaikuttanut alkuperäisen kellon aikaan
		System.out.println(kello.getAika());
		System.out.println("(Klooni)" + klooni.getAika());
		
		
		/**
		for (int i = 0; i < 86400; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(kello.getAika());
				System.out.println("(Klooni)" + klooni.getAika());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		**/
	}
}
