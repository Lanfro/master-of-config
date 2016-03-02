//package

import org.apache.log4j.Logger;

public class ConfigImpl implements Config{

	final static Logger logger = Logger.getLogger(ConfigImpl.class);
	
			
			private final static String default_EMAIL_SUBJECT 	= "YOUTUBE Video";
	    
		
		  	private final static Integer default_MAX_DESCRIPTION_BYTES_NUMBER 	= 5000;
	    
		
			private final static String default_EMAIL_HOST 	= "hermes.paginegialle.it";
	    
		
		  	private final static Integer default_MAX_UPLOAD_SIZE_SLEEP_MILLIS 	= 10000;
	    
		
			private final static String default_PG_VIDEO_BASE_URL 	= "http://video.paginegialle.it";
	    
		
			private final static String default_JNDI_YOUTUBE_WRAPPER 	= "YoutubeWrapper";
	    
		
			private final static String default_YOUTUBE_APPLICATION_NAME 	= "pg-youtube-wrapper";
	    
		
			private final static String default_YOUTUBE_CREDENTIAL_DATA_STORE 	= "managevideo";
	    
		
			private final static String default_YOUTUBE_REFRESH_TOKEN 	= "4/dT2xc6ldgfX6T5CmC0gRnLB8yYZNXONFhBmg1lfkHdg.0hCl6OqF8lcRYFZr95uygvVxtphtmAI";
	    
		
		  	private final static Integer default_PROXY_PORT 	= 8080;
	    
		
			private final static String default_JETTY_WEBAPP_DIR_LOCATION 	= "src/main/webapp/";
	    
		
		  	private final static Integer default_JETTY_WEB_PORT 	= 8083;
	    
		
			private final static String default_EMAIL_FROM 	= "script@seat.it";
	    
		
			private final static String default_YOUTUBE_ALLOWED_EXTENSIONS 	= "MOV,MPEG4,MP4,AVI,WMV,MPEGPS,FLV,3GPP,WebM,MPG";
	    
		
		  	private final static Integer default_MAX_TITLE_CHARS_NUMBER 	= 100;
	    
		
			private final static String default_YOUTUBE_CLIENT_ID 	= "665601534098-he87gknj0ugl86gcda2cn46taskv212a.apps.googleusercontent.com";
	    
		
			private final static String default_EMAIL_TO 	= "f3879@seat.it";
	    
		
		  	private final static Integer default_MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS 	= 15;
	    
		
		  	private final static Integer default_MAX_TAGS_CHARS_NUMBER 	= 500;
	    
		
			private final static String default_JETTY_CONTEXT_PATH 	= "/";
	    
		
			private final static String default_YOUTUBE_CLIENT_SECRET 	= "5N1GpKK_Vxl6EpnQyVF2o3UJ";
	    
		
			private final static String default_JETTY_DESCRIPTOR_PATH 	= "/WEB-INF/web.xml";
	    
		
			private final static String default_JETTY_WEB_PORT_GET_ENV 	= "PORT";
	    
		
			private final static String default_PROXY_HOST 	= "proxy-dmz.pgol.net";
	    
	
	    private static String EMAIL_SUBJECT;
	    
	    private static Integer MAX_DESCRIPTION_BYTES_NUMBER;
	    
	    private static String EMAIL_HOST;
	    
	    private static Integer MAX_UPLOAD_SIZE_SLEEP_MILLIS;
	    
	    private static String PG_VIDEO_BASE_URL;
	    
	    private static String JNDI_YOUTUBE_WRAPPER;
	    
	    private static String YOUTUBE_APPLICATION_NAME;
	    
	    private static String YOUTUBE_CREDENTIAL_DATA_STORE;
	    
	    private static String YOUTUBE_REFRESH_TOKEN;
	    
	    private static Integer PROXY_PORT;
	    
	    private static String JETTY_WEBAPP_DIR_LOCATION;
	    
	    private static Integer JETTY_WEB_PORT;
	    
	    private static String EMAIL_FROM;
	    
	    private static String YOUTUBE_ALLOWED_EXTENSIONS;
	    
	    private static Integer MAX_TITLE_CHARS_NUMBER;
	    
