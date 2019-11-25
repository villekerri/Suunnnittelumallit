package builder;

public class Sampyla {
	private static Sampyla INSTANCE = null;
	
	public static Sampyla getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Sampyla();
		}
		return INSTANCE;
	}
	
	public String juustoSampyla() {
		return "Pyöreä sämpylä, joka on leikattu horisontaalisesti kolmeen osaan";
	}
	
	public String kanaSampyla() {
		return "Puikula sämpylä, joka on leikattu horisontaalisesti kahteen osaan";
	}
	
}
