package com.tejas.log.DAO;

import java.util.HashSet;

import com.tejas.log.DTO.serverlistDTO;

public class serverlistDAO {

	
	public void insert(serverlistDTO serverlist){
     //MYSQL insert insert into serverlist table
		//insert into serverlist (servername , application_name) 
	//	values  ('ash1-rhse-401', 'rhse')
		
	}
	
	public HashSet<String> getallserver(String applicationName){
		//MYSQL select statement to get all server for a particular application.
	//	select * from serverlist where application_name =?;
		
		return null;
	}
	
}
