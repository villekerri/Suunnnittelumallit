package composite;

import java.util.ArrayList;

public class RAM implements Laiteosa{
    private String valmistaja;
    private int hinta;
    
    public RAM(String valmistaja, int hinta) {
        this.valmistaja = valmistaja;
        this.hinta = hinta;
    }

    @Override
    public int getHinta() {
        return this.hinta;
    }

    @Override
    public ArrayList<Laiteosa> getSisalto() {
        throw new RuntimeException("RAM ei voi sisältää muita laiteosia.");
    }

    @Override
    public void addLaiteosa(Laiteosa laiteosa) {
        throw new RuntimeException("RAM:iin ei voi lisätä muita laiteosia.");
    }
    
    @Override
    public String toString(){
        return "RAM, valmistaja: " + this.valmistaja + ", hinta: " + this.hinta + ".";
    }
    
}
