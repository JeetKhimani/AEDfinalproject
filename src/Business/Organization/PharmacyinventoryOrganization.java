/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PharmacyinventoryRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jeetkhimani
 */
public class PharmacyinventoryOrganization extends Organization{
    public PharmacyinventoryOrganization() {
        super(Organization.Type.Pharmacyinventory.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyinventoryRole());
        return roles;
    }
}
