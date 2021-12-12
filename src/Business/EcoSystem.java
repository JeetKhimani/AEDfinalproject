/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Billing.BillingDirectory;
import Business.Doctor.DoctorDirectory;
import Business.Insurance.InsuranceDirectory;
import Business.LabReport.LabReportDirectory;
import Business.LabTest.LabTestDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Reception.ReceptionDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Patient.PatientDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.Pharmacyinventory.PharmacyinventoryDirectory;
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
    private PharmacyDirectory PharmacyDirectory;
    private PharmacyinventoryDirectory PharmacyinventoryDirectory;
    private InsuranceDirectory InsuranceDirectory;
    private BillingDirectory BillingDirectory;
    private LabTestDirectory LabTestDirectory;
    private LabReportDirectory LabReportDirectory;
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
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

    public PharmacyDirectory getPharmacyDirectory() {
        if(PharmacyDirectory == null){
            PharmacyDirectory = new PharmacyDirectory();
        }
        return PharmacyDirectory;
    }

    public void setPharmacyDirectory(PharmacyDirectory PharmacyDirectory) {
        this.PharmacyDirectory = PharmacyDirectory;
    }

    public PharmacyinventoryDirectory getPharmacyinventoryDirectory() {
        if(PharmacyinventoryDirectory == null){
            PharmacyinventoryDirectory = new PharmacyinventoryDirectory();
        }
        return PharmacyinventoryDirectory;
    }

    public void setPharmacyinventoryDirectory(PharmacyinventoryDirectory PharmacyinventoryDirectory) {
        this.PharmacyinventoryDirectory = PharmacyinventoryDirectory;
    }

    public InsuranceDirectory getInsuranceDirectory() {
        if(InsuranceDirectory == null){
            InsuranceDirectory = new InsuranceDirectory();
        }
        return InsuranceDirectory;
    }

    public void setInsuranceDirectory(InsuranceDirectory InsuranceDirectory) {
        this.InsuranceDirectory = InsuranceDirectory;
    }

    public BillingDirectory getBillingDirectory() {
        if(BillingDirectory == null){
            BillingDirectory = new BillingDirectory();
        }
        return BillingDirectory;
    }

    public void setBillingDirectory(BillingDirectory BillingDirectory) {
        this.BillingDirectory = BillingDirectory;
    }

    public LabTestDirectory getLabTestDirectory() {
        if(LabTestDirectory == null){
            LabTestDirectory = new LabTestDirectory();
        }
        return LabTestDirectory;
    }

    public void setLabTestDirectory(LabTestDirectory LabTestDirectory) {
        this.LabTestDirectory = LabTestDirectory;
    }

    public LabReportDirectory getLabReportDirectory() {
        if(LabReportDirectory == null){
            LabReportDirectory = new LabReportDirectory();
        }
        return LabReportDirectory;
    }

    public void setLabReportDirectory(LabReportDirectory LabReportDirectory) {
        this.LabReportDirectory = LabReportDirectory;
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
