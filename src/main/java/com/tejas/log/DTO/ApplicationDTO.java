package com.tejas.log.DTO;

import java.util.Date;

public class ApplicationDTO {
 private int application_ID;
 private String appicationName;
 private String logfilePATH;
 private Date aplicationcreationDate;
 
 
public int getApplication_ID() {
	return application_ID;
}
public void setApplication_ID(int application_ID) {
	this.application_ID = application_ID;
}
public String getAppicationName() {
	return appicationName;
}
public void setAppicationName(String appicationName) {
	this.appicationName = appicationName;
}
public String getLogfilePATH() {
	return logfilePATH;
}
public void setLogfilePATH(String logfilePATH) {
	this.logfilePATH = logfilePATH;
}
public Date getAplicationcreationDate() {
	return aplicationcreationDate;
}
public void setAplicationcreationDate(Date aplicationcreationDate) {
	this.aplicationcreationDate = aplicationcreationDate;
}
 
 
 
	
}
