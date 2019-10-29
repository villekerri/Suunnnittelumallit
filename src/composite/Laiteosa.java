package composite;

import java.util.ArrayList;

public interface Laiteosa {
    public abstract int getHinta();
    public abstract ArrayList<Laiteosa> getSisalto();
    public void addLaiteosa(Laiteosa laiteosa);
    public abstract String toString();
}
