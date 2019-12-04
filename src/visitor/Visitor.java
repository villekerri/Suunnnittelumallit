package visitor;

public class Visitor implements IVisitor {

	@Override
	public void visit(Charmander charmander) {
		charmander.giveBonusPoints(10);
		
	}

	@Override
	public void visit(Charmeleon charmeleon) {
		charmeleon.giveBonusPoints(20);
		
	}

	@Override
	public void visit(Charizard charizard) {
		charizard.giveBonusPoints(30);
		
	}

}
