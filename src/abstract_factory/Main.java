package abstract_factory;

import java.io.FileInputStream;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		//AdidasTehdas adidas = new AdidasTehdas();
		//BossTehdas boss = new BossTehdas();
		
		Class c = null;
		Tehdas tehdas1 = null;
		Tehdas tehdas2 = null;
		
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("abstract_factory/tehdas.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			c = Class.forName(properties.getProperty("tehdas1"));
			tehdas1 = (Tehdas)c.newInstance();
			c = Class.forName(properties.getProperty("tehdas2"));
			tehdas2 = (Tehdas)c.newInstance();
		} catch (Exception e){e.printStackTrace();}
		
		Jasper opiskelevaJasper = new Jasper(tehdas1);
		Jasper valmistunutJasper = new Jasper(tehdas2);

		System.out.println("Jasper opiskellessa: ");
		opiskelevaJasper.luetteleTuotteet();
		
		System.out.println("Jasper valmistuttua: ");
		valmistunutJasper.luetteleTuotteet();
	}

}
