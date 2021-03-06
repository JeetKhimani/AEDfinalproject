/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.UserPatientEnterprise;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.PatientOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hetgerrard08
 */
public class UserPatientNewCase extends javax.swing.JPanel {
    
    
    JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    private ArrayList<Patient> pat = new ArrayList<>();
    private Patient patient;


    /**
     * Creates new form UserPatientNewCase
     */
    public UserPatientNewCase(JPanel userProcessContainer, UserAccount account, PatientOrganization patientOrganization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblSymptoms = new javax.swing.JLabel();
        txtSymptoms = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnPatientNewCaseBack = new javax.swing.JButton();

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Start New Case");

        lblSymptoms.setText("Symptoms:");

        lblDate.setText("Date:");

        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnPatientNewCaseBack.setText("<< Back");
        btnPatientNewCaseBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientNewCaseBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSymptoms)
                            .addComponent(lblDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSymptoms, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnPatientNewCaseBack)))
                .addContainerGap(305, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addGap(342, 342, 342))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSymptoms)
                    .addComponent(txtSymptoms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addGap(178, 178, 178)
                .addComponent(btnPatientNewCaseBack)
                .addGap(0, 360, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPatientNewCaseBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientNewCaseBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        UserPatientWorkArea sysAdminwjp = (UserPatientWorkArea) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnPatientNewCaseBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        Patient p = system.getPatientDirectory().getPatientByUserName(account.getUsername());
        p.setSymptoms(txtSymptoms.getText());
        p.setDate(txtDate.getText());
        JOptionPane.showMessageDialog(null, "Case Started");
        system.getPatientDirectory().getPatientByUserName(account.getUsername()).setSymptoms(txtSymptoms.getText());
        system.getPatientDirectory().getPatientByUserName(account.getUsername()).setDate(txtDate.getText());
        txtSymptoms.setText("");
        txtDate.setText("");
        
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPatientNewCaseBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblSymptoms;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtSymptoms;
    // End of variables declaration//GEN-END:variables
}
