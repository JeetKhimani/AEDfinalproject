/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;


import java.util.ArrayList;

/**
 *
 * @author jeetkhimani
 */
public class PatientDirectory {
    private ArrayList<Patient> PatientDirectory = new ArrayList<>();
    private Patient patient;
    
    public PatientDirectory(){
        PatientDirectory = new ArrayList<>();
    }
    public Patient getPatient(){
        return patient;
    }
    public Patient setPatient(Patient patient) {
        this.patient = patient;
        PatientDirectory.add(patient);
        return patient;
    }
    
    public ArrayList<Patient> getPatientDirectory() {
        return PatientDirectory;
    }
    
    public Patient getPatientByUserName(String username){
        for(Patient p: PatientDirectory){
            if(p.getUsername().equals(username)){
                return p;
            }
        }
        return null;
    }
    
    public String removePatientByName(String name){
        for (Patient p : PatientDirectory){
            if(p.getUsername().equals(name)){
                PatientDirectory.remove(p);
                return "Account deleted";
            }
        }
        return "Patient not found";
    }
}
