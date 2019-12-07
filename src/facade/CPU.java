package facade;

public class CPU {
    public void freeze() {
    	System.out.println("CPU.freeze. ");
    }
    
    public void jump(long position) {
    	System.out.println("CPU.jump -> " + position + ".");
    }
    
    public void execute() {
    	System.out.println("CPU.execute. ");
    }
}
