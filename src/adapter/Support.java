package adapter;

public class Support implements ISupport{

	@Override
	public void lane() {
		System.out.println("In the lane, the champion pokes the enemy and enchants their teammate. ");
	}

	@Override
	public void teamFight() {
		System.out.println("In the team fights, the champion offers crowd control and enchantments. ");
		
	}

}
