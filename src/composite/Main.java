package composite;

public class Main {
    public static void main(String[] args) {
        Laiteosa kotelo = new Kotelo("Corsair", 210);
        Laiteosa power = new Power("EVGA", 140);
        Laiteosa mobo = new Motherboard("Gigabyte", 170);
        Laiteosa prossu = new CPU("Intel", 450);
        Laiteosa muisti = new RAM("Kingston", 110);
        Laiteosa massamuisti = new SSD("Samsung", 200);
        Laiteosa nayttis = new GPU("MSI", 600);
        Laiteosa jaahy = new Tuuletin("Noctua", 20);
        
        nayttis.addLaiteosa(jaahy);
        prossu.addLaiteosa(jaahy);
        mobo.addLaiteosa(nayttis);
        mobo.addLaiteosa(prossu);
        mobo.addLaiteosa(muisti);
        mobo.addLaiteosa(massamuisti);
        mobo.addLaiteosa(power);
        kotelo.addLaiteosa(mobo);
        kotelo.addLaiteosa(jaahy);
        
        System.out.println("Tietokoeen tiedot: \n" + kotelo.toString() + 
                "\nTietokoneen hinta: " + kotelo.getHinta() + "\n\n");
        
        
        // Abstrakti tehdas bonus
        Tehdas jimms = new JimmsTehdas();
        Tehdas verkkokauppa = new VerkkokauppaTehdas();
        
        Laiteosa jimmsKone = jimms.createKotelo();
        Laiteosa verkkokauppaKone = verkkokauppa.createKotelo();
        
        System.out.println("Jimm's tietokoeen tiedot: \n" + jimmsKone.toString() +
                "Jimm's tietokoneen hinta: " + jimmsKone.getHinta());
        
        System.out.println("verkkokauppa tietokoeen tiedot: \n" + verkkokauppaKone.toString() +
                "Verkkokauppa tietokoneen hinta: " + verkkokauppaKone.getHinta());
        
    }
    
}
