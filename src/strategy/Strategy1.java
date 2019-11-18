package strategy;

import java.util.Iterator;
import java.util.List;

public class Strategy1 implements ListConverter {
	private String s = "";

	// iteraattorin käyttö
	@Override
	public String listToString(List list) {
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			s = s + iterator.next() + "\n";
		}
		return s;
	}

}