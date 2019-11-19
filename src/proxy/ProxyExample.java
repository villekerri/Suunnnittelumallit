package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProxyExample {
	
	public static void main(final String[] arguments) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        
        List<Image> kuvakansio = new ArrayList<Image>();
        kuvakansio.add(new ProxyImage("Troposfääri"));
        kuvakansio.add(new ProxyImage("Stratosfääri"));
        kuvakansio.add(new ProxyImage("Mesosfääri"));
        kuvakansio.add(new ProxyImage("Termosfääri"));
        
        for (Image kuva : kuvakansio) {
			kuva.showData();
		}

        Scanner scanner = new Scanner(System.in);
        while(true) {
        	System.out.print("Syötä tarkasteltavan kuvan numero. Syötä luku 0 lopettaaksesi ohjelma. \nValintasi: ");
        	int valinta = scanner.nextInt();
        	if (valinta == 0) {
        		System.out.println("Ohjelma päättyi. ");
				break;
			}
        	kuvakansio.get(valinta-1).displayImage();
        	System.out.println("");
        }
        
        /**
        image1.displayImage(); // loading necessary
        image1.displayImage(); // loading unnecessary
        image2.displayImage(); // loading necessary
        image2.displayImage(); // loading unnecessary
        image1.displayImage(); // loading unnecessary
        **/
    }
}