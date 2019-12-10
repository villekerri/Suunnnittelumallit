package adapter;

public class SupportAdapter extends ADC implements ISupport{

	public SupportAdapter(int dps, int csMin) {
		super(dps, csMin);
	}

	@Override
	public void lane() {
		System.out.println("In the lane, the champion is getting " + this.getCsMin() + " creeps per minute.");
	}

	@Override
	public void teamFight() {
		System.out.println("In the team fights, the champion is dealing " + this.getDps() + " ranged damage per second.");
	}

}
