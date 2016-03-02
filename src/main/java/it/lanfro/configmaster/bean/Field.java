package it.lanfro.configmaster.bean;

public class Field {

	private String name;
	private String value;
	private String type;
	
	public Field(String name, String value, String type) {
		super();
		this.name = name;
		this.value = value;
		this.type = type;
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