	    private static String YOUTUBE_CLIENT_ID;
	    
	    private static String EMAIL_TO;
	    
	    private static Integer MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS;
	    
	    private static Integer MAX_TAGS_CHARS_NUMBER;
	    
	    private static String JETTY_CONTEXT_PATH;
	    
	    private static String YOUTUBE_CLIENT_SECRET;
	    
	    private static String JETTY_DESCRIPTOR_PATH;
	    
	    private static String JETTY_WEB_PORT_GET_ENV;
	    
	    private static String PROXY_HOST;
	    
		
	public static class ConfigBuilder {
	   	private String EMAIL_SUBJECT;
	   	private Integer MAX_DESCRIPTION_BYTES_NUMBER;
	   	private String EMAIL_HOST;
	   	private Integer MAX_UPLOAD_SIZE_SLEEP_MILLIS;
	   	private String PG_VIDEO_BASE_URL;
	   	private String JNDI_YOUTUBE_WRAPPER;
	   	private String YOUTUBE_APPLICATION_NAME;
	   	private String YOUTUBE_CREDENTIAL_DATA_STORE;
	   	private String YOUTUBE_REFRESH_TOKEN;
	   	private Integer PROXY_PORT;
	   	private String JETTY_WEBAPP_DIR_LOCATION;
	   	private Integer JETTY_WEB_PORT;
	   	private String EMAIL_FROM;
	   	private String YOUTUBE_ALLOWED_EXTENSIONS;
	   	private Integer MAX_TITLE_CHARS_NUMBER;
	   	private String YOUTUBE_CLIENT_ID;
	   	private String EMAIL_TO;
	   	private Integer MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS;
	   	private Integer MAX_TAGS_CHARS_NUMBER;
	   	private String JETTY_CONTEXT_PATH;
	   	private String YOUTUBE_CLIENT_SECRET;
	   	private String JETTY_DESCRIPTOR_PATH;
	   	private String JETTY_WEB_PORT_GET_ENV;
	   	private String PROXY_HOST;
				
		ConfigBuilder(){
			//empty
		}
		
