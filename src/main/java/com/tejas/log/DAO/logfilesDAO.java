package com.tejas.log.DAO;

import java.util.HashMap;

public class logfilesDAO {

	public void insert(logfilesDAO logfile){
		
		//logfiles  MYSQL insert statement
		//insert into logfiles (application_id , logname, logretention)
		  //values (1,'WSMQ_Server',1)
		
		
	}
	
	
	public HashMap<String,Integer> getlogfiles(int applicationID){
		// MYSQL select statement to get all logfile name and their retention period  for application 
		// select * from logfiles where application_id= ?;
		
		
		return null;
	}
	
	
	
}
