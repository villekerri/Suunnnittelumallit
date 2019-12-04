package builder;

public class Kastike {
	private static Kastike INSTANCE = null;
	
	public static Kastike getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Kastike();
		}
		return INSTANCE;
	}
	
	public String juustoKastike() {
		return "majoneesia";
	}
	
	public String kanaKastike() {
		return "kurkkumajoneesia";
	}
}
