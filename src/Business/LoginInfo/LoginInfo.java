/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LoginInfo;

import java.util.ArrayList;

/**
 *
 * @author jeetkhimani
 */
public class LoginInfo {
    
    String Name;
    String UserName;
    String Password;

    public LoginInfo(String username,String password, String name) {
        this.UserName = username;
        this.Name = name;
        this.Password = password;
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
}
