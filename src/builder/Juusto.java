package builder;

public class Juusto {
	private static Juusto INSTANCE = null;
	
	public static Juusto getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Juusto();
		}
		return INSTANCE;
	}
	
	public String juustoJuusto() {
		return "cheddarjuustoa";
	}
	
	public String kanaJuusto() {
		return "sveitsinjuustoa";
	}
}
