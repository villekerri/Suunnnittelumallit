package facade;

public class Memory {
    public void load(long position, byte[] data) {
    	System.out.println("Memory.load: " + position + ", " + data);
    }
}
