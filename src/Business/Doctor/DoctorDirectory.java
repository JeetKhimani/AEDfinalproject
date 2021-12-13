/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;


import java.util.ArrayList;

/**
 *
 * @author jeetkhimani
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> DoctorDirectory = new ArrayList<>();
    private Doctor doctor;
    private String[] DoctorList;
    
    public DoctorDirectory(){
        DoctorDirectory = new ArrayList<>();
    }
    
    public Doctor setDoctor(Doctor doctor) {
        this.doctor = doctor;
        DoctorDirectory.add(doctor);
        return doctor;
    }
    
    public ArrayList<Doctor> getDoctorDirectory() {
        return DoctorDirectory;
    }

    public String[] getDoctorList() {
        return DoctorList;
    }

    public void setDoctorList(String[] DoctorList) {
        this.DoctorList = DoctorList;
    }
    
    
    
    public Doctor getDoctorByUserName(String username){
        for(Doctor d: DoctorDirectory){
            if(d.getUsername().equals(username)){
                return d;
            }
        }
        return null;
    }
    
    public String removeDoctorByName(String name){
        for (Doctor d : DoctorDirectory){
            if(d.getUsername().equals(name)){
                DoctorDirectory.remove(d);
                return "Account deleted";
            }
        }
        return "Doctor not found";
    }
}
