/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabReport;

import java.util.ArrayList;

/**
 *
 * @author jeetkhimani
 */
public class LabReportDirectory {
    private ArrayList<LabReport> LabReportDirectory = new ArrayList<>();
    private LabReport LabReport;
    
    public LabReportDirectory(){
        LabReportDirectory = new ArrayList<>();
    }
    
    public LabReport setLabReport(LabReport LabReport) {
        this.LabReport = LabReport;
        LabReportDirectory.add(LabReport);
        return LabReport;
    }
    
    public ArrayList<LabReport> getLabReportDirectory() {
        return LabReportDirectory;
    }
    
    public LabReport getLabReportByUserName(String username){
        for(LabReport d: LabReportDirectory){
            if(d.getUsername().equals(username)){
                return d;
            }
        }
        return null;
    }
    
    public String removeLabReportByName(String name){
        for (LabReport d : LabReportDirectory){
            if(d.getUsername().equals(name)){
                LabReportDirectory.remove(d);
                return "Account deleted";
            }
        }
        return "LabReport not found";
    }
}
