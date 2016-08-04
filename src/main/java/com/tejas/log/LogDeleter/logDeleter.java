package com.tejas.log.LogDeleter;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;

import com.tejas.log.util.fileCheck;


public class logDeleter {

	private Application app ;
	private HashSet<String> serverList;
	private File[] serverArray= null;
	public logDeleter(Application app){
		this.app= app;
	}
	
	public void logdeleter(){
		
	try{
		File f = new File(app.getLogSource());
		serverArray =f.listFiles();
		
		for(File s : serverArray ){
			if(s.isDirectory()){
				System.out.println(s.getName()+"  is a Server ");
				//check if this server is in out records
				if(app.getAppicationServer().contains(s.getName())){
					System.out.println(s.getName()+"  is a Server in records ");
					//call traversal for this server
					traverselogDirectory(s);
				}else{
					app.getAppicationServer().add(s.getName());
					System.out.println(s.getName()+"  is a Server NOT in records ");
					//add the server in DB
					//call traversal for this server
					traverselogDirectory(s);
				}
				
				
			}
			
		}
		
	   }catch(Exception E){
		   System.out.println(E);
	   }
	}
	
	
	private void traverselogDirectory(File currentfilePath){
		
		if(currentfilePath.isFile()){
			System.out.println(currentfilePath.getName());
			//check if file can be deleted
			if(fileCheck.canbeDeleted(currentfilePath, app.getLogDetails())){
			currentfilePath.delete();
			}
		}
		if(currentfilePath.isDirectory()){
			String[] subNote = currentfilePath.list();
			for(String filename : subNote){
				traverselogDirectory(new File(currentfilePath, filename));
			}
		}
		
		 
	}
	
	
	
}
