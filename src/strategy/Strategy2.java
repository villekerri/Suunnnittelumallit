package strategy;

import java.util.List;

public class Strategy2 implements ListConverter {
	private String s = "";

	// lista taulukoksi ennen läpikäyntiä, joka toteutetaan for-silmukassa
	@Override
	public String listToString(List list) {
		String[] taulukko = new String[list.size()];
		taulukko = (String[]) list.toArray(taulukko);
		
		for (int i = 0; i < taulukko.length; i++) {
			s += taulukko[i];
			if (i != 0 && i % 2 == 1) {
				s += "\n";
			}
		}
		return s;
	}

}
