package composite;

public class VerkkokauppaTehdas implements Tehdas{

    @Override
    public CPU createCPU() {
        CPU prossu = new CPU("Intel", 220);
        prossu.addLaiteosa(createTuuletin());
        return prossu;
    }

    @Override
    public GPU createGPU() {
        GPU nayttis = new GPU("Asus", 300);
        nayttis.addLaiteosa(createTuuletin());
        return nayttis;
    }

    @Override
    public Kotelo createKotelo() {
        Kotelo kotelo = new Kotelo("Phanteks", 80);
        kotelo.addLaiteosa(createMotherboard());
        return kotelo;
    }

    @Override
    public Motherboard createMotherboard() {
        Motherboard mobo = new Motherboard("MSI", 135);
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
        return new Power("EVGA", 130);
    }

    @Override
    public RAM createRAM() {
        return new RAM("Corsair", 85);
    }

    @Override
    public SSD createSSD() {
        return new SSD("Crucial", 120);
    }

    @Override
    public Tuuletin createTuuletin() {
        return new Tuuletin("Corsair", 30);
    }
    
}