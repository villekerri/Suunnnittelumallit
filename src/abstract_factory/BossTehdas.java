package abstract_factory;

public class BossTehdas implements Tehdas {

	@Override
	public Lippis createLippis() {
		return new BossLippis();
	}

	@Override
	public Paita createPaita() {
		return new BossPaita();
	}

	@Override
	public Housut createHousut() {
		return new BossHousut();
	}

	@Override
	public Kengat createKengat() {
		return new BossKengat();
	}

}
