package composite;

public interface Tehdas {
    public abstract CPU createCPU();
    public abstract GPU createGPU();
    public abstract Kotelo createKotelo();
    public abstract Motherboard createMotherboard();
    public abstract Power createPower();
    public abstract RAM createRAM();
    public abstract SSD createSSD();
    public abstract Tuuletin createTuuletin();
    
}
