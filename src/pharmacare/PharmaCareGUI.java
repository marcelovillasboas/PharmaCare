/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacare;

import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PharmaCareGUI extends javax.swing.JFrame {

    // define table model
    DefaultTableModel dtm = new DefaultTableModel();
    
    // Creates new form PharmaCareGUI
    public PharmaCareGUI() {
       
        // initialize components
        initComponents();

            try {
            // set system date
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            txtDate.setText(formatter.format(date));
        
            // set column identifiers for table
            dtm.setColumnIdentifiers(new Object[] {"Drug name", "Dose", "Frequency", "Start date", "End date", "Status"});
            tblPrescriptionDetails.setModel(dtm);
            } catch(Exception e) {
            System.out.println(e);
        }

    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblPrescriptionNo = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        txtPrescriptionId = new javax.swing.JTextField();
        txtPatientId = new javax.swing.JTextField();
        btnValidate = new javax.swing.JButton();
        lblDoctorID = new javax.swing.JLabel();
        txtDoctorId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        lblPatientType = new javax.swing.JLabel();
        lblDoctorName = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        lblDrugName = new javax.swing.JLabel();
        lblDose = new javax.swing.JLabel();
        txtDose = new javax.swing.JTextField();
        lblFrequency = new javax.swing.JLabel();
        cmbFrequency = new javax.swing.JComboBox<>();
        lblStartDate = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        lblEndDate = new javax.swing.JLabel();
        txtEndDate = new javax.swing.JTextField();
        chkActive = new javax.swing.JCheckBox();
        lblStatus = new javax.swing.JLabel();
        lblPrescriptionDetails = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtDrugName = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblPrescriptionDetails = new javax.swing.JTable();
        cmbPatientType = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPrescriptionNo.setText("Prescription Number");

        lblPatientID.setText("Patient ID");

        txtPrescriptionId.setEditable(false);

        btnValidate.setText("Validate");
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });

        lblDoctorID.setText("Doctor ID");

        jLabel1.setText("Patient's Name");

        txtPatientName.setEditable(false);

        lblPatientType.setText("Patient's Type");

        lblDoctorName.setText("Doctor's Name");

        txtDoctorName.setEditable(false);

        lblDrugName.setText("Drug Name");

        lblDose.setText("Dose");

        lblFrequency.setText("Frequency");

        cmbFrequency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Once a day", "Twice a day", "Three times a day", "Once a week", "Twice a week", "Three times a week", "Other" }));

        lblStartDate.setText("Start Date");

        lblEndDate.setText("End Date");

        chkActive.setText(" Active");

        lblStatus.setText("Status");

        lblPrescriptionDetails.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPrescriptionDetails.setText("Prescription Details");

        btnAdd.setText("Add Line");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit Line");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Line");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jButton1.setText("Check Cocktail");

        btnSubmit.setText("Submit");

        jLabel2.setText("Date");

        tblPrescriptionDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tblPrescriptionDetails);

        cmbPatientType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indoor", "Outdoor" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnValidate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDoctorID)
                                    .addGap(440, 440, 440))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPrescriptionNo)
                                        .addComponent(lblPatientID)
                                        .addComponent(lblDrugName)
                                        .addComponent(lblFrequency))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtPatientId, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtDoctorId, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtPrescriptionId, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(0, 0, Short.MAX_VALUE)))
                                                    .addGap(59, 59, 59))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtDrugName)
                                                    .addGap(232, 232, 232)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1)
                                                .addComponent(lblPatientType)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblEndDate)
                                                    .addComponent(lblDoctorName)
                                                    .addComponent(lblStartDate)
                                                    .addComponent(lblDose)))
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(chkActive)
                                                .addComponent(cmbFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStatus)
                                .addGap(587, 587, 587)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(txtDoctorName)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDose)
                            .addComponent(txtEndDate)
                            .addComponent(cmbPatientType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrescriptionDetails)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnExit)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete)
                                .addGap(5, 5, 5)
                                .addComponent(btnAdd))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(btnSubmit))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrescriptionNo)
                    .addComponent(txtPrescriptionId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientID)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientType)
                    .addComponent(cmbPatientType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDoctorName)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDoctorID)
                        .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnValidate)
                        .addComponent(jLabel2))
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDose))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStartDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDrugName)
                            .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbFrequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFrequency))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkActive))
                    .addComponent(lblEndDate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnEdit)
                            .addComponent(btnDelete)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrescriptionDetails)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(jButton1)
                    .addComponent(btnSubmit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
        // get assigned values for prescription details
        String drugName = txtDrugName.getText();
        String dose = txtDose.getText();
        String frequency = cmbFrequency.getSelectedItem().toString();
        String startDate = txtStartDate.getText();
        String endDate = txtEndDate.getText();
        boolean status = chkActive.isSelected();
        String isActive;
        
        if (status == true) {
            isActive = "Active";
        } else {
            isActive = "Not active";
        }
        // assign the query into sql variable
        String sqlPrescription = "INSERT INTO PrescriptionDetails (prescriptionno, drugName, drugDose, frequency, startDate, endDate, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        // connect the database 
        try {
            
            // Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");
            int presno = 2;
            PreparedStatement ps = connection.prepareStatement(sqlPrescription);
            ps.setInt(1, presno);
            ps.setString(2, drugName);
            ps.setString(3, dose);
            ps.setString(4, frequency);
            
            Date sd = new SimpleDateFormat("dd/MM/yyyy").parse(startDate);
            java.sql.Date sqlStartDate = new java.sql.Date(sd.getTime());
            
            Date ed = new SimpleDateFormat("dd/MM/yyyy").parse(endDate);
            java.sql.Date sqlEndDate = new java.sql.Date(ed.getTime());
            
            ps.setDate(5, sqlStartDate);
            ps.setDate(6, sqlEndDate);
            ps.setBoolean(7, true);
            
            int up = ps.executeUpdate();
            System.out.println("Updated"); 
            
            connection.close();
            
        } catch (Exception e) {
            System.out.println(e); 
        }
        
        dtm.addRow(new Object[] {
                    drugName, dose, frequency, startDate, endDate, isActive});
       
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed
        
        // get assigned values for patient info
        int patientId = Integer.parseInt(txtPatientId.getText());
        String patientName;
        String prescriptionNo;
        int patientType;
        int doctorId = Integer.parseInt(txtDoctorId.getText());
        String doctorName;
        
        // assign query into sql variable
        String sqlPatient = "SELECT * FROM patient WHERE patientID = ?";
        String sqlDoctor = "SELECT doctorName FROM doctor WHERE doctorId = ?";
        
        // connect to the database
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");
            PreparedStatement psPatient = connection.prepareStatement(sqlPatient);
            psPatient.setInt(1, patientId);
            ResultSet rsPatient = psPatient.executeQuery();
            
            while(rsPatient.next()) {
                patientName = rsPatient.getString(2);
                prescriptionNo = rsPatient.getString(3);
                patientType = rsPatient.getInt(4);
                txtPatientName.setText(patientName);
                txtPrescriptionId.setText(prescriptionNo);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        try {
            
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");
            PreparedStatement psDoctor = connection.prepareStatement(sqlDoctor);
            psDoctor.setInt(2, doctorId);
            ResultSet rsDoctor = psDoctor.executeQuery();
            
            while(rsDoctor.next()) {
                doctorName = rsDoctor.getString(2);
                txtDoctorName.setText(doctorName);
            }
        } catch (Exception f) {
            System.out.println(f);
        }
        
        System.out.println("Updated");
        
        
    }//GEN-LAST:event_btnValidateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblPrescriptionDetails.getSelectedRow();
        
        dtm.removeRow(selectedRow);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        boolean isSelected = tblPrescriptionDetails.getSelectionModel().isSelectionEmpty();
        System.out.println(isSelected);
        
        int row = tblPrescriptionDetails.getSelectedRow();
        int column = tblPrescriptionDetails.getSelectedColumn();
        // System.out.println(column + "  " + row);
        
        if (isSelected = true) {
            
            JOptionPane.showMessageDialog(null, "You have to select a cell to edit first.");
            
        } else {
        
            if (column == 0) {

                 String drugName = JOptionPane.showInputDialog("Enter the drug name");
                 tblPrescriptionDetails.getModel().setValueAt(drugName, row, column);

            } else if (column == 1) {

                String dose = JOptionPane.showInputDialog("Enter the correct dose");
                tblPrescriptionDetails.getModel().setValueAt(dose, row, column);

            } else if (column == 2) {

                String[] options = {"Once a day", "Twice a day", "Three times a day", "Once a week", "Twice a week", "Three times a week", "Other"}; 
                String frequency = (String)JOptionPane.showInputDialog(null, "Enter the correct date", null, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                tblPrescriptionDetails.getModel().setValueAt(frequency, row, column);

            } else if (column == 3) {

                String startDate = JOptionPane.showInputDialog("Enter the correct start date");
                tblPrescriptionDetails.getModel().setValueAt(startDate, row, column);

            } else if (column == 4) {

                String endDate = JOptionPane.showInputDialog("Enter the correct end date");
                tblPrescriptionDetails.getModel().setValueAt(endDate, row, column);

            } else if (column == 5) {

                String status = (String) tblPrescriptionDetails.getValueAt(row, column);

                if (status == "Active") {
                    tblPrescriptionDetails.setValueAt("Not active", row, column);
                } else {
                    tblPrescriptionDetails.setValueAt("Active", row, column);
                }
            }
        
        }
        
        
    }//GEN-LAST:event_btnEditActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PharmaCareGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PharmaCareGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PharmaCareGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PharmaCareGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PharmaCareGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnValidate;
    private javax.swing.JCheckBox chkActive;
    private javax.swing.JComboBox<String> cmbFrequency;
    private javax.swing.JComboBox<String> cmbPatientType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblDoctorID;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblDose;
    private javax.swing.JLabel lblDrugName;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblFrequency;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPatientType;
    private javax.swing.JLabel lblPrescriptionDetails;
    private javax.swing.JLabel lblPrescriptionNo;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblPrescriptionDetails;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtDose;
    private javax.swing.JTextField txtDrugName;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPrescriptionId;
    private javax.swing.JTextField txtStartDate;
    // End of variables declaration//GEN-END:variables
}
