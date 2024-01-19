package com.example.scan;


//ScanResponse.java
public class ScanResponse {
private String scanId;
private int statusCode;

public ScanResponse(String scanId, int statusCode) {
   this.setScanId(scanId);
   this.setStatusCode(statusCode);
}

public String getScanId() {
	return scanId;
}

public void setScanId(String scanId) {
	this.scanId = scanId;
}

public int getStatusCode() {
	return statusCode;
}

public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}

// getters and setters
}
