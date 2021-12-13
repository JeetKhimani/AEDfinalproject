/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Doctor.Doctor;

/**
 *
 * @author jeetkhimani
 */
public class Patient {
    private String name;
    private String username;
    private String password;
    private String Age;
    private String Contact;
    private String Address;
    private String Symptoms;
    private String Date;
    private String[] patientlist;
    private String LabResults;
    private String Report;
    private Doctor AssignedDoctor;

    public Patient(String username,String password, String name) {
        this.username = username;
        this.name = name;
        this.password = password;
    }

    public String[] getPatientlist() {
        return patientlist;
    }

    public void setPatientlist(String[] patientlist) {
        this.patientlist = patientlist;
    }

    public Doctor getAssignedDoctor() {
        return AssignedDoctor;
    }

    public String getLabResults() {
        return LabResults;
    }

    public void setLabResults(String LabResults) {
        this.LabResults = LabResults;
    }

    public String getReport() {
        return Report;
    }

    public void setReport(String Report) {
        this.Report = Report;
    }

    public void setAssignedDoctor(Doctor AssignedDoctor) {
        this.AssignedDoctor = AssignedDoctor;
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

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getSymptoms() {
        return Symptoms;
    }

    public void setSymptoms(String Symptoms) {
        this.Symptoms = Symptoms;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
    
}
