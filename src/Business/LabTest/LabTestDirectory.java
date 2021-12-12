/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabTest;

import java.util.ArrayList;

/**
 *
 * @author jeetkhimani
 */
public class LabTestDirectory {
    private ArrayList<LabTest> LabTestDirectory = new ArrayList<>();
    private LabTest LabTest;
    
    public LabTestDirectory(){
        LabTestDirectory = new ArrayList<>();
    }
    
    public LabTest setLabTest(LabTest LabTest) {
        this.LabTest = LabTest;
        LabTestDirectory.add(LabTest);
        return LabTest;
    }
    
    public ArrayList<LabTest> getLabTestDirectory() {
        return LabTestDirectory;
    }
    
    public LabTest getLabTestByUserName(String username){
        for(LabTest d: LabTestDirectory){
            if(d.getUsername().equals(username)){
                return d;
            }
        }
        return null;
    }
    
    public String removeLabTestByName(String name){
        for (LabTest d : LabTestDirectory){
            if(d.getUsername().equals(name)){
                LabTestDirectory.remove(d);
                return "Account deleted";
            }
        }
        return "LabTest not found";
    }
}
