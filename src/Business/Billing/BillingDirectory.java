/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Billing;


import java.util.ArrayList;

/**
 *
 * @author hetgerrard08
 */
public class BillingDirectory {
    private ArrayList<Billing> BillingDirectory = new ArrayList<>();
    private Billing billing;
    
    public BillingDirectory(){
        BillingDirectory = new ArrayList<>();
    }
    
    public Billing setBilling(Billing billing) {
        this.billing = billing;
        BillingDirectory.add(billing);
        return billing;
    }
    
    public ArrayList<Billing> getBillingDirectory() {
        return BillingDirectory;
    }
    
    public Billing getBillingByUserName(String username){
        for(Billing d: BillingDirectory){
            if(d.getUsername().equals(username)){
                return d;
            }
        }
        return null;
    }
    
    public String removeBillingByName(String name){
        for (Billing d : BillingDirectory){
            if(d.getUsername().equals(name)){
                BillingDirectory.remove(d);
                return "Account deleted";
            }
        }
        return "Billing not found";
    }
}
