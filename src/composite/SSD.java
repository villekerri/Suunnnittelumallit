package composite;

import java.util.ArrayList;

public class SSD implements Laiteosa{
    private String valmistaja;
    private int hinta;
    
    public SSD(String valmistaja, int hinta) {
        this.valmistaja = valmistaja;
        this.hinta = hinta;
    }

    @Override
    public int getHinta() {
        return this.hinta;
    }

    @Override
    public ArrayList<Laiteosa> getSisalto() {
        throw new RuntimeException("SSD ei voi sisältää muita laiteosia.");
    }

    @Override
    public void addLaiteosa(Laiteosa laiteosa) {
        throw new RuntimeException("SSD:hen ei voi lisätä muita laiteosia.");
    }
    
    @Override
    public String toString(){
        return "SSD, valmistaja: " + this.valmistaja + ", hinta: " + this.hinta + ".";
    }
    
}
