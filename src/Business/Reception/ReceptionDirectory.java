/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Reception;

import java.util.ArrayList;

/**
 *
 * @author jeetkhimani
 */
public class ReceptionDirectory {
    
    private ArrayList<Reception> ReceptionDirectory;
    private Reception reception;
    
    public ReceptionDirectory(){
        ReceptionDirectory = new ArrayList<>();
    }

    public Reception setReception(Reception reception) {
        this.reception = reception;
        ReceptionDirectory.add(reception);
        return reception;
    }

    public ArrayList<Reception> getReceptionDirectory() {
        return ReceptionDirectory;
    }
    
    public Reception getReceptionByUserName(String username){
        for(Reception r: ReceptionDirectory){
            if(r.getReceptionLoginInfo().getUserName().equals(username)){
                return r;
            }
        }
        return null;
    }
    
    public String removeReceptionByName(String name){
        for (Reception r : ReceptionDirectory){
            if(r.getReceptionLoginInfo().getUserName().equals(name)){
                ReceptionDirectory.remove(r);
                return "Account deleted";
            }
        }
        return "Customer not found";
    }
    
    //the below code is written by me not in the assignment 5

    public void setReceptionDirectory(ArrayList<Reception> ReceptionDirectory) {
        this.ReceptionDirectory = ReceptionDirectory;
    }
    
}
