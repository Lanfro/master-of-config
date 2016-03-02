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
	    	
	    	
				Integer MAX_DESCRIPTION_BYTES_NUMBER 	= Integer.parseInt(configProp.getProperty("MAX_DESCRIPTION_BYTES_NUMBER"	));
	    	
	    	
				String EMAIL_HOST 	= configProp.getProperty("EMAIL_HOST"	);
	    	
	    	
				Integer MAX_UPLOAD_SIZE_SLEEP_MILLIS 	= Integer.parseInt(configProp.getProperty("MAX_UPLOAD_SIZE_SLEEP_MILLIS"	));
	    	
	    	
				String PG_VIDEO_BASE_URL 	= configProp.getProperty("PG_VIDEO_BASE_URL"	);
	    	
	    	
				String JNDI_YOUTUBE_WRAPPER 	= configProp.getProperty("JNDI_YOUTUBE_WRAPPER"	);
	    	
	    	
				String YOUTUBE_APPLICATION_NAME 	= configProp.getProperty("YOUTUBE_APPLICATION_NAME"	);
	    	
	    	
				String YOUTUBE_CREDENTIAL_DATA_STORE 	= configProp.getProperty("YOUTUBE_CREDENTIAL_DATA_STORE"	);
	    	
	    	
				String YOUTUBE_REFRESH_TOKEN 	= configProp.getProperty("YOUTUBE_REFRESH_TOKEN"	);
	    	
	    	
				Integer PROXY_PORT 	= Integer.parseInt(configProp.getProperty("PROXY_PORT"	));
	    	
	    	
				String JETTY_WEBAPP_DIR_LOCATION 	= configProp.getProperty("JETTY_WEBAPP_DIR_LOCATION"	);
	    	
	    	
				Integer JETTY_WEB_PORT 	= Integer.parseInt(configProp.getProperty("JETTY_WEB_PORT"	));
	    	
	    	
				String EMAIL_FROM 	= configProp.getProperty("EMAIL_FROM"	);
	    	
	    	
				String YOUTUBE_ALLOWED_EXTENSIONS 	= configProp.getProperty("YOUTUBE_ALLOWED_EXTENSIONS"	);
	    	
	    	
				Integer MAX_TITLE_CHARS_NUMBER 	= Integer.parseInt(configProp.getProperty("MAX_TITLE_CHARS_NUMBER"	));
	    	
	    	
				String YOUTUBE_CLIENT_ID 	= configProp.getProperty("YOUTUBE_CLIENT_ID"	);
	    	
	    	
				String EMAIL_TO 	= configProp.getProperty("EMAIL_TO"	);
	    	
	    	
				Integer MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS 	= Integer.parseInt(configProp.getProperty("MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS"	));
	    	
	    	
				Integer MAX_TAGS_CHARS_NUMBER 	= Integer.parseInt(configProp.getProperty("MAX_TAGS_CHARS_NUMBER"	));
	    	
	    	
				String JETTY_CONTEXT_PATH 	= configProp.getProperty("JETTY_CONTEXT_PATH"	);
	    	
	    	
				String YOUTUBE_CLIENT_SECRET 	= configProp.getProperty("YOUTUBE_CLIENT_SECRET"	);
	    	
	    	
				String JETTY_DESCRIPTOR_PATH 	= configProp.getProperty("JETTY_DESCRIPTOR_PATH"	);
	    	
	    	
				String JETTY_WEB_PORT_GET_ENV 	= configProp.getProperty("JETTY_WEB_PORT_GET_ENV"	);
	    	
	    	
				String PROXY_HOST 	= configProp.getProperty("PROXY_HOST"	);
	    	
	    	
			config = new ConfigBuilder().
		    		EMAIL_SUBJECT(EMAIL_SUBJECT).
		    		MAX_DESCRIPTION_BYTES_NUMBER(MAX_DESCRIPTION_BYTES_NUMBER).
		    		EMAIL_HOST(EMAIL_HOST).
		    		MAX_UPLOAD_SIZE_SLEEP_MILLIS(MAX_UPLOAD_SIZE_SLEEP_MILLIS).
		    		PG_VIDEO_BASE_URL(PG_VIDEO_BASE_URL).
		    		JNDI_YOUTUBE_WRAPPER(JNDI_YOUTUBE_WRAPPER).
		    		YOUTUBE_APPLICATION_NAME(YOUTUBE_APPLICATION_NAME).
		    		YOUTUBE_CREDENTIAL_DATA_STORE(YOUTUBE_CREDENTIAL_DATA_STORE).
		    		YOUTUBE_REFRESH_TOKEN(YOUTUBE_REFRESH_TOKEN).
		    		PROXY_PORT(PROXY_PORT).
		    		JETTY_WEBAPP_DIR_LOCATION(JETTY_WEBAPP_DIR_LOCATION).
		    		JETTY_WEB_PORT(JETTY_WEB_PORT).
		    		EMAIL_FROM(EMAIL_FROM).
		    		YOUTUBE_ALLOWED_EXTENSIONS(YOUTUBE_ALLOWED_EXTENSIONS).
		    		MAX_TITLE_CHARS_NUMBER(MAX_TITLE_CHARS_NUMBER).
		    		YOUTUBE_CLIENT_ID(YOUTUBE_CLIENT_ID).
		    		EMAIL_TO(EMAIL_TO).
		    		MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS(MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS).
		    		MAX_TAGS_CHARS_NUMBER(MAX_TAGS_CHARS_NUMBER).
		    		JETTY_CONTEXT_PATH(JETTY_CONTEXT_PATH).
		    		YOUTUBE_CLIENT_SECRET(YOUTUBE_CLIENT_SECRET).
		    		JETTY_DESCRIPTOR_PATH(JETTY_DESCRIPTOR_PATH).
		    		JETTY_WEB_PORT_GET_ENV(JETTY_WEB_PORT_GET_ENV).
		    		PROXY_HOST(PROXY_HOST).
					build();
		}
		return config;
	}
	
}
