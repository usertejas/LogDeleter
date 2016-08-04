package com.tejas.log.LogDeleter;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import com.tejas.log.util.LogRetention;
import com.tejas.log.util.fileCheck;; 
// @formatter:on
;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Application rhse = new Application();
        rhse.setAppicationName("rhse");
       // /* 
             rhse.setLogSource("/Users/tpatil/logs/rhse");
        ArrayList<String> servernameforRHSE = new ArrayList<String>();
       servernameforRHSE.add("rhse-001");
        servernameforRHSE.add("rhse-402");
        servernameforRHSE.add("RHSE-403");
   
        HashMap<String, Integer> rhseLogDetails = new HashMap<String, Integer>();
        
        rhseLogDetails.put("INIFILE	",	 1);
        rhseLogDetails.put("TokenDetails",	 1);
        
        
        rhseLogDetails.put("enet_http_headers",	 1);
        rhseLogDetails.put("booking_pl_timings",	1);
        rhseLogDetails.put("booking_parse_failures", 1);
        rhseLogDetails.put("agoda_pl_timings", 1);
        rhseLogDetails.put("enet_http_failures", 1);
        rhseLogDetails.put("enet_pl_timings", 1);
        rhseLogDetails.put("hotel", 1);
        rhseLogDetails.put("gdsstatsrequest",1);
        rhseLogDetails.put("gdsstats",1);
        rhseLogDetails.put("pegs_pl_timings",1);
        rhseLogDetails.put("pegs_parse_failures", 1);
        rhseLogDetails.put("room_description",1 );
        rhseLogDetails.put("sql",1 );
        rhseLogDetails.put("slow_sql",1 );
        rhseLogDetails.put("searchstats", 1);
        rhseLogDetails.put("tourico_pl_timings", 1);
        rhseLogDetails.put("WSMQ_Server", 1);
        rhseLogDetails.put("WSMQ_Discard", 1);
        rhseLogDetails.put("pegs_parse_failures", 1);
        
  
        rhse.setAppicationServer(servernameforRHSE);
        rhse.setLogDetails(rhseLogDetails);
        
      
         new logDeleter(rhse).logdeleter();
     
  
    }
    
}