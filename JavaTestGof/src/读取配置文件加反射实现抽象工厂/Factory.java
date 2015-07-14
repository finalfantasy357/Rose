package 读取配置文件加反射实现抽象工厂;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.lang.reflect.*;

public class Factory {
	private static String createLine = parseXml();
	
	public static IBottle getBottle(){
		try {
			Class c = Class.forName("读取配置文件加反射实现抽象工厂."+createLine+"Bottle");
			IBottle iBottle = (IBottle) c.newInstance();
			return iBottle;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}

	public static IKettle getKettle(){
		try {
			Class c = Class.forName("读取配置文件加反射实现抽象工厂."+createLine+"Kettle");
			IKettle iKettle = (IKettle) c.newInstance();
			return iKettle;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	//读取配置文件，拿到生产的方式
	public static String parseXml(){
		try {
			SAXReader reader = new SAXReader();
			Document docement = reader.read(new File("factoryConfig.xml"));
			Element root = docement.getRootElement();
			Element xml_factory = root.element("factory");
			String createLine = xml_factory.elementTextTrim("createLine");
			return createLine;
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}
