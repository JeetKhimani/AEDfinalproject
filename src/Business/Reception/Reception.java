/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Reception;

import Business.Doctor.Doctor;
import Business.LoginInfo.LoginInfo;
import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import java.util.ArrayList;



/**
 *
 * @author jeetkhimani
 */
public class Reception{
    private String name;
    private String username;
    private String password;
    private ArrayList<Patient> patientDir = new ArrayList<>();
    private Patient patient;
    private Doctor Assigndoc;

    public Reception(String username,String password, String name) {
        this.username = username;
        this.name = name;
        this.password = password;
    }

    public Doctor getAssigndoc() {
        return Assigndoc;
    }

    public void setAssigndoc(Doctor Assigndoc) {
        this.Assigndoc = Assigndoc;
    }
    
    

    
    public ArrayList<Patient> getPatientDir() {
        return patientDir;
    }

    public Patient getPatient() {
        return patient;
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
    
    public void setPatient(Patient patient) {
        this.patient = patient;
        patientDir.add(patient);
    }
}
