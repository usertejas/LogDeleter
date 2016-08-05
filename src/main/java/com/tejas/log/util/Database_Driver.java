package com.tejas.log.util;

import java.sql.DriverManager;
import java.sql.Connection;


 

public class Database_Driver {

	
	public Connection getDriver(String JDBC_Driver,String DBString){
		Connection connect = null;
		 try {
			 Class.forName(JDBC_Driver);
			 connect = DriverManager.getConnection(DBString);

		 }catch(Exception e){
			 System.out.println(e.toString());
		 }finally{
			 
		 }
		return connect;
	}
}
