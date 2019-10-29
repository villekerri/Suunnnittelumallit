package composite;

import java.util.ArrayList;

public class Power implements Laiteosa{
    private String valmistaja;
    private int hinta;
    
    public Power(String valmistaja, int hinta) {
        this.valmistaja = valmistaja;
        this.hinta = hinta;
    }

    @Override
    public int getHinta() {
        return this.hinta;
    }

    @Override
    public ArrayList<Laiteosa> getSisalto() {
        throw new RuntimeException("Power ei voi sisältää muita laiteosia.");
    }

    @Override
    public void addLaiteosa(Laiteosa laiteosa) {
        throw new RuntimeException("Poweriin ei voi lisätä muita laiteosia.");
    }
    
    @Override
    public String toString(){
        return "Power, valmistaja: " + this.valmistaja + ", hinta: " + this.hinta + ".";
    }
    
}
