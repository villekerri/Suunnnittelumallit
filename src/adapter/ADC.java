package adapter;

public class ADC {

	private int dps;
	private int csMin;
	
	public ADC(int dps, int csMin) {
		this.dps = dps;
		this.csMin = csMin;
	}

	public int getDps() {
		return dps;
	}

	public void setDps(int dps) {
		this.dps = dps;
	}

	public int getCsMin() {
		return csMin;
	}

	public void setCsMin(int csMin) {
		this.csMin = csMin;
	}
	
}
