/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

import Business.Doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author jeetkhimani
 */
public class InsuranceDirectory {
    private ArrayList<Insurance> InsuranceDirectory = new ArrayList<>();
    private Insurance Insurance;
    
    public InsuranceDirectory(){
        InsuranceDirectory = new ArrayList<>();
    }
    
    public Insurance setInsurance(Insurance Insurance) {
        this.Insurance = Insurance;
        InsuranceDirectory.add(Insurance);
        return Insurance;
    }
    
    public ArrayList<Insurance> getInsuranceDirectory() {
        return InsuranceDirectory;
    }
    
    public Insurance getInsuranceByUserName(String username){
        for(Insurance d: InsuranceDirectory){
            if(d.getUsername().equals(username)){
                return d;
            }
        }
        return null;
    }
    
    public String removeInsuranceByName(String name){
        for (Insurance d : InsuranceDirectory){
            if(d.getUsername().equals(name)){
                InsuranceDirectory.remove(d);
                return "Account deleted";
            }
        }
        return "Insurance Officer not found";
    }
}
