package dardo.eve.backend.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;
import org.springframework.core.io.ClassPathResource;

public class ClassPathResourceUtil {
	
	private static final Logger logger = Logger.getLogger(ClassPathResourceUtil.class);
	
	public static String getResourceAsString(String path)
	{
		String retVal = "";
		ClassPathResource cpr = new ClassPathResource(path);
		try 
		{
			String line;
			BufferedReader reader = new BufferedReader(new InputStreamReader(cpr.getInputStream()));
			while((line = reader.readLine())!= null)
			{
				retVal = retVal.concat(line).concat("\n");
			}
		} 
		catch (IOException e) {
			logger.error("Error while reading file - " + path, e);
		}
		return retVal;
	}
	
}
