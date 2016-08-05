package com.tejas.log.DAO;

import java.util.ArrayList;

import com.tejas.log.DTO.ApplicationDTO;

public class applicationDAO {

	
public void insert(ApplicationDTO application){
	
	//mysql insert statement;
	//insert into application (application_name, application_log_path, application_creation_date)
	//values('rhse','/Users/tpatil/logs/rhse',now());
	
	
		
}


public ApplicationDTO getApplication(int  application_ID){
	
	//mysql select statement with where clause;
	//select * from application where application_id = ?;

		
	return null;
}


public ArrayList<ApplicationDTO> getAllApplication(){
	
	//mysql select statement for all records;
	//select * from application
	return null;
}


	
	
}
