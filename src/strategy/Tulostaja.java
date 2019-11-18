package strategy;

import java.util.List;

public class Tulostaja {
	private ListConverter strategy;
	
	public Tulostaja(ListConverter strategy) {
		this.strategy = strategy;
	}
	
	public String tulosta(List list) {
		String tulostus = this.strategy.listToString(list);
		return tulostus;
	}
}
