package com.tejas.log.util;

import java.util.HashMap;

public class LogRetention {
	private final int DEFAULT_RETENTION_DAYS=45;  

	public  int findRetensionPeriod(HashMap<String,Integer> logDeatils,String logFile){
		
		if(logDeatils.containsKey(logFile))		
		return logDeatils.get(logFile);
		else{
			//could not find the retnetion 
			//Add to log details database for that application.
			return DEFAULT_RETENTION_DAYS;
		}
	}
	
}
