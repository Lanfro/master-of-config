//package

import org.apache.log4j.Logger;

public class ConfigImpl implements Config{

	final static Logger logger = Logger.getLogger(ConfigImpl.class);
	
	<#list fieldSet as item>
		
		<#if item.type="String">
			private final static ${item.type} default_${item.name} 	= "${item.value}";
		<#else>
		  	private final static ${item.type} default_${item.name} 	= ${item.value};
		</#if>
	    
	</#list>
	
	<#list fieldSet as item>
	    private static ${item.type} ${item.name};
	    
	</#list>
		
	public static class ConfigBuilder {
		<#list fieldSet as item>
	   	private ${item.type} ${item.name};
	    </#list>
				
		ConfigBuilder(){
			//empty
		}
		
		<#list fieldSet as item>
	   	ConfigBuilder ${item.name}(${item.type} val){
			${item.name} = assignValue(val, default_${item.name});
			logger.debug("${item.name}:"+${item.name});
			return this;
		}
	    </#list>
		
		private String assignValue(String val, String defaultValue){
			String newVal;
			if(val == null){
				newVal = defaultValue;
			} else {
				newVal = val;
			}
			return newVal;
		}
		
		private Double assignValue(Double val, Double defaultValue){
			Double newVal;
			if(val == null){
				newVal = defaultValue;
			} else {
				newVal = val;
			}
			return newVal;
		}
		
		private Integer assignValue(Integer val, Integer defaultValue){
			Integer newVal;
			if(val == null){
				newVal = defaultValue;
			} else {
				newVal = val;
			}
			return newVal;
		}
				
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
	public ${item.type} get${item.name}() {
		return ${item.name};
	}
	</#list>	
	
}
