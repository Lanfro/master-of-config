package it.lanfro.configmaster.engine;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import it.lanfro.configmaster.bean.Field;
import it.lanfro.configmaster.model.PropertyDataModel;
import it.lanfro.configmaster.type.Extension;
import it.lanfro.configmaster.util.FilenameUtils;

public final class Master {

	private static final String TEMPLATE_FOLDER = "src/main/java/it/lanfro/configmaster/ftl";
	private static final File OUTPUT = new File("src/main/java/it/seat/youtube/wrapper/config");
	private static final File RESOURCES_DIR = new File("src/main/resources");
	private static final String NOT_ALLOWED = "${";
	
	private Master(){
		//empty
	}

	public static String[] create() {
		String[] paths = null;
		final String[] resourcesPaths = RESOURCES_DIR.list();
		for(String path : resourcesPaths){
			String extStr = FilenameUtils.getExtension(path);
			Extension ext = Extension.fromValue(extStr);
			switch(ext){
			case properties:
				PropertyDataModel dataModel = fromProperties(RESOURCES_DIR +"/"+ path);
				paths = generateFiles(dataModel);
				break;
			default:
				break;
			} 
		}
		return null;
	}

	private static String[] generateFiles(PropertyDataModel dataModel) {
		TemplateManager.createFiles(dataModel, TEMPLATE_FOLDER);
		return OUTPUT.list();
	}

	private static PropertyDataModel fromProperties(String path) {
		
		Set<Field> fieldSet = new HashSet<>();
		
		Properties properties = new Properties();
        try {
        	InputStream in =  new FileInputStream(path);
			properties.load( in );
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        for(Object key : properties.keySet()){
        	
        	String keyString = (String) key;
        	String valString = (String) properties.getProperty(keyString);
        	
        	if((valString).contains(NOT_ALLOWED)){
        		valString = "";
        	} 
        	
        	fieldSet.add(new Field(keyString, valString));
        }
        
		return new PropertyDataModel(fieldSet);
	}
	
}
