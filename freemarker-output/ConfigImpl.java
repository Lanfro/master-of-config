//package

import org.apache.log4j.Logger;

public class ConfigImpl implements Config{

	final static Logger logger = Logger.getLogger(ConfigImpl.class);
	
			
			private final static String default_db_driver 	= "oracle.jdbc.OracleDriver";
	    
		
			private final static String default_SELECT_SFTPServers_FROM_AM 	= "SELECT fs.SERVER_NAME FROM FILE_TYPE ft INNER JOIN FILE_LOCATION fl ON ft.FILE_TYPE_ID = fl.FILE_TYPE_ID INNER JOIN FILE_SERVER fs ON fl.SERVER_NAME = fs.SERVER_NAME AND fl.ACCESS_TYPE = fs.ACCESS_TYPE WHERE fl.ACCESS_TYPE = 'SFTP' AND fl.VALID = 1 AND fs.VALID = 1 AND ft.VALID = 1";
	    
		
			private final static String default_orchestrator_commands_package 	= "it.spindox.reconciliation.commands";
	    
		
			private final static String default_UPDATE_SNAPSHOT_ERROR 	= "UPDATE SNAPSHOT SET ERROR = ? WHERE PHASE = ?";
	    
		
			private final static String default_db_password 	= "am_em_reconciliation";
	    
		
			private final static String default_DELETE_FROM_SNAPSHOT 	= "DELETE FROM SNAPSHOT";
	    
		
			private final static String default_db_connectionString 	= "jdbc:oracle:thin:@(DESCRIPTION = (ADDRESS_LIST = (ADDRESS = (PROTOCOL = TCP)(HOST = 10.130.4.6)(PORT = 1521)))(CONNECT_DATA = (SERVICE_NAME = TNI)))";
	    
		
			private final static String default_orchestrator_commands_cllasses 	= "XmlDownloadCommand,NormalizerCommand,ReportCreatorCommand,ReportExporterCommand";
	    
		
			private final static String default_UPDATE_SNAPSHOT_START_DATE 	= "UPDATE SNAPSHOT SET START_DATE = ? WHERE PHASE = ?";
	    
		
			private final static String default_INSERT_SNAPSHOT_PHASE 	= "INSERT INTO SNAPSHOT (PHASE) VALUES (?)";
	    
		
			private final static String default_UPDATE_SNAPSHOT_END_DATE 	= "UPDATE SNAPSHOT SET END_DATE = ? WHERE PHASE = ?";
	    
		
			private final static String default_SELECT_PHASE_FROM_SNAPSHOT 	= "SELECT PHASE FROM SNAPSHOT";
	    
		
			private final static String default_orchestrator_commands_interface 	= "Command";
	    
		
			private final static String default_SELECT_SFTPMetadata_FROM_AM 	= "SELECT fs.HOSTNAME, fs.PORT, fs.USERNAME, fs.PASSWORD, fs.ROOT_DIRECTORY, ft.REMOTE_DIRECTORY, ft.REMOTE_FILENAME, ft.LOCAL_DIRECTORY, ft.LOCAL_FILENAME FROM FILE_TYPE ft INNER JOIN FILE_LOCATION fl  ON ft.FILE_TYPE_ID = fl.FILE_TYPE_ID INNER JOIN FILE_SERVER fs ON fl.SERVER_NAME = fs.SERVER_NAME AND fl.ACCESS_TYPE = fs.ACCESS_TYPE WHERE fs.SERVER_NAME = ? AND fl.ACCESS_TYPE = 'SFTP'	AND fl.VALID = 1 AND fs.VALID = 1 AND ft.VALID = 1";
	    
		
			private final static String default_SELECT_AM_CREDENTIALS_FROM_OMCGC 	= "SELECT USERNAME, PASSWORD, HOST, PORT FROM AM_CREDENTIALS";
	    
		
			private final static String default_db_username 	= "am_em_reconciliation";
	    
	
	    private static String db_driver;
	    
	    private static String SELECT_SFTPServers_FROM_AM;
	    
	    private static String orchestrator_commands_package;
	    
	    private static String UPDATE_SNAPSHOT_ERROR;
	    
	    private static String db_password;
	    
	    private static String DELETE_FROM_SNAPSHOT;
	    
	    private static String db_connectionString;
	    
	    private static String orchestrator_commands_cllasses;
	    
	    private static String UPDATE_SNAPSHOT_START_DATE;
	    
	    private static String INSERT_SNAPSHOT_PHASE;
	    
	    private static String UPDATE_SNAPSHOT_END_DATE;
	    
	    private static String SELECT_PHASE_FROM_SNAPSHOT;
	    
	    private static String orchestrator_commands_interface;
	    
	    private static String SELECT_SFTPMetadata_FROM_AM;
	    
