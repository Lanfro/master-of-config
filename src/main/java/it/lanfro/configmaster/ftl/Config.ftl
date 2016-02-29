public interface Config {

	<#list fieldSet as item>
	    String get${item.name}();
	    
	</#list>
}