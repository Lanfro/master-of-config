package it.lanfro.configmaster.type;

public enum Extension {

	properties, json, xml;

	public static Extension fromValue(String extStr) {
		
		switch(extStr){
		case "properties":
			return properties;
		}
		
		return null;
	} 
	
}
