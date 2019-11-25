package builder;

public class KanaBurgerBuilder extends BurgerBuilder {
	private StringBuilder sisalto = new StringBuilder();

	@Override
	public void buildSampyla() {
		Sampyla sampyla = Sampyla.getInstance();
		String addSampyla = sampyla.kanaSampyla();
		sisalto.append(addSampyla);
		burger.setSampyla(addSampyla);
				
		
	}

	@Override
	public void buildPihvi() {
		Pihvi pihvi= Pihvi.getInstance();
		String addPihvi = pihvi.kanaPihvi();
		sisalto.append(addPihvi);
		burger.setPihvi(addPihvi);
		
	}

	@Override
	public void buildJuusto() {
		Juusto juusto= Juusto.getInstance();
		String addJuusto = juusto.kanaJuusto();
		sisalto.append(addJuusto);
		burger.setJuusto(addJuusto);
		
	}

	@Override
	public void buildKastike() {
		Kastike kastike = Kastike.getInstance();
		String  addKastike = kastike.juustoKastike();
		sisalto.append(addKastike);
		burger.setKastike(addKastike);
		
	}

	@Override
	public void buildKasvikset() {
		Kasvikset kasvikset = Kasvikset.getInstance();
		String  addKasvikset = kasvikset.kanaKasvikset();
		sisalto.append(addKasvikset);
		burger.setKasvikset(addKasvikset);
		
	}
	
}
