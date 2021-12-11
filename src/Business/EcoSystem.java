/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Doctor.DoctorDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Reception.ReceptionDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.User.PatientDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    
	private static EcoSystem business;
    private ArrayList<Network> networkList;
    private ReceptionDirectory ReceptionDirectory;
    private DoctorDirectory DoctorDirectory;
    private PatientDirectory PatientDirectory;
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public ReceptionDirectory getReceptionDirectory() {
        if(ReceptionDirectory == null){
            ReceptionDirectory = new ReceptionDirectory();
        }
        return ReceptionDirectory;
    }

    public void setReceptionDirectory(ReceptionDirectory ReceptionDirectory) {
        this.ReceptionDirectory = ReceptionDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        if(DoctorDirectory == null){
            DoctorDirectory = new DoctorDirectory();
        }
        return DoctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory DoctorDirectory) {
        this.DoctorDirectory = DoctorDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        if(PatientDirectory == null){
            PatientDirectory = new PatientDirectory();
        }
        return PatientDirectory;
    }

    public void setPatientDirectory(PatientDirectory PatientDirectory) {
        this.PatientDirectory = PatientDirectory;
    }

    
    
    
    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}
