//package

import org.apache.log4j.Logger;

public class ConfigImpl implements Config{

	final static Logger logger = Logger.getLogger(ConfigImpl.class);
	
		    private final static String default_MAX_DESCRIPTION_BYTES_NUMBER 	= "5000";
	    
	    private final static String default_JETTY_WEB_PORT_GET_ENV 	= "PORT";
	    
	    private final static String default_EMAIL_SUBJECT 	= "";
	    
	    private final static String default_YOUTUBE_ALLOWED_EXTENSIONS 	= "MOV,MPEG4,MP4,AVI,WMV,MPEGPS,FLV,3GPP,WebM,MPG";
	    
	    private final static String default_PG_VIDEO_BASE_URL 	= "http://video.paginegialle.it";
	    
	    private final static String default_YOUTUBE_CLIENT_SECRET 	= "";
	    
	    private final static String default_JETTY_CONTEXT_PATH 	= "/";
	    
	    private final static String default_MAX_TITLE_CHARS_NUMBER 	= "100";
	    
	    private final static String default_PROXY_HOST 	= "";
	    
	    private final static String default_EMAIL_HOST 	= "hermes.paginegialle.it";
	    
	    private final static String default_MAX_TAGS_CHARS_NUMBER 	= "500";
	    
	    private final static String default_YOUTUBE_CLIENT_ID 	= "";
	    
	    private final static String default_JETTY_WEB_PORT 	= "8083";
	    
	    private final static String default_JETTY_WEBAPP_DIR_LOCATION 	= "src/main/webapp/";
	    
	    private final static String default_PROXY_PORT 	= "";
	    
	    private final static String default_EMAIL_FROM 	= "script@seat.it";
	    
	    private final static String default_JETTY_DESCRIPTOR_PATH 	= "/WEB-INF/web.xml";
	    
	    private final static String default_EMAIL_TO 	= "";
	    
	    private final static String default_YOUTUBE_REFRESH_TOKEN 	= "";
	    
	
	    private static String MAX_DESCRIPTION_BYTES_NUMBER;
	    
	    private static String JETTY_WEB_PORT_GET_ENV;
	    
	    private static String EMAIL_SUBJECT;
	    
	    private static String YOUTUBE_ALLOWED_EXTENSIONS;
	    
	    private static String PG_VIDEO_BASE_URL;
	    
	    private static String YOUTUBE_CLIENT_SECRET;
	    
	    private static String JETTY_CONTEXT_PATH;
	    
	    private static String MAX_TITLE_CHARS_NUMBER;
	    
	    private static String PROXY_HOST;
	    
	    private static String EMAIL_HOST;
	    
	    private static String MAX_TAGS_CHARS_NUMBER;
	    
	    private static String YOUTUBE_CLIENT_ID;
	    
	    private static String JETTY_WEB_PORT;
	    
	    private static String JETTY_WEBAPP_DIR_LOCATION;
	    
	    private static String PROXY_PORT;
	    
	    private static String EMAIL_FROM;
	    
	    private static String JETTY_DESCRIPTOR_PATH;
	    
	    private static String EMAIL_TO;
	    
	    private static String YOUTUBE_REFRESH_TOKEN;
	    
		
	public static class ConfigBuilder {
	   	private String MAX_DESCRIPTION_BYTES_NUMBER;
	   	private String JETTY_WEB_PORT_GET_ENV;
	   	private String EMAIL_SUBJECT;
	   	private String YOUTUBE_ALLOWED_EXTENSIONS;
	   	private String PG_VIDEO_BASE_URL;
	   	private String YOUTUBE_CLIENT_SECRET;
	   	private String JETTY_CONTEXT_PATH;
	   	private String MAX_TITLE_CHARS_NUMBER;
	   	private String PROXY_HOST;
	   	private String EMAIL_HOST;
	   	private String MAX_TAGS_CHARS_NUMBER;
	   	private String YOUTUBE_CLIENT_ID;
	   	private String JETTY_WEB_PORT;
	   	private String JETTY_WEBAPP_DIR_LOCATION;
	   	private String PROXY_PORT;
	   	private String EMAIL_FROM;
	   	private String JETTY_DESCRIPTOR_PATH;
	   	private String EMAIL_TO;
	   	private String YOUTUBE_REFRESH_TOKEN;
				
