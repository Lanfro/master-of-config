package it.lanfro.configmaster.bean;

public class Field {

	private String name;
	private String value;
	
	public Field(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public String getValue() {
		return value;
	}
	
}
