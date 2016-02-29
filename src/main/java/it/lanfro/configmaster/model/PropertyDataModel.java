package it.lanfro.configmaster.model;

import java.util.Set;

import it.lanfro.configmaster.bean.Field;

public class PropertyDataModel {

	private Set<Field> fieldSet;
	
	public PropertyDataModel(Set<Field> fieldSet) {
		this.fieldSet=fieldSet;
	}
	
	public Set<Field> getFieldSet(){
		return fieldSet;
	}
}
