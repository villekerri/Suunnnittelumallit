package builder;

public class Pihvi {
	private static Pihvi INSTANCE = null;
	
	public static Pihvi getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Pihvi();
		}
		return INSTANCE;
	}
	
	public String juustoPihvi() {
		return "naudanlihapivhi";
	}
	
	public String kanaPihvi() {
		return "kananlihapivhi";
	}
}
