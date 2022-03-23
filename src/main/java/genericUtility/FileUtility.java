package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	/**
	 * 
	 * @param key as url un pwd BROW
	 * @return value from property file url,un,pwd,BROW
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/data.properties");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;		
	}
	/**
	 * 
	 * @param key property file name
	 * @return value from property file 
	 * @throws IOException
	 */
	public String getPropertyData(String key,String propertyFileName) throws IOException {
		FileInputStream fis=new FileInputStream("./data/"+propertyFileName+".properties");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;		
	}
	
}
