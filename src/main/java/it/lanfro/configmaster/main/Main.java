package it.lanfro.configmaster.main;
import it.lanfro.configmaster.engine.Master;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ) {
    	System.out.println("START");
    	String[] generatedFilePaths = Master.create();
    	System.out.println("Generated files:");
    	for(String s : generatedFilePaths){
    		System.out.println(s);
    	}
    	System.out.println("END");
    			
    }
}
