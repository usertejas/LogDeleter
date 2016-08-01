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
        rhse.setLogSource("/log/rhse");
        ArrayList<String> servernameforRHSE = new ArrayList<String>();
        servernameforRHSE.add("RHSE-401");
        servernameforRHSE.add("RHSE-402");
        servernameforRHSE.add("RHSE-403");
        rhse.setAppicationServer(servernameforRHSE);
        HashMap<String, Integer> rhseLogDetails = new HashMap<String, Integer>();
        rhseLogDetails.put("infra",	 7);
        rhseLogDetails.put("pl_timing",	365);
        rhseLogDetails.put("tomcat", 0);
        
        rhse.setLogDetails(rhseLogDetails);
        
        
     System.out.println(  LogRetention.findRetensionPeriod(rhseLogDetails, "infra"));
        
     System.out.println(  LogRetention.findRetensionPeriod(rhseLogDetails, "pl_timing"));
     System.out.println(  LogRetention.findRetensionPeriod(rhseLogDetails, "tomcat"));
     System.out.println(  LogRetention.findRetensionPeriod(rhseLogDetails, "isdf"));
     
     
 //    File f = new File("D:\\infra.16-07-30-23-12.log.gz");
  //   File f = new File("D:\\infra.2016-07-30-23-12.log.gz");
     File f = new File("D:/ProgramData");
     File[] kj = f.listFiles();
     File k = kj[0];
    System.out.println(fileCheck.canbeDeleted(k, rhse.getLogDetails()));
    if(fileCheck.canbeDeleted(k, rhse.getLogDetails())){
    	System.out.println("Deleting file");
    k.delete();
    }
    System.out.println("file");
        
    }
}