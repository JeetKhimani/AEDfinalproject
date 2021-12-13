/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Patient.Patient;

/**
 *
 * @author jeetkhimani
 */
public class Doctor {
    private String name;
    private String username;
    private String password;
    private String LabResults;
    private Patient PatientCheck;
    private String LabReportName;
    private String index;

    public Doctor(String username,String password, String name) {
        this.username = username;
        this.name = name;
        this.password = password;
    }

    public Patient getPatientCheck() {
        return PatientCheck;
    }

    public void setPatientCheck(Patient PatientCheck) {   
    this.PatientCheck = PatientCheck;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getLabResults() {
        return LabResults;
    }

    public void setLabResults(String LabResults) {
        this.LabResults = LabResults;
    }

    public String getLabReportName() {
        return LabReportName;
    }

    public void setLabReportName(String LabReportName) {
        this.LabReportName = LabReportName;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }  
}