		ConfigBuilder(){
			//empty
		}
		
	   	ConfigBuilder MAX_DESCRIPTION_BYTES_NUMBER(String val){
			MAX_DESCRIPTION_BYTES_NUMBER = assignStringValue(val, default_MAX_DESCRIPTION_BYTES_NUMBER);
			logger.debug("MAX_DESCRIPTION_BYTES_NUMBER:"+MAX_DESCRIPTION_BYTES_NUMBER);
			return this;
		}
	   	ConfigBuilder JETTY_WEB_PORT_GET_ENV(String val){
			JETTY_WEB_PORT_GET_ENV = assignStringValue(val, default_JETTY_WEB_PORT_GET_ENV);
			logger.debug("JETTY_WEB_PORT_GET_ENV:"+JETTY_WEB_PORT_GET_ENV);
			return this;
		}
	   	ConfigBuilder EMAIL_SUBJECT(String val){
			EMAIL_SUBJECT = assignStringValue(val, default_EMAIL_SUBJECT);
			logger.debug("EMAIL_SUBJECT:"+EMAIL_SUBJECT);
			return this;
		}
	   	ConfigBuilder YOUTUBE_ALLOWED_EXTENSIONS(String val){
			YOUTUBE_ALLOWED_EXTENSIONS = assignStringValue(val, default_YOUTUBE_ALLOWED_EXTENSIONS);
			logger.debug("YOUTUBE_ALLOWED_EXTENSIONS:"+YOUTUBE_ALLOWED_EXTENSIONS);
			return this;
		}
	   	ConfigBuilder PG_VIDEO_BASE_URL(String val){
			PG_VIDEO_BASE_URL = assignStringValue(val, default_PG_VIDEO_BASE_URL);
			logger.debug("PG_VIDEO_BASE_URL:"+PG_VIDEO_BASE_URL);
			return this;
		}
	   	ConfigBuilder YOUTUBE_CLIENT_SECRET(String val){
			YOUTUBE_CLIENT_SECRET = assignStringValue(val, default_YOUTUBE_CLIENT_SECRET);
			logger.debug("YOUTUBE_CLIENT_SECRET:"+YOUTUBE_CLIENT_SECRET);
			return this;
		}
	   	ConfigBuilder JETTY_CONTEXT_PATH(String val){
			JETTY_CONTEXT_PATH = assignStringValue(val, default_JETTY_CONTEXT_PATH);
			logger.debug("JETTY_CONTEXT_PATH:"+JETTY_CONTEXT_PATH);
			return this;
		}
	   	ConfigBuilder MAX_TITLE_CHARS_NUMBER(String val){
			MAX_TITLE_CHARS_NUMBER = assignStringValue(val, default_MAX_TITLE_CHARS_NUMBER);
			logger.debug("MAX_TITLE_CHARS_NUMBER:"+MAX_TITLE_CHARS_NUMBER);
			return this;
		}
	   	ConfigBuilder PROXY_HOST(String val){
			PROXY_HOST = assignStringValue(val, default_PROXY_HOST);
			logger.debug("PROXY_HOST:"+PROXY_HOST);
			return this;
		}
	   	ConfigBuilder EMAIL_HOST(String val){
			EMAIL_HOST = assignStringValue(val, default_EMAIL_HOST);
			logger.debug("EMAIL_HOST:"+EMAIL_HOST);
			return this;
		}
	   	ConfigBuilder MAX_TAGS_CHARS_NUMBER(String val){
			MAX_TAGS_CHARS_NUMBER = assignStringValue(val, default_MAX_TAGS_CHARS_NUMBER);
			logger.debug("MAX_TAGS_CHARS_NUMBER:"+MAX_TAGS_CHARS_NUMBER);
			return this;
		}
	   	ConfigBuilder YOUTUBE_CLIENT_ID(String val){
			YOUTUBE_CLIENT_ID = assignStringValue(val, default_YOUTUBE_CLIENT_ID);
			logger.debug("YOUTUBE_CLIENT_ID:"+YOUTUBE_CLIENT_ID);
			return this;
		}
	   	ConfigBuilder JETTY_WEB_PORT(String val){
			JETTY_WEB_PORT = assignStringValue(val, default_JETTY_WEB_PORT);
			logger.debug("JETTY_WEB_PORT:"+JETTY_WEB_PORT);
			return this;
		}
	   	ConfigBuilder JETTY_WEBAPP_DIR_LOCATION(String val){
			JETTY_WEBAPP_DIR_LOCATION = assignStringValue(val, default_JETTY_WEBAPP_DIR_LOCATION);
			logger.debug("JETTY_WEBAPP_DIR_LOCATION:"+JETTY_WEBAPP_DIR_LOCATION);
			return this;
		}
	   	ConfigBuilder PROXY_PORT(String val){
			PROXY_PORT = assignStringValue(val, default_PROXY_PORT);
			logger.debug("PROXY_PORT:"+PROXY_PORT);
			return this;
		}
	   	ConfigBuilder EMAIL_FROM(String val){
			EMAIL_FROM = assignStringValue(val, default_EMAIL_FROM);
			logger.debug("EMAIL_FROM:"+EMAIL_FROM);
			return this;
		}
	   	ConfigBuilder JETTY_DESCRIPTOR_PATH(String val){
			JETTY_DESCRIPTOR_PATH = assignStringValue(val, default_JETTY_DESCRIPTOR_PATH);
			logger.debug("JETTY_DESCRIPTOR_PATH:"+JETTY_DESCRIPTOR_PATH);
			return this;
		}
	   	ConfigBuilder EMAIL_TO(String val){
			EMAIL_TO = assignStringValue(val, default_EMAIL_TO);
			logger.debug("EMAIL_TO:"+EMAIL_TO);
			return this;
		}
	   	ConfigBuilder YOUTUBE_REFRESH_TOKEN(String val){
			YOUTUBE_REFRESH_TOKEN = assignStringValue(val, default_YOUTUBE_REFRESH_TOKEN);
			logger.debug("YOUTUBE_REFRESH_TOKEN:"+YOUTUBE_REFRESH_TOKEN);
			return this;
		}
		
