package composite;

public class JimmsTehdas implements Tehdas{

    @Override
    public CPU createCPU() {
        CPU prossu = new CPU("AMD", 190);
        prossu.addLaiteosa(createTuuletin());
        return prossu;
    }

    @Override
    public GPU createGPU() {
        GPU nayttis = new GPU("Gigabyte", 380);
        nayttis.addLaiteosa(createTuuletin());
        return nayttis;
    }

    @Override
    public Kotelo createKotelo() {
        Kotelo kotelo = new Kotelo("NZXT", 90);
        kotelo.addLaiteosa(createMotherboard());
        return kotelo;
    }

    @Override
    public Motherboard createMotherboard() {
        Motherboard mobo = new Motherboard("ASRock", 150);
        mobo.addLaiteosa(createCPU());
        mobo.addLaiteosa(createGPU());
        mobo.addLaiteosa(createRAM());
        mobo.addLaiteosa(createSSD());
        mobo.addLaiteosa(createPower());
        mobo.addLaiteosa(createTuuletin());
        return mobo;
    }

    @Override
    public Power createPower() {
        return new Power("Corsair", 85);
    }

    @Override
    public RAM createRAM() {
        return new RAM("G.Skill", 60);
    }

    @Override
    public SSD createSSD() {
        return new SSD("TCSunBow", 80);
    }

    @Override
    public Tuuletin createTuuletin() {
        return new Tuuletin("Noctua", 25);
    }
    
}
