/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabTest;

import Business.Doctor.Doctor;
import Business.Patient.Patient;

/**
 *
 * @author jeetkhimani
 */
public class LabTest {
    private String name;
    private String username;
    private String password;
    private String index;
    private Patient LabReportResults;

    public LabTest(String username,String password, String name) {
        this.username = username;
        this.name = name;
        this.password = password;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Patient getLabReportResults() {
        return LabReportResults;
    }

    public void setLabResults(Patient LabResults) {
        this.LabReportResults = LabResults;
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
}
