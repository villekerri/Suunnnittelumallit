package adapter;

public class Main {
	public static void main(String[] args) {
		// Pelissä on eri rooleja, joista kaksi on support ja adc. 
		// Pelissä on hahmoja, jotka on suunnitelty tiettyihin rooleihin
		// Senna on hahmo, jolla voi pelata sekä support että adc roolia.
		
		ISupport support = new Support();
		ISupport senna = new SupportAdapter(200, 10);
		
		support.lane();
		senna.lane();
		
		support.teamFight();
		senna.teamFight();
	}
}