	   	ConfigBuilder EMAIL_SUBJECT(String val){
			EMAIL_SUBJECT = assignValue(val, default_EMAIL_SUBJECT);
			logger.debug("EMAIL_SUBJECT:"+EMAIL_SUBJECT);
			return this;
		}
	   	ConfigBuilder MAX_DESCRIPTION_BYTES_NUMBER(Integer val){
			MAX_DESCRIPTION_BYTES_NUMBER = assignValue(val, default_MAX_DESCRIPTION_BYTES_NUMBER);
			logger.debug("MAX_DESCRIPTION_BYTES_NUMBER:"+MAX_DESCRIPTION_BYTES_NUMBER);
			return this;
		}
	   	ConfigBuilder EMAIL_HOST(String val){
			EMAIL_HOST = assignValue(val, default_EMAIL_HOST);
			logger.debug("EMAIL_HOST:"+EMAIL_HOST);
			return this;
		}
	   	ConfigBuilder MAX_UPLOAD_SIZE_SLEEP_MILLIS(Integer val){
			MAX_UPLOAD_SIZE_SLEEP_MILLIS = assignValue(val, default_MAX_UPLOAD_SIZE_SLEEP_MILLIS);
			logger.debug("MAX_UPLOAD_SIZE_SLEEP_MILLIS:"+MAX_UPLOAD_SIZE_SLEEP_MILLIS);
			return this;
		}
	   	ConfigBuilder PG_VIDEO_BASE_URL(String val){
			PG_VIDEO_BASE_URL = assignValue(val, default_PG_VIDEO_BASE_URL);
			logger.debug("PG_VIDEO_BASE_URL:"+PG_VIDEO_BASE_URL);
			return this;
		}
	   	ConfigBuilder JNDI_YOUTUBE_WRAPPER(String val){
			JNDI_YOUTUBE_WRAPPER = assignValue(val, default_JNDI_YOUTUBE_WRAPPER);
			logger.debug("JNDI_YOUTUBE_WRAPPER:"+JNDI_YOUTUBE_WRAPPER);
			return this;
		}
	   	ConfigBuilder YOUTUBE_APPLICATION_NAME(String val){
			YOUTUBE_APPLICATION_NAME = assignValue(val, default_YOUTUBE_APPLICATION_NAME);
			logger.debug("YOUTUBE_APPLICATION_NAME:"+YOUTUBE_APPLICATION_NAME);
			return this;
		}
	   	ConfigBuilder YOUTUBE_CREDENTIAL_DATA_STORE(String val){
			YOUTUBE_CREDENTIAL_DATA_STORE = assignValue(val, default_YOUTUBE_CREDENTIAL_DATA_STORE);
			logger.debug("YOUTUBE_CREDENTIAL_DATA_STORE:"+YOUTUBE_CREDENTIAL_DATA_STORE);
			return this;
		}
	   	ConfigBuilder YOUTUBE_REFRESH_TOKEN(String val){
			YOUTUBE_REFRESH_TOKEN = assignValue(val, default_YOUTUBE_REFRESH_TOKEN);
			logger.debug("YOUTUBE_REFRESH_TOKEN:"+YOUTUBE_REFRESH_TOKEN);
			return this;
		}
	   	ConfigBuilder PROXY_PORT(Integer val){
			PROXY_PORT = assignValue(val, default_PROXY_PORT);
			logger.debug("PROXY_PORT:"+PROXY_PORT);
			return this;
		}
	   	ConfigBuilder JETTY_WEBAPP_DIR_LOCATION(String val){
			JETTY_WEBAPP_DIR_LOCATION = assignValue(val, default_JETTY_WEBAPP_DIR_LOCATION);
			logger.debug("JETTY_WEBAPP_DIR_LOCATION:"+JETTY_WEBAPP_DIR_LOCATION);
			return this;
		}
	   	ConfigBuilder JETTY_WEB_PORT(Integer val){
			JETTY_WEB_PORT = assignValue(val, default_JETTY_WEB_PORT);
			logger.debug("JETTY_WEB_PORT:"+JETTY_WEB_PORT);
			return this;
		}
	   	ConfigBuilder EMAIL_FROM(String val){
			EMAIL_FROM = assignValue(val, default_EMAIL_FROM);
			logger.debug("EMAIL_FROM:"+EMAIL_FROM);
			return this;
		}
	   	ConfigBuilder YOUTUBE_ALLOWED_EXTENSIONS(String val){
			YOUTUBE_ALLOWED_EXTENSIONS = assignValue(val, default_YOUTUBE_ALLOWED_EXTENSIONS);
			logger.debug("YOUTUBE_ALLOWED_EXTENSIONS:"+YOUTUBE_ALLOWED_EXTENSIONS);
			return this;
		}
	   	ConfigBuilder MAX_TITLE_CHARS_NUMBER(Integer val){
			MAX_TITLE_CHARS_NUMBER = assignValue(val, default_MAX_TITLE_CHARS_NUMBER);
			logger.debug("MAX_TITLE_CHARS_NUMBER:"+MAX_TITLE_CHARS_NUMBER);
			return this;
		}
	   	ConfigBuilder YOUTUBE_CLIENT_ID(String val){
			YOUTUBE_CLIENT_ID = assignValue(val, default_YOUTUBE_CLIENT_ID);
			logger.debug("YOUTUBE_CLIENT_ID:"+YOUTUBE_CLIENT_ID);
			return this;
		}
	   	ConfigBuilder EMAIL_TO(String val){
			EMAIL_TO = assignValue(val, default_EMAIL_TO);
			logger.debug("EMAIL_TO:"+EMAIL_TO);
			return this;
		}
	   	ConfigBuilder MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS(Integer val){
			MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS = assignValue(val, default_MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS);
			logger.debug("MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS:"+MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS);
			return this;
		}
	   	ConfigBuilder MAX_TAGS_CHARS_NUMBER(Integer val){
			MAX_TAGS_CHARS_NUMBER = assignValue(val, default_MAX_TAGS_CHARS_NUMBER);
			logger.debug("MAX_TAGS_CHARS_NUMBER:"+MAX_TAGS_CHARS_NUMBER);
			return this;
		}
	   	ConfigBuilder JETTY_CONTEXT_PATH(String val){
			JETTY_CONTEXT_PATH = assignValue(val, default_JETTY_CONTEXT_PATH);
			logger.debug("JETTY_CONTEXT_PATH:"+JETTY_CONTEXT_PATH);
			return this;
		}
	   	ConfigBuilder YOUTUBE_CLIENT_SECRET(String val){
			YOUTUBE_CLIENT_SECRET = assignValue(val, default_YOUTUBE_CLIENT_SECRET);
			logger.debug("YOUTUBE_CLIENT_SECRET:"+YOUTUBE_CLIENT_SECRET);
			return this;
		}
	   	ConfigBuilder JETTY_DESCRIPTOR_PATH(String val){
			JETTY_DESCRIPTOR_PATH = assignValue(val, default_JETTY_DESCRIPTOR_PATH);
			logger.debug("JETTY_DESCRIPTOR_PATH:"+JETTY_DESCRIPTOR_PATH);
			return this;
		}
	   	ConfigBuilder JETTY_WEB_PORT_GET_ENV(String val){
			JETTY_WEB_PORT_GET_ENV = assignValue(val, default_JETTY_WEB_PORT_GET_ENV);
			logger.debug("JETTY_WEB_PORT_GET_ENV:"+JETTY_WEB_PORT_GET_ENV);
			return this;
		}
	   	ConfigBuilder PROXY_HOST(String val){
			PROXY_HOST = assignValue(val, default_PROXY_HOST);
			logger.debug("PROXY_HOST:"+PROXY_HOST);
			return this;
		}
		
