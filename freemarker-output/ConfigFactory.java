//package

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//import ConfigBuilder

public class ConfigFactory {

	private static Config config;
	
	private ConfigFactory(){
		//empty
	}
	
	public static Config getConfig(){
		if(config == null){
			//loading configurations
	    	Properties configProp = new Properties();
	    	InputStream in = Config.class.getClassLoader().getResourceAsStream("app.properties");
	    	
	    	try {
				configProp.load(in);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	
	    		    	String MAX_DESCRIPTION_BYTES_NUMBER 	= configProp.getProperty("MAX_DESCRIPTION_BYTES_NUMBER"	);
	    	String JETTY_WEB_PORT_GET_ENV 	= configProp.getProperty("JETTY_WEB_PORT_GET_ENV"	);
	    	String EMAIL_SUBJECT 	= configProp.getProperty("EMAIL_SUBJECT"	);
	    	String YOUTUBE_ALLOWED_EXTENSIONS 	= configProp.getProperty("YOUTUBE_ALLOWED_EXTENSIONS"	);
	    	String PG_VIDEO_BASE_URL 	= configProp.getProperty("PG_VIDEO_BASE_URL"	);
	    	String YOUTUBE_CLIENT_SECRET 	= configProp.getProperty("YOUTUBE_CLIENT_SECRET"	);
	    	String JETTY_CONTEXT_PATH 	= configProp.getProperty("JETTY_CONTEXT_PATH"	);
	    	String MAX_TITLE_CHARS_NUMBER 	= configProp.getProperty("MAX_TITLE_CHARS_NUMBER"	);
	    	String PROXY_HOST 	= configProp.getProperty("PROXY_HOST"	);
	    	String EMAIL_HOST 	= configProp.getProperty("EMAIL_HOST"	);
	    	String MAX_TAGS_CHARS_NUMBER 	= configProp.getProperty("MAX_TAGS_CHARS_NUMBER"	);
	    	String YOUTUBE_CLIENT_ID 	= configProp.getProperty("YOUTUBE_CLIENT_ID"	);
	    	String JETTY_WEB_PORT 	= configProp.getProperty("JETTY_WEB_PORT"	);
	    	String JETTY_WEBAPP_DIR_LOCATION 	= configProp.getProperty("JETTY_WEBAPP_DIR_LOCATION"	);
	    	String PROXY_PORT 	= configProp.getProperty("PROXY_PORT"	);
	    	String EMAIL_FROM 	= configProp.getProperty("EMAIL_FROM"	);
	    	String JETTY_DESCRIPTOR_PATH 	= configProp.getProperty("JETTY_DESCRIPTOR_PATH"	);
	    	String EMAIL_TO 	= configProp.getProperty("EMAIL_TO"	);
	    	String YOUTUBE_REFRESH_TOKEN 	= configProp.getProperty("YOUTUBE_REFRESH_TOKEN"	);
	    	
			config = new ConfigBuilder().
		    		MAX_DESCRIPTION_BYTES_NUMBER(MAX_DESCRIPTION_BYTES_NUMBER).
		    		JETTY_WEB_PORT_GET_ENV(JETTY_WEB_PORT_GET_ENV).
		    		EMAIL_SUBJECT(EMAIL_SUBJECT).
		    		YOUTUBE_ALLOWED_EXTENSIONS(YOUTUBE_ALLOWED_EXTENSIONS).
		    		PG_VIDEO_BASE_URL(PG_VIDEO_BASE_URL).
		    		YOUTUBE_CLIENT_SECRET(YOUTUBE_CLIENT_SECRET).
		    		JETTY_CONTEXT_PATH(JETTY_CONTEXT_PATH).
		    		MAX_TITLE_CHARS_NUMBER(MAX_TITLE_CHARS_NUMBER).
		    		PROXY_HOST(PROXY_HOST).
		    		EMAIL_HOST(EMAIL_HOST).
		    		MAX_TAGS_CHARS_NUMBER(MAX_TAGS_CHARS_NUMBER).
		    		YOUTUBE_CLIENT_ID(YOUTUBE_CLIENT_ID).
		    		JETTY_WEB_PORT(JETTY_WEB_PORT).
		    		JETTY_WEBAPP_DIR_LOCATION(JETTY_WEBAPP_DIR_LOCATION).
		    		PROXY_PORT(PROXY_PORT).
		    		EMAIL_FROM(EMAIL_FROM).
		    		JETTY_DESCRIPTOR_PATH(JETTY_DESCRIPTOR_PATH).
		    		EMAIL_TO(EMAIL_TO).
		    		YOUTUBE_REFRESH_TOKEN(YOUTUBE_REFRESH_TOKEN).
					build();
		}
		return config;
	}
	
}
