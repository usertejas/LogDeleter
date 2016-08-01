package com.tejas.log.LogDeleter;


import java.util.ArrayList;
import java.util.HashMap;


public class Application {

 
	private String appicationName;
	private String logSource;
	private ArrayList <String> appicationServer;
	private HashMap <String, Integer> LogDetails;
	
	public String getAppicationName() {
		return appicationName;
	}
	public void setAppicationName(String appicationName) {
		this.appicationName = appicationName;
	}
	public String getLogSource() {
		return logSource;
	}
	public void setLogSource(String logSource) {
		this.logSource = logSource;
	}
	public ArrayList<String> getAppicationServer() {
		return appicationServer;
	}
	public void setAppicationServer(ArrayList<String> appicationServer) {
		this.appicationServer = appicationServer;
	}
	public HashMap<String, Integer> getLogDetails() {
		return LogDetails;
	}
	public void setLogDetails(HashMap<String, Integer> logDetails) {
		LogDetails = logDetails;
	}
	
	
}
	