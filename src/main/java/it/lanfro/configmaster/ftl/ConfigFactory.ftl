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
	    	
	    	<#if item.type="String">
				${item.type} ${item.name} 	= configProp.getProperty("${item.name}"	);
			<#elseif item.type="Integer">
				${item.type} ${item.name} 	= Integer.parseInt(configProp.getProperty("${item.name}"	));
			<#else>
			  	${item.type} ${item.name} 	= Double.parseDouble(configProp.getProperty("${item.name}"	));
			</#if>
	    	
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
