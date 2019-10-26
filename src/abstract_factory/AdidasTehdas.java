package abstract_factory;

public class AdidasTehdas implements Tehdas {

	@Override
	public Lippis createLippis() {
		return new AdidasLippis();
	}

	@Override
	public Paita createPaita() {
		return new AdidasPaita();
	}

	@Override
	public Housut createHousut() {
		return new AdidasHousut();
	}

	@Override
	public Kengat createKengat() {
		return new AdidasKengat();
	}

}
