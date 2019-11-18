package chainOfResponsibility;

abstract class Taso {
	protected Taso taso;
	
	public void setNextTaso(Taso nextTaso) {
		this.taso = nextTaso;
	}
	
	abstract public void kasittelePyynto(double prosentti);
	
}
