package strategy;

import java.util.Iterator;
import java.util.List;

public class Strategy3 implements ListConverter {
	private String s = "";

	// listan läpikäynti for-silmukassa käyttäen List-rajapinnan get-metodia
	@Override
	public String listToString(List list) {
		for (int i = 0; i < list.size(); i++) {
			s += list.get(i);
			if ( i % 3 == 2 ) {
				s += "\n";
			}
		}
		return s;
	}

}