	    private static String SELECT_AM_CREDENTIALS_FROM_OMCGC;
	    
	    private static String db_username;
	    
		
	public static class ConfigBuilder {
	   	private String db_driver;
	   	private String SELECT_SFTPServers_FROM_AM;
	   	private String orchestrator_commands_package;
	   	private String UPDATE_SNAPSHOT_ERROR;
	   	private String db_password;
	   	private String DELETE_FROM_SNAPSHOT;
	   	private String db_connectionString;
	   	private String orchestrator_commands_cllasses;
	   	private String UPDATE_SNAPSHOT_START_DATE;
	   	private String INSERT_SNAPSHOT_PHASE;
	   	private String UPDATE_SNAPSHOT_END_DATE;
	   	private String SELECT_PHASE_FROM_SNAPSHOT;
	   	private String orchestrator_commands_interface;
	   	private String SELECT_SFTPMetadata_FROM_AM;
	   	private String SELECT_AM_CREDENTIALS_FROM_OMCGC;
	   	private String db_username;
				
		ConfigBuilder(){
			//empty
		}
		
	   	ConfigBuilder db_driver(String val){
			db_driver = assignValue(val, default_db_driver);
			logger.debug("db_driver:"+db_driver);
			return this;
		}
	   	ConfigBuilder SELECT_SFTPServers_FROM_AM(String val){
			SELECT_SFTPServers_FROM_AM = assignValue(val, default_SELECT_SFTPServers_FROM_AM);
			logger.debug("SELECT_SFTPServers_FROM_AM:"+SELECT_SFTPServers_FROM_AM);
			return this;
		}
	   	ConfigBuilder orchestrator_commands_package(String val){
			orchestrator_commands_package = assignValue(val, default_orchestrator_commands_package);
			logger.debug("orchestrator_commands_package:"+orchestrator_commands_package);
			return this;
		}
	   	ConfigBuilder UPDATE_SNAPSHOT_ERROR(String val){
			UPDATE_SNAPSHOT_ERROR = assignValue(val, default_UPDATE_SNAPSHOT_ERROR);
			logger.debug("UPDATE_SNAPSHOT_ERROR:"+UPDATE_SNAPSHOT_ERROR);
			return this;
		}
	   	ConfigBuilder db_password(String val){
			db_password = assignValue(val, default_db_password);
			logger.debug("db_password:"+db_password);
			return this;
		}
	   	ConfigBuilder DELETE_FROM_SNAPSHOT(String val){
			DELETE_FROM_SNAPSHOT = assignValue(val, default_DELETE_FROM_SNAPSHOT);
			logger.debug("DELETE_FROM_SNAPSHOT:"+DELETE_FROM_SNAPSHOT);
			return this;
		}
	   	ConfigBuilder db_connectionString(String val){
			db_connectionString = assignValue(val, default_db_connectionString);
			logger.debug("db_connectionString:"+db_connectionString);
			return this;
		}
	   	ConfigBuilder orchestrator_commands_cllasses(String val){
			orchestrator_commands_cllasses = assignValue(val, default_orchestrator_commands_cllasses);
			logger.debug("orchestrator_commands_cllasses:"+orchestrator_commands_cllasses);
			return this;
		}
	   	ConfigBuilder UPDATE_SNAPSHOT_START_DATE(String val){
			UPDATE_SNAPSHOT_START_DATE = assignValue(val, default_UPDATE_SNAPSHOT_START_DATE);
			logger.debug("UPDATE_SNAPSHOT_START_DATE:"+UPDATE_SNAPSHOT_START_DATE);
			return this;
		}
	   	ConfigBuilder INSERT_SNAPSHOT_PHASE(String val){
			INSERT_SNAPSHOT_PHASE = assignValue(val, default_INSERT_SNAPSHOT_PHASE);
			logger.debug("INSERT_SNAPSHOT_PHASE:"+INSERT_SNAPSHOT_PHASE);
			return this;
		}
	   	ConfigBuilder UPDATE_SNAPSHOT_END_DATE(String val){
			UPDATE_SNAPSHOT_END_DATE = assignValue(val, default_UPDATE_SNAPSHOT_END_DATE);
			logger.debug("UPDATE_SNAPSHOT_END_DATE:"+UPDATE_SNAPSHOT_END_DATE);
			return this;
		}
	   	ConfigBuilder SELECT_PHASE_FROM_SNAPSHOT(String val){
			SELECT_PHASE_FROM_SNAPSHOT = assignValue(val, default_SELECT_PHASE_FROM_SNAPSHOT);
			logger.debug("SELECT_PHASE_FROM_SNAPSHOT:"+SELECT_PHASE_FROM_SNAPSHOT);
			return this;
		}
	   	ConfigBuilder orchestrator_commands_interface(String val){
			orchestrator_commands_interface = assignValue(val, default_orchestrator_commands_interface);
			logger.debug("orchestrator_commands_interface:"+orchestrator_commands_interface);
			return this;
		}
	   	ConfigBuilder SELECT_SFTPMetadata_FROM_AM(String val){
			SELECT_SFTPMetadata_FROM_AM = assignValue(val, default_SELECT_SFTPMetadata_FROM_AM);
			logger.debug("SELECT_SFTPMetadata_FROM_AM:"+SELECT_SFTPMetadata_FROM_AM);
			return this;
		}
	   	ConfigBuilder SELECT_AM_CREDENTIALS_FROM_OMCGC(String val){
			SELECT_AM_CREDENTIALS_FROM_OMCGC = assignValue(val, default_SELECT_AM_CREDENTIALS_FROM_OMCGC);
			logger.debug("SELECT_AM_CREDENTIALS_FROM_OMCGC:"+SELECT_AM_CREDENTIALS_FROM_OMCGC);
			return this;
		}
	   	ConfigBuilder db_username(String val){
			db_username = assignValue(val, default_db_username);
			logger.debug("db_username:"+db_username);
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
	   	db_driver = configBuilder.db_driver;
	   	SELECT_SFTPServers_FROM_AM = configBuilder.SELECT_SFTPServers_FROM_AM;
	   	orchestrator_commands_package = configBuilder.orchestrator_commands_package;
	   	UPDATE_SNAPSHOT_ERROR = configBuilder.UPDATE_SNAPSHOT_ERROR;
	   	db_password = configBuilder.db_password;
	   	DELETE_FROM_SNAPSHOT = configBuilder.DELETE_FROM_SNAPSHOT;
	   	db_connectionString = configBuilder.db_connectionString;
	   	orchestrator_commands_cllasses = configBuilder.orchestrator_commands_cllasses;
	   	UPDATE_SNAPSHOT_START_DATE = configBuilder.UPDATE_SNAPSHOT_START_DATE;
	   	INSERT_SNAPSHOT_PHASE = configBuilder.INSERT_SNAPSHOT_PHASE;
	   	UPDATE_SNAPSHOT_END_DATE = configBuilder.UPDATE_SNAPSHOT_END_DATE;
	   	SELECT_PHASE_FROM_SNAPSHOT = configBuilder.SELECT_PHASE_FROM_SNAPSHOT;
	   	orchestrator_commands_interface = configBuilder.orchestrator_commands_interface;
	   	SELECT_SFTPMetadata_FROM_AM = configBuilder.SELECT_SFTPMetadata_FROM_AM;
	   	SELECT_AM_CREDENTIALS_FROM_OMCGC = configBuilder.SELECT_AM_CREDENTIALS_FROM_OMCGC;
	   	db_username = configBuilder.db_username;
	    				
	}

