/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacyinventory;

import Business.Pharmacy.Pharmacy;
import java.util.ArrayList;

/**
 *
 * @author jeetkhimani
 */
public class PharmacyinventoryDirectory {
    private ArrayList<Pharmacyinventory> PharmacyinventoryDirectory = new ArrayList<>();
    private Pharmacyinventory Pharmacyinventory;
    
    public PharmacyinventoryDirectory(){
        PharmacyinventoryDirectory = new ArrayList<>();
    }
    
    public Pharmacyinventory setPharmacyinventory(Pharmacyinventory Pharmacyinventory) {
        this.Pharmacyinventory = Pharmacyinventory;
        PharmacyinventoryDirectory.add(Pharmacyinventory);
        return Pharmacyinventory;
    }
    
    public ArrayList<Pharmacyinventory> getPharmacyinventoryDirectory() {
        return PharmacyinventoryDirectory;
    }
    
    public Pharmacyinventory getPharmacyinventoryByUserName(String username){
        for(Pharmacyinventory d: PharmacyinventoryDirectory){
            if(d.getUsername().equals(username)){
                return d;
            }
        }
        return null;
    }
    
    public String removePharmacyinventoryByName(String name){
        for (Pharmacyinventory d : PharmacyinventoryDirectory){
            if(d.getUsername().equals(name)){
                PharmacyinventoryDirectory.remove(d);
                return "Account deleted";
            }
        }
        return "Pharmacyinventory not found";
    }
}
