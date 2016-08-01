package com.tejas.log.util;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.joda.time.DateTime;
import org.joda.time.Days;

//import com.priceline.log.Logdeleter.Appication;

public class fileCheck {

	//private String fileName;
	private final static DateTime todaysDate = new DateTime();
	private final static String pattern ="^([\\w\\-]+).((\\d\\d-\\d\\d-\\d\\d)|(\\d\\d\\d\\d-\\d\\d-\\d\\d))-\\d\\d-\\d\\d.log.gz";
	
	static public boolean canbeDeleted(File filetoCheck, HashMap<String, Integer> logretention  ){
		System.out.println(filetoCheck.getName());
		String filename = filetoCheck.getName();
		 Pattern p = Pattern.compile(pattern);
	     Matcher m = p.matcher(filename);
	     
	     if (m.find()){
	    	       
	    	  SimpleDateFormat fileDate = new SimpleDateFormat("yy-MM-dd");
      	      SimpleDateFormat fileDate2 = new SimpleDateFormat("yyyy-MM-dd");
      	      String logFilename= m.group(1);
      	      
      	      int renetiontime = logretention.get(logFilename);
      	      
      	      String logFileDate = m.group(2);
      	      
      	         if(logFileDate.length()==8){
      	        	 
      	        	  try {
           			         Date D1 = fileDate.parse(logFileDate);
           			         DateTime dt =new DateTime(D1);
      					     System.out.println(D1);
      					     
      					     //Find Date differnce
      					     int time = Days.daysBetween(dt,todaysDate).getDays();
      					     System.out.println("Day differnce-:"+time);
      					             if(renetiontime<time){
      					            	 return true;
      					             }else{
      					            	 return false;
      					             }
      					            	 
      					     
      					     
      			        	} catch (ParseException e) {
      				        	// TODO Auto-generated catch block
      				        	e.printStackTrace();
      			           	}
      	        	 
      	          }else{
      	        	  
      	        	 if(logFileDate.length()==10){
             		   try {
     					     Date D1 = fileDate2.parse(logFileDate);
     					     DateTime dt =new DateTime(D1);
     					     System.out.println(D1);
     					     
     					     //Find Date differnce
     					     int time = Days.daysBetween(dt,todaysDate).getDays();
     					    System.out.println("Day differnce"+time);
     					              if(renetiontime<time){
     					    	        return true;
     					              }else{
     					            	return false;
     					              }
     					     
     				        } catch (ParseException e) {
     					          // TODO Auto-generated catch block
     					         e.printStackTrace();
     				      }
      	        	  
      	               }else{
      	            	 return false;
      	               }
      	      
      	      
	                }
		
	     }else{
	    	 return false;
	          }
		 
	 return false;
	  }
	
}
