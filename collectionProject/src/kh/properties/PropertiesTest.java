package kh.properties;

import java.io.*;
import java.util.*;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc.oracle.thin:@localhost:1521:xe");
		prop.setProperty("user", "beomsuk");
		prop.setProperty("password", "beomsuk");
		
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("oracleDriver.txt"), "jdbc Oracle");
			prop.storeToXML(new FileOutputStream("oracleXml.xml"), "save.xml");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		
		Properties readProp = new Properties();
		try {
			readProp.load(new FileInputStream("oracleDriver.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("파일 내용을 읽은 값");
		System.out.println(readProp);
	}

}