		private String assignValue(String val, String defaultValue){
			String newVal;
			if(val == null){
				newVal = defaultValue;
			} else {
				newVal = val;
			}
			return newVal;
		}
		
		private Double assignValue(Double val, Double defaultValue){
			Double newVal;
			if(val == null){
				newVal = defaultValue;
			} else {
				newVal = val;
			}
			return newVal;
		}
		
		private Integer assignValue(Integer val, Integer defaultValue){
			Integer newVal;
			if(val == null){
				newVal = defaultValue;
			} else {
				newVal = val;
			}
			return newVal;
		}
				
		ConfigImpl build(){
			return new ConfigImpl(this);
		}
		
	}
	
	private ConfigImpl(ConfigBuilder configBuilder){
	   	EMAIL_SUBJECT = configBuilder.EMAIL_SUBJECT;
	   	MAX_DESCRIPTION_BYTES_NUMBER = configBuilder.MAX_DESCRIPTION_BYTES_NUMBER;
	   	EMAIL_HOST = configBuilder.EMAIL_HOST;
	   	MAX_UPLOAD_SIZE_SLEEP_MILLIS = configBuilder.MAX_UPLOAD_SIZE_SLEEP_MILLIS;
	   	PG_VIDEO_BASE_URL = configBuilder.PG_VIDEO_BASE_URL;
	   	JNDI_YOUTUBE_WRAPPER = configBuilder.JNDI_YOUTUBE_WRAPPER;
	   	YOUTUBE_APPLICATION_NAME = configBuilder.YOUTUBE_APPLICATION_NAME;
	   	YOUTUBE_CREDENTIAL_DATA_STORE = configBuilder.YOUTUBE_CREDENTIAL_DATA_STORE;
	   	YOUTUBE_REFRESH_TOKEN = configBuilder.YOUTUBE_REFRESH_TOKEN;
	   	PROXY_PORT = configBuilder.PROXY_PORT;
	   	JETTY_WEBAPP_DIR_LOCATION = configBuilder.JETTY_WEBAPP_DIR_LOCATION;
	   	JETTY_WEB_PORT = configBuilder.JETTY_WEB_PORT;
	   	EMAIL_FROM = configBuilder.EMAIL_FROM;
	   	YOUTUBE_ALLOWED_EXTENSIONS = configBuilder.YOUTUBE_ALLOWED_EXTENSIONS;
	   	MAX_TITLE_CHARS_NUMBER = configBuilder.MAX_TITLE_CHARS_NUMBER;
	   	YOUTUBE_CLIENT_ID = configBuilder.YOUTUBE_CLIENT_ID;
	   	EMAIL_TO = configBuilder.EMAIL_TO;
	   	MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS = configBuilder.MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS;
	   	MAX_TAGS_CHARS_NUMBER = configBuilder.MAX_TAGS_CHARS_NUMBER;
	   	JETTY_CONTEXT_PATH = configBuilder.JETTY_CONTEXT_PATH;
	   	YOUTUBE_CLIENT_SECRET = configBuilder.YOUTUBE_CLIENT_SECRET;
	   	JETTY_DESCRIPTOR_PATH = configBuilder.JETTY_DESCRIPTOR_PATH;
	   	JETTY_WEB_PORT_GET_ENV = configBuilder.JETTY_WEB_PORT_GET_ENV;
	   	PROXY_HOST = configBuilder.PROXY_HOST;
	    				
	}

