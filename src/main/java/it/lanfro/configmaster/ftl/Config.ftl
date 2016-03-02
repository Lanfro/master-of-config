public interface Config {

	<#list fieldSet as item>
	    ${item.type} get${item.name}();
	    
	</#list>
}