		private String assignStringValue(String val, String defaultValue){
			String newVal;
			if(val == null){
				newVal = defaultValue;
			} else {
				newVal = val;
			}
			return newVal;
		}
		
		/*
		private Integer assignIntegerValue(Integer val, Integer defaultValue){
			Integer newVal;
			if(val == null){
				newVal = defaultValue;
			} else {
				newVal = val;
			}
			return newVal;
		}
		*/
		
		ConfigImpl build(){
			return new ConfigImpl(this);
		}
		
	}
	
	private ConfigImpl(ConfigBuilder configBuilder){
	   	MAX_DESCRIPTION_BYTES_NUMBER = configBuilder.MAX_DESCRIPTION_BYTES_NUMBER;
	   	JETTY_WEB_PORT_GET_ENV = configBuilder.JETTY_WEB_PORT_GET_ENV;
	   	EMAIL_SUBJECT = configBuilder.EMAIL_SUBJECT;
	   	YOUTUBE_ALLOWED_EXTENSIONS = configBuilder.YOUTUBE_ALLOWED_EXTENSIONS;
	   	PG_VIDEO_BASE_URL = configBuilder.PG_VIDEO_BASE_URL;
	   	YOUTUBE_CLIENT_SECRET = configBuilder.YOUTUBE_CLIENT_SECRET;
	   	JETTY_CONTEXT_PATH = configBuilder.JETTY_CONTEXT_PATH;
	   	MAX_TITLE_CHARS_NUMBER = configBuilder.MAX_TITLE_CHARS_NUMBER;
	   	PROXY_HOST = configBuilder.PROXY_HOST;
	   	EMAIL_HOST = configBuilder.EMAIL_HOST;
	   	MAX_TAGS_CHARS_NUMBER = configBuilder.MAX_TAGS_CHARS_NUMBER;
	   	YOUTUBE_CLIENT_ID = configBuilder.YOUTUBE_CLIENT_ID;
	   	JETTY_WEB_PORT = configBuilder.JETTY_WEB_PORT;
	   	JETTY_WEBAPP_DIR_LOCATION = configBuilder.JETTY_WEBAPP_DIR_LOCATION;
	   	PROXY_PORT = configBuilder.PROXY_PORT;
	   	EMAIL_FROM = configBuilder.EMAIL_FROM;
	   	JETTY_DESCRIPTOR_PATH = configBuilder.JETTY_DESCRIPTOR_PATH;
	   	EMAIL_TO = configBuilder.EMAIL_TO;
	   	YOUTUBE_REFRESH_TOKEN = configBuilder.YOUTUBE_REFRESH_TOKEN;
	    				
	}

