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
	    	
	    		    	
				String db_driver 	= configProp.getProperty("db.driver"	);
	    	
	    	
				String SELECT_SFTPServers_FROM_AM 	= configProp.getProperty("SELECT_SFTPServers_FROM_AM"	);
	    	
	    	
				String orchestrator_commands_package 	= configProp.getProperty("orchestrator.commands.package"	);
	    	
	    	
				String UPDATE_SNAPSHOT_ERROR 	= configProp.getProperty("UPDATE_SNAPSHOT_ERROR"	);
	    	
	    	
				String db_password 	= configProp.getProperty("db.password"	);
	    	
	    	
				String DELETE_FROM_SNAPSHOT 	= configProp.getProperty("DELETE_FROM_SNAPSHOT"	);
	    	
	    	
				String db_connectionString 	= configProp.getProperty("db.connectionString"	);
	    	
	    	
				String orchestrator_commands_cllasses 	= configProp.getProperty("orchestrator.commands.cllasses"	);
	    	
	    	
				String UPDATE_SNAPSHOT_START_DATE 	= configProp.getProperty("UPDATE_SNAPSHOT_START_DATE"	);
	    	
	    	
				String INSERT_SNAPSHOT_PHASE 	= configProp.getProperty("INSERT_SNAPSHOT_PHASE"	);
	    	
	    	
				String UPDATE_SNAPSHOT_END_DATE 	= configProp.getProperty("UPDATE_SNAPSHOT_END_DATE"	);
	    	
	    	
				String SELECT_PHASE_FROM_SNAPSHOT 	= configProp.getProperty("SELECT_PHASE_FROM_SNAPSHOT"	);
	    	
	    	
				String orchestrator_commands_interface 	= configProp.getProperty("orchestrator.commands.interface"	);
	    	
	    	
				String SELECT_SFTPMetadata_FROM_AM 	= configProp.getProperty("SELECT_SFTPMetadata_FROM_AM"	);
	    	
	    	
				String SELECT_AM_CREDENTIALS_FROM_OMCGC 	= configProp.getProperty("SELECT_AM_CREDENTIALS_FROM_OMCGC"	);
	    	
	    	
				String db_username 	= configProp.getProperty("db.username"	);
	    	
	    	
			config = new ConfigBuilder().
		    		db_driver(db_driver).
		    		SELECT_SFTPServers_FROM_AM(SELECT_SFTPServers_FROM_AM).
		    		orchestrator_commands_package(orchestrator_commands_package).
		    		UPDATE_SNAPSHOT_ERROR(UPDATE_SNAPSHOT_ERROR).
		    		db_password(db_password).
		    		DELETE_FROM_SNAPSHOT(DELETE_FROM_SNAPSHOT).
		    		db_connectionString(db_connectionString).
		    		orchestrator_commands_cllasses(orchestrator_commands_cllasses).
		    		UPDATE_SNAPSHOT_START_DATE(UPDATE_SNAPSHOT_START_DATE).
		    		INSERT_SNAPSHOT_PHASE(INSERT_SNAPSHOT_PHASE).
		    		UPDATE_SNAPSHOT_END_DATE(UPDATE_SNAPSHOT_END_DATE).
		    		SELECT_PHASE_FROM_SNAPSHOT(SELECT_PHASE_FROM_SNAPSHOT).
		    		orchestrator_commands_interface(orchestrator_commands_interface).
		    		SELECT_SFTPMetadata_FROM_AM(SELECT_SFTPMetadata_FROM_AM).
		    		SELECT_AM_CREDENTIALS_FROM_OMCGC(SELECT_AM_CREDENTIALS_FROM_OMCGC).
		    		db_username(db_username).
					build();
		}
		return config;
	}
	
}
