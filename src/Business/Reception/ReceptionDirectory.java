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
    
    
    public ReceptionDirectory(){
        ReceptionDirectory = new ArrayList<>();
    }

    public ArrayList<Reception> getReceptionDirectory() {
        return ReceptionDirectory;
    }

    public void setReceptionDirectory(ArrayList<Reception> ReceptionDirectory) {
        this.ReceptionDirectory = ReceptionDirectory;
    }
    
    
    
}
