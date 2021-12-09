/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

/**
 *
 * @author jeetkhimani
 */
public class Patient {
    
    String Name;
    int Age;
    String Address;
    double Contact;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getContact() {
        return Contact;
    }

    public void setContact(double Contact) {
        this.Contact = Contact;
    }
    
    
    
}
