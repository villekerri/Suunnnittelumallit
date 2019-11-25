package builder;

import java.util.ArrayList;
import java.util.List;

public class JuustoBurgerBuilder extends BurgerBuilder {
	private List sisalto = new ArrayList<>();

	@Override
	public void buildSampyla() {
		sisalto.add(Sampyla.getInstance().juustoSampyla());
		burger.setSampyla((String) sisalto.get(0));
	}

	@Override
	public void buildPihvi() {
		sisalto.add(Pihvi.getInstance().juustoPihvi());
		burger.setPihvi((String) sisalto.get(1));
	}

	@Override
	public void buildJuusto() {
		sisalto.add(Juusto.getInstance().juustoJuusto());
		burger.setJuusto((String) sisalto.get(2));
	}

	@Override
	public void buildKastike() {
		sisalto.add(Kastike.getInstance().juustoKastike());
		burger.setKastike((String) sisalto.get(3));
	}

	@Override
	public void buildKasvikset() {
		sisalto.add(Kasvikset.getInstance().juustoKasvikset());
		burger.setKasvikset((String) sisalto.get(4));
	}

}
