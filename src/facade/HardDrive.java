package facade;

public class HardDrive {
    public byte[] read(long lba, int size) {
    	System.out.println("HardDrive.read: " + lba + ", " + size);
    	return null;  
	}
}