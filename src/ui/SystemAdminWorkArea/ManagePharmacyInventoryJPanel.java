/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Pharmacy.Pharmacy;
import Business.Pharmacyinventory.Pharmacyinventory;
import Business.Role.PharmacyRole;
import Business.Role.PharmacyinventoryRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeetkhimani
 */
public class ManagePharmacyInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePharmacyInventoryJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;

    public ManagePharmacyInventoryJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populatepharmacyinventorytable();
        dispimg();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(1137, 713, 75, 29);

        jLabel1.setText("Name:");
        add(jLabel1);
        jLabel1.setBounds(860, 470, 40, 16);

        jLabel2.setText("UserName:");
        add(jLabel2);
        jLabel2.setBounds(830, 510, 68, 16);

        jLabel3.setText("Password:");
        add(jLabel3);
        jLabel3.setBounds(830, 550, 63, 16);
        add(txtName);
        txtName.setBounds(920, 470, 104, 26);
        add(txtUsername);
        txtUsername.setBounds(920, 500, 104, 26);
        add(txtPassword);
        txtPassword.setBounds(920, 540, 104, 26);

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(900, 590, 88, 29);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(table1);

        add(jScrollPane1);
        jScrollPane1.setBounds(610, 290, 649, 119);
        add(jLabel4);
        jLabel4.setBounds(0, 0, 610, 800);
    }// </editor-fold>//GEN-END:initComponents
    
    private void dispimg(){
        scaleIcon(610,800,"src/images/phinv.png", jLabel4);
    }
    
    public void scaleIcon(int Width, int Height, String imgPath, javax.swing.JLabel jLabel){
        File file = new File(imgPath);
        String absolutePath = file.getAbsolutePath();
        ImageIcon img = new ImageIcon(absolutePath);
        System.out.println(absolutePath);
        Image icon = img.getImage();
        icon = icon.getScaledInstance(Width, Height, Image.SCALE_SMOOTH);
        img = new ImageIcon(icon);
        jLabel.setIcon(img);
        jLabel.setText("");
       
    }
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if (txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Name Missing");
            return;
        }
        if (txtUsername.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Username Missing");
            return;
        }
        if (txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Password Missing");
            return;
        }
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(txtUsername.getText()) == true){
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getText());
        String name = txtName.getText();
        UserAccount account = system.getUserAccountDirectory().createUserAccount(username, password, name, new PharmacyinventoryRole());
        Pharmacyinventory pharmacyinventory = system.getPharmacyinventoryDirectory().setPharmacyinventory(new Pharmacyinventory(username, password, name));
        txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        populatepharmacyinventorytable();
        JOptionPane.showMessageDialog(null, "Added new user");
        }
        else {
            JOptionPane.showMessageDialog(null, txtUsername.getText() + "exists. Enter a new user name");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populatepharmacyinventorytable() {
        DefaultTableModel table = (DefaultTableModel) table1.getModel();
        table.setRowCount(0);
        for (Pharmacyinventory phin : system.getPharmacyinventoryDirectory().getPharmacyinventoryDirectory()) {
            Object[] row = new Object[3];
            row[0] = phin.getName();
            row[1] = phin.getUsername();
            row[2] = phin.getPassword();

            table.addRow(row); 
        }
    }
}
