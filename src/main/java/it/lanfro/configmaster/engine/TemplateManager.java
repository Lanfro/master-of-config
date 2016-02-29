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

	private static Configuration conf;
	private static final String[] templates = new String[]{"Config.ftl","ConfigImpl.ftl","ConfigFactory.ftl"};

	static void createFiles(PropertyDataModel dataModel, String templateFolder) {
		conf = loadConfiguration(templateFolder);
		for(String template : templates){
			try {
				String javaFileName = template.replace(".ftl", ".java");
				conf.getTemplate(template).process(dataModel, new FileWriter(new File("freemarker-output/"+javaFileName)) );
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
	        conf.setDefaultEncoding("UTF-8");
	        conf.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		}
		
		return conf;
		
	}
	
}
