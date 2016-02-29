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
	    	
	    		    	String EMAIL_SUBJECT 	= configProp.getProperty("EMAIL_SUBJECT"	);
	    	String MAX_DESCRIPTION_BYTES_NUMBER 	= configProp.getProperty("MAX_DESCRIPTION_BYTES_NUMBER"	);
	    	String EMAIL_HOST 	= configProp.getProperty("EMAIL_HOST"	);
	    	String JETTY_WEBAPP_DIR_LOCATION 	= configProp.getProperty("JETTY_WEBAPP_DIR_LOCATION"	);
	    	String MAX_TITLE_CHARS_NUMBER 	= configProp.getProperty("MAX_TITLE_CHARS_NUMBER"	);
	    	String PROXY_PORT 	= configProp.getProperty("PROXY_PORT"	);
	    	String google.username 	= configProp.getProperty("google.username"	);
	    	String YOUTUBE_REFRESH_TOKEN 	= configProp.getProperty("YOUTUBE_REFRESH_TOKEN"	);
	    	String YOUTUBE_CLIENT_ID 	= configProp.getProperty("YOUTUBE_CLIENT_ID"	);
	    	String PG_VIDEO_BASE_URL 	= configProp.getProperty("PG_VIDEO_BASE_URL"	);
	    	String JETTY_WEB_PORT 	= configProp.getProperty("JETTY_WEB_PORT"	);
	    	String EMAIL_FROM 	= configProp.getProperty("EMAIL_FROM"	);
	    	String PROXY_HOST 	= configProp.getProperty("PROXY_HOST"	);
	    	String EMAIL_TO 	= configProp.getProperty("EMAIL_TO"	);
	    	String MAX_TAGS_CHARS_NUMBER 	= configProp.getProperty("MAX_TAGS_CHARS_NUMBER"	);
	    	String YOUTUBE_ALLOWED_EXTENSIONS 	= configProp.getProperty("YOUTUBE_ALLOWED_EXTENSIONS"	);
	    	String JETTY_CONTEXT_PATH 	= configProp.getProperty("JETTY_CONTEXT_PATH"	);
	    	String YOUTUBE_CLIENT_SECRET 	= configProp.getProperty("YOUTUBE_CLIENT_SECRET"	);
	    	String JETTY_DESCRIPTOR_PATH 	= configProp.getProperty("JETTY_DESCRIPTOR_PATH"	);
	    	String JETTY_WEB_PORT_GET_ENV 	= configProp.getProperty("JETTY_WEB_PORT_GET_ENV"	);
	    	String google.password 	= configProp.getProperty("google.password"	);
	    	
			config = new ConfigBuilder().
		    		EMAIL_SUBJECT(EMAIL_SUBJECT).
		    		MAX_DESCRIPTION_BYTES_NUMBER(MAX_DESCRIPTION_BYTES_NUMBER).
		    		EMAIL_HOST(EMAIL_HOST).
		    		JETTY_WEBAPP_DIR_LOCATION(JETTY_WEBAPP_DIR_LOCATION).
		    		MAX_TITLE_CHARS_NUMBER(MAX_TITLE_CHARS_NUMBER).
		    		PROXY_PORT(PROXY_PORT).
		    		google.username(google.username).
		    		YOUTUBE_REFRESH_TOKEN(YOUTUBE_REFRESH_TOKEN).
		    		YOUTUBE_CLIENT_ID(YOUTUBE_CLIENT_ID).
		    		PG_VIDEO_BASE_URL(PG_VIDEO_BASE_URL).
		    		JETTY_WEB_PORT(JETTY_WEB_PORT).
		    		EMAIL_FROM(EMAIL_FROM).
		    		PROXY_HOST(PROXY_HOST).
		    		EMAIL_TO(EMAIL_TO).
		    		MAX_TAGS_CHARS_NUMBER(MAX_TAGS_CHARS_NUMBER).
		    		YOUTUBE_ALLOWED_EXTENSIONS(YOUTUBE_ALLOWED_EXTENSIONS).
		    		JETTY_CONTEXT_PATH(JETTY_CONTEXT_PATH).
		    		YOUTUBE_CLIENT_SECRET(YOUTUBE_CLIENT_SECRET).
		    		JETTY_DESCRIPTOR_PATH(JETTY_DESCRIPTOR_PATH).
		    		JETTY_WEB_PORT_GET_ENV(JETTY_WEB_PORT_GET_ENV).
		    		google.password(google.password).
					build();
		}
		return config;
	}
	
}
