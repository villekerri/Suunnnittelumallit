package builder;

public class Kasvikset {
	private static Kasvikset INSTANCE = null;
	
	public static Kasvikset getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Kasvikset();
		}
		return INSTANCE;
	}
	
	public String juustoKasvikset() {
		return "jäävuorisalaattia, sipulia ja suolakurkkua";
	}
	
	public String kanaKasvikset() {
		return "jäävuorisalaattia ja suolakurkkua";
	}
}
