package Utilities;

import java.io.FileInputStream;

import java.util.Properties;

public  class PropertyFileUtil {
	public  static String getValueKey(String key) throws Exception {
		FileInputStream fis=new FileInputStream("F:\\MavenVenkat\\StockAccounting\\Propertiesfile\\Environment.properties");
		Properties pro=new Properties();
		pro.load(fis);
		 return pro.getProperty(key);
	}

}
