/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Doctor.DoctorDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Insurance.InsuranceDirectory;
import Business.Reception.ReceptionDirectory;
import Business.Role.Role;
import Business.Patient.PatientDirectory;
import Business.Pharmacy.PharmacyDirectory;
import Business.Pharmacyinventory.PharmacyinventoryDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ReceptionDirectory receptionDirectory;
    private DoctorDirectory doctorDirectory;
    private PatientDirectory patientDirectory;
    private PharmacyDirectory pharmacyDirectory;
    private PharmacyinventoryDirectory pharmacyinventoryDirectory;
    private InsuranceDirectory InventoryDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"),
        Lab("Lab Organization"), Reception("Reception Organization"),
        Patient("Patient Organization"), Pharmacy("Pharmacy Organization"),
        Pharmacyinventory("Pharmacyinventory Organization"),
        Insurance("Insurance Organization"),
        Billing("Billing Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public ReceptionDirectory getReceptionDirectory() {
        return receptionDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public PharmacyinventoryDirectory getPharmacyinventoryDirectory() {
        return pharmacyinventoryDirectory;
    }

    public InsuranceDirectory getInventoryDirectory() {
        return InventoryDirectory;
    }

    public void setInventoryDirectory(InsuranceDirectory InventoryDirectory) {
        this.InventoryDirectory = InventoryDirectory;
    }

    

    

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
