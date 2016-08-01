package com.tejas.log.util;

import java.util.HashMap;

public class LogRetention {

	public static int findRetensionPeriod(HashMap<String,Integer> logDeatils,String logFile){
		
		if(logDeatils.containsKey(logFile))		
		return logDeatils.get(logFile);
		else
			return -1;
	}
	
}
