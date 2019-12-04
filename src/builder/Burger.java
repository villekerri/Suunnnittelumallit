package builder;

import java.util.ArrayList;
import java.util.List;

public class Burger {
	private String sampyla = "";
	private String pihvi = "";
	private String juusto = "";
	private String kastike = "";
	private String kasvikset = "";
	private List juustoBurger = new ArrayList<>();
	private StringBuilder kanaBurger = new StringBuilder();
	private Object burger = new Object();
	
	public void setSampyla(String sampyla) {
		this.sampyla = sampyla;
	}
	
	public void setPihvi(String pihvi) {
		this.pihvi = pihvi;
	}
	
	public void setJuusto(String juusto) {
		this.juusto = juusto;
	}
	
	public void setKastike(String kastike) {
		this.kastike = kastike;
	}
	
	public void setKasvikset(String kasvikset) {
		this.kasvikset = kasvikset;
	}
	
	public void setBurger(Object object) {
		this.burger = object;
	}

	public String getSampyla() {
		return sampyla;
	}

	public String getPihvi() {
		return pihvi;
	}

	public String getJuusto() {
		return juusto;
	}

	public String getKastike() {
		return kastike;
	}

	public String getKasvikset() {
		return kasvikset;
	}
	
	
}
