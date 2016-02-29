//package

import org.apache.log4j.Logger;

public class ConfigImpl implements Config{

	final static Logger logger = Logger.getLogger(ConfigImpl.class);
	
	<#list fieldSet as item>
	    private final static String default_${item.name} 	= "${item.value}";
	    
	</#list>
	
	<#list fieldSet as item>
	    private final static String ${item.name};
	    
	</#list>
		
	public static class ConfigBuilder {
		<#list fieldSet as item>
	   	private String ${item.name};
	    </#list>
				
		ConfigBuilder(){
			//empty
		}
		
		<#list fieldSet as item>
	   	ConfigBuilder ${item.name}(String val){
			${item.name} = assignStringValue(val, default_${item.name});
			logger.debug("${item.name}:"+${item.name});
			return this;
		}
	    </#list>
		
		private String assignStringValue(String val, String defaultValue){
			String newVal;
			if(val == null){
				newVal = defaultValue;
			} else {
				newVal = val;
			}
			return newVal;
		}
		
		/*
		private Integer assignIntegerValue(Integer val, Integer defaultValue){
			Integer newVal;
			if(val == null){
				newVal = defaultValue;
			} else {
				newVal = val;
			}
			return newVal;
		}
		*/
		
		ConfigImpl build(){
			return new ConfigImpl(this);
		}
		
	}
	
	private ConfigImpl(ConfigBuilder configBuilder){
		<#list fieldSet as item>
	   	${item.name} = configBuilder.${item.name};
	    </#list>
	    				
	}

	<#list fieldSet as item>
	@Override
	public String get${item.name}() {
		return ${item.name};
	}
	</#list>	
	
}
