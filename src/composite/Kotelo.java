package composite;

import java.util.ArrayList;

public class Kotelo implements Laiteosa{
    private String valmistaja;
    private int hinta;
    private ArrayList<Laiteosa> sisaltaa = new ArrayList<Laiteosa>();
    
    public Kotelo(String valmistaja, int hinta) {
        this.valmistaja = valmistaja;
        this.hinta = hinta;
    }

    @Override
    public int getHinta() {
        int yhteensa = this.hinta;
        for (Laiteosa osa : sisaltaa) {
            yhteensa += osa.getHinta();
        }
        return yhteensa;
    }

    @Override
    public ArrayList<Laiteosa> getSisalto() {
        return this.sisaltaa;
    }

    @Override
    public void addLaiteosa(Laiteosa laiteosa) {
        sisaltaa.add(laiteosa);
    }
    
    @Override
    public String toString(){
        String s = "Kotelo, valmistaja: " + this.valmistaja + ", hinta: " + this.hinta + ", sisältää osat: \n";
        for (Laiteosa osa : sisaltaa) {
            s += "   " + osa.toString();
        }
        return s;
    }
    
}
