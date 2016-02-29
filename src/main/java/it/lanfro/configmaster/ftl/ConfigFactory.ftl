//package

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//import ConfigBuilder

public class ConfigFactory {

	private static Config config;
	
	private ConfigFactory(){
		//empty
	}
	
	public static Config getConfig(){
		if(config == null){
			//loading configurations
	    	Properties configProp = new Properties();
	    	InputStream in = Config.class.getClassLoader().getResourceAsStream("app.properties");
	    	
	    	try {
				configProp.load(in);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	
	    	<#list fieldSet as item>
	    	String ${item.name} 	= configProp.getProperty("${item.name}"	);
	    	</#list>
	    	
			config = new ConfigBuilder().
					<#list fieldSet as item>
		    		${item.name}(${item.name}).
		    		</#list>
					build();
		}
		return config;
	}
	
}
