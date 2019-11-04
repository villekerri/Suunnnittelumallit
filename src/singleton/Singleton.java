package singleton;

public class Singleton implements Tehdas{

	private static final Singleton INSTANCE = new Singleton();
	private Singleton() {}
	private Tili tili = null;
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	@Override
	public synchronized Tili createTili(String pankkitili) {
		if (pankkitili == "nordea") {
			tili = new NordeaTili();
			return tili;
		} else if (pankkitili == "op") {
			tili = new OPTili();
			return tili;
		}
		return null;
	}
	
	@Override
	public void readTili() {
		System.out.println(tili);
	}
	
}
