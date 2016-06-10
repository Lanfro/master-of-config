package it.lanfro.configmaster.bean;

public class Field {

	private String key;
	private String name;
	private String value;
	private String type;
	
	public Field(String key, String name, String value, String type) {
		super();
		this.key = key;
		this.name = name;
		this.value = value;
		this.type = type;
	}
	
	public String getKey() {
		return key; 
	}
	
	public String getName() {
		return name; 
	}

	public String getValue() {
		return value;
	}
	
	public String getType() {
		return type;
	}
	
}
