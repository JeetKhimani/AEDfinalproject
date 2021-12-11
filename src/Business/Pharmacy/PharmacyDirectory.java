/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import Business.Doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author jeetkhimani
 */
public class PharmacyDirectory {
    private ArrayList<Pharmacy> PharmacyDirectory = new ArrayList<>();
    private Pharmacy Pharmacy;
    
    public PharmacyDirectory(){
        PharmacyDirectory = new ArrayList<>();
    }
    
    public Pharmacy setPharmacy(Pharmacy Pharmacy) {
        this.Pharmacy = Pharmacy;
        PharmacyDirectory.add(Pharmacy);
        return Pharmacy;
    }
    
    public ArrayList<Pharmacy> getPharmacyDirectory() {
        return PharmacyDirectory;
    }
    
    public Pharmacy getPharmacyByUserName(String username){
        for(Pharmacy d: PharmacyDirectory){
            if(d.getUsername().equals(username)){
                return d;
            }
        }
        return null;
    }
    
    public String removePharmacyByName(String name){
        for (Pharmacy d : PharmacyDirectory){
            if(d.getUsername().equals(name)){
                PharmacyDirectory.remove(d);
                return "Account deleted";
            }
        }
        return "Doctor not found";
    }
}
