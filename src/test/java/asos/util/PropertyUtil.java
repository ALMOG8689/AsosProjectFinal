package asos.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class PropertyUtil {
	Properties properties = new Properties();
	
	public PropertyUtil(String path){
		try {
			properties.load(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public String getProperty(final String key){
		String property = properties.getProperty(key);
		return property;
	}
}
