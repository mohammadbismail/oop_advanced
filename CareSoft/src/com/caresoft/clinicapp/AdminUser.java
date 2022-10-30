package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;
public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    public AdminUser(Integer myId, Integer employeeID, String role, ArrayList<String> securityIncidents) {
    	super(myId);
    	this.employeeID = employeeID;
    	this.role = role;
    	this.securityIncidents = securityIncidents;
    }
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
	public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
	public AdminUser(Integer myId) {
		super(myId);
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return 
	
	}

	@Override
	public boolean assignPin(int pin) {
		String strPin = Integer.toString(pin);
		int pinLen = strPin.length();
		if (pinLen == 6) {
			this.setPin(pin);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (this.getId() == confirmedAuthID) {
			return true;
		} else {
			return false;
		}
	}
	//Getters & Setters 
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
}
