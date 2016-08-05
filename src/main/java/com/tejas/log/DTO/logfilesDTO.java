package com.tejas.log.DTO;

public class logfilesDTO {
private int application_ID;
private String logname;
private int logretention;


public int getApplication_ID() {
	return application_ID;
}
public void setApplication_ID(int application_ID) {
	this.application_ID = application_ID;
}
public String getLogname() {
	return logname;
}
public void setLogname(String logname) {
	this.logname = logname;
}
public int getLogretention() {
	return logretention;
}
public void setLogretention(int logretention) {
	this.logretention = logretention;
}


	
}
