package strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("yksi", "kaksi", "kolme", "neljä", "viisi", 
				"kuusi", "seitsemän", "kahdeksan", "yhdeksän", "kymmenen");

		Tulostaja tulostaja1 = new Tulostaja(new Strategy1());
		Tulostaja tulostaja2 = new Tulostaja(new Strategy2());
		Tulostaja tulostaja3 = new Tulostaja(new Strategy3());
		
		System.out.println(tulostaja1.tulosta(list));
		System.out.println(tulostaja2.tulosta(list));
		System.out.println(tulostaja3.tulosta(list));
	}

}
