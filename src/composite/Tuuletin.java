package composite;

import java.util.ArrayList;

public class Tuuletin implements Laiteosa{
    private String valmistaja;
    private int hinta;
    
    public Tuuletin(String valmistaja, int hinta) {
        this.valmistaja = valmistaja;
        this.hinta = hinta;
    }

    @Override
    public int getHinta() {
        return this.hinta;
    }

    @Override
    public ArrayList<Laiteosa> getSisalto() {
        throw new RuntimeException("Tuuletin ei voi sisältää muita laiteosia.");
    }

    @Override
    public void addLaiteosa(Laiteosa laiteosa) {
        throw new RuntimeException("Tuulettimeen ei voi lisätä muita laiteosia.");
    }
    
    @Override
    public String toString(){
        return "Tuuletin, valmistaja: " + this.valmistaja + ", hinta: " + this.hinta + ".";
    }
    
}