	@Override
	public String getMAX_DESCRIPTION_BYTES_NUMBER() {
		return MAX_DESCRIPTION_BYTES_NUMBER;
	}
	@Override
	public String getJETTY_WEB_PORT_GET_ENV() {
		return JETTY_WEB_PORT_GET_ENV;
	}
	@Override
	public String getEMAIL_SUBJECT() {
		return EMAIL_SUBJECT;
	}
	@Override
	public String getYOUTUBE_ALLOWED_EXTENSIONS() {
		return YOUTUBE_ALLOWED_EXTENSIONS;
	}
	@Override
	public String getPG_VIDEO_BASE_URL() {
		return PG_VIDEO_BASE_URL;
	}
	@Override
	public String getYOUTUBE_CLIENT_SECRET() {
		return YOUTUBE_CLIENT_SECRET;
	}
	@Override
	public String getJETTY_CONTEXT_PATH() {
		return JETTY_CONTEXT_PATH;
	}
	@Override
	public String getMAX_TITLE_CHARS_NUMBER() {
		return MAX_TITLE_CHARS_NUMBER;
	}
	@Override
	public String getPROXY_HOST() {
		return PROXY_HOST;
	}
	@Override
	public String getEMAIL_HOST() {
		return EMAIL_HOST;
	}
	@Override
	public String getMAX_TAGS_CHARS_NUMBER() {
		return MAX_TAGS_CHARS_NUMBER;
	}
	@Override
	public String getYOUTUBE_CLIENT_ID() {
		return YOUTUBE_CLIENT_ID;
	}
	@Override
	public String getJETTY_WEB_PORT() {
		return JETTY_WEB_PORT;
	}
	@Override
	public String getJETTY_WEBAPP_DIR_LOCATION() {
		return JETTY_WEBAPP_DIR_LOCATION;
	}
	@Override
	public String getPROXY_PORT() {
		return PROXY_PORT;
	}
	@Override
	public String getEMAIL_FROM() {
		return EMAIL_FROM;
	}
	@Override
	public String getJETTY_DESCRIPTOR_PATH() {
		return JETTY_DESCRIPTOR_PATH;
	}
	@Override
	public String getEMAIL_TO() {
		return EMAIL_TO;
	}
	@Override
	public String getYOUTUBE_REFRESH_TOKEN() {
		return YOUTUBE_REFRESH_TOKEN;
	}
	
}