	@Override
	public String getdb_driver() {
		return db_driver;
	}
	@Override
	public String getSELECT_SFTPServers_FROM_AM() {
		return SELECT_SFTPServers_FROM_AM;
	}
	@Override
	public String getorchestrator_commands_package() {
		return orchestrator_commands_package;
	}
	@Override
	public String getUPDATE_SNAPSHOT_ERROR() {
		return UPDATE_SNAPSHOT_ERROR;
	}
	@Override
	public String getdb_password() {
		return db_password;
	}
	@Override
	public String getDELETE_FROM_SNAPSHOT() {
		return DELETE_FROM_SNAPSHOT;
	}
	@Override
	public String getdb_connectionString() {
		return db_connectionString;
	}
	@Override
	public String getorchestrator_commands_cllasses() {
		return orchestrator_commands_cllasses;
	}
	@Override
	public String getUPDATE_SNAPSHOT_START_DATE() {
		return UPDATE_SNAPSHOT_START_DATE;
	}
	@Override
	public String getINSERT_SNAPSHOT_PHASE() {
		return INSERT_SNAPSHOT_PHASE;
	}
	@Override
	public String getUPDATE_SNAPSHOT_END_DATE() {
		return UPDATE_SNAPSHOT_END_DATE;
	}
	@Override
	public String getSELECT_PHASE_FROM_SNAPSHOT() {
		return SELECT_PHASE_FROM_SNAPSHOT;
	}
	@Override
	public String getorchestrator_commands_interface() {
		return orchestrator_commands_interface;
	}
	@Override
	public String getSELECT_SFTPMetadata_FROM_AM() {
		return SELECT_SFTPMetadata_FROM_AM;
	}
	@Override
	public String getSELECT_AM_CREDENTIALS_FROM_OMCGC() {
		return SELECT_AM_CREDENTIALS_FROM_OMCGC;
	}
	@Override
	public String getdb_username() {
		return db_username;
	}
	
}
