package com.jibw.bridge;

public class PersistenceClient {
	
	public static void main(String args[] ) {
		
		Object obj = new Object();
		
		//Read config storage medium (filesystem or db )
		boolean saveToFileSystem = false;
		
		//Read config to get log level		
		boolean logLevelHigh = true;
		
		if(logLevelHigh == true) {
			if(saveToFileSystem == true) {
				new InstrumentedPersistenceImpl(new FileSystemPersistenceImplementor()).save(obj);
			} else {
				new InstrumentedPersistenceImpl(new DatabasePersistenceImplementor()).save(obj);
			}			
			
		} else {
			if(saveToFileSystem == true) {
				new PersistenceAbstraction(new FileSystemPersistenceImplementor()).save(obj);
			} else {
				new PersistenceAbstraction(new DatabasePersistenceImplementor()).save(obj);
			}
		}
	}

}