	@Override
	public String getEMAIL_SUBJECT() {
		return EMAIL_SUBJECT;
	}
	@Override
	public Integer getMAX_DESCRIPTION_BYTES_NUMBER() {
		return MAX_DESCRIPTION_BYTES_NUMBER;
	}
	@Override
	public String getEMAIL_HOST() {
		return EMAIL_HOST;
	}
	@Override
	public Integer getMAX_UPLOAD_SIZE_SLEEP_MILLIS() {
		return MAX_UPLOAD_SIZE_SLEEP_MILLIS;
	}
	@Override
	public String getPG_VIDEO_BASE_URL() {
		return PG_VIDEO_BASE_URL;
	}
	@Override
	public String getJNDI_YOUTUBE_WRAPPER() {
		return JNDI_YOUTUBE_WRAPPER;
	}
	@Override
	public String getYOUTUBE_APPLICATION_NAME() {
		return YOUTUBE_APPLICATION_NAME;
	}
	@Override
	public String getYOUTUBE_CREDENTIAL_DATA_STORE() {
		return YOUTUBE_CREDENTIAL_DATA_STORE;
	}
	@Override
	public String getYOUTUBE_REFRESH_TOKEN() {
		return YOUTUBE_REFRESH_TOKEN;
	}
	@Override
	public Integer getPROXY_PORT() {
		return PROXY_PORT;
	}
	@Override
	public String getJETTY_WEBAPP_DIR_LOCATION() {
		return JETTY_WEBAPP_DIR_LOCATION;
	}
	@Override
	public Integer getJETTY_WEB_PORT() {
		return JETTY_WEB_PORT;
	}
	@Override
	public String getEMAIL_FROM() {
		return EMAIL_FROM;
	}
	@Override
	public String getYOUTUBE_ALLOWED_EXTENSIONS() {
		return YOUTUBE_ALLOWED_EXTENSIONS;
	}
	@Override
	public Integer getMAX_TITLE_CHARS_NUMBER() {
		return MAX_TITLE_CHARS_NUMBER;
	}
	@Override
	public String getYOUTUBE_CLIENT_ID() {
		return YOUTUBE_CLIENT_ID;
	}
	@Override
	public String getEMAIL_TO() {
		return EMAIL_TO;
	}
	@Override
	public Integer getMAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS() {
		return MAX_GET_UPLOAD_SIZE_RETRY_ATTEMPS;
	}
	@Override
	public Integer getMAX_TAGS_CHARS_NUMBER() {
		return MAX_TAGS_CHARS_NUMBER;
	}
	@Override
	public String getJETTY_CONTEXT_PATH() {
		return JETTY_CONTEXT_PATH;
	}
	@Override
	public String getYOUTUBE_CLIENT_SECRET() {
		return YOUTUBE_CLIENT_SECRET;
	}
	@Override
	public String getJETTY_DESCRIPTOR_PATH() {
		return JETTY_DESCRIPTOR_PATH;
	}
	@Override
	public String getJETTY_WEB_PORT_GET_ENV() {
		return JETTY_WEB_PORT_GET_ENV;
	}
	@Override
	public String getPROXY_HOST() {
		return PROXY_HOST;
	}
	
}
