package it.lanfro.configmaster.engine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import it.lanfro.configmaster.model.PropertyDataModel;

final class TemplateManager {

	private static final String FTL_EXTENSION = ".ftl";
	private static final String OUTPUT_EXTENSION = ".java";
	private static final String DEFAULT_ENCODING = "UTF-8";
	private static final String FREEMARKER_OUTPUT_DIR = "freemarker-output/";
	
	private static final String[] TEMPLATES = new String[]{"Config.ftl","ConfigImpl.ftl","ConfigFactory.ftl"};

	private static Configuration conf;
	
	
	static void createFiles(PropertyDataModel dataModel, String templateFolder) {
		conf = loadConfiguration(templateFolder);
		for(String template : TEMPLATES){
			try {
				String javaFileName = template.replace(FTL_EXTENSION, OUTPUT_EXTENSION);
				conf.getTemplate(template).process(dataModel, new FileWriter(new File(FREEMARKER_OUTPUT_DIR+javaFileName)) );
			} catch (TemplateException | IOException e) {
				e.printStackTrace();
			} 
		}
	}

	private static Configuration loadConfiguration(String templateFolder) {
		
		if(conf == null){
			conf = new Configuration(Configuration.VERSION_2_3_22);
	        try {
	        	conf.setDirectoryForTemplateLoading(new File(templateFolder));
			} catch (IOException e) {
				e.printStackTrace();
			}
	        conf.setDefaultEncoding(DEFAULT_ENCODING);
	        conf.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		}
		
		return conf;
		
	}
	
}
