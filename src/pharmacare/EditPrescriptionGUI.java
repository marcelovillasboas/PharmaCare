/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditPrescriptionGUI extends javax.swing.JFrame {
    
    // define table model
    DefaultTableModel dtm = new DefaultTableModel();

    public EditPrescriptionGUI() {
        initComponents();
        
        try {
            
            // set column identifiers for table
            dtm.setColumnIdentifiers(new Object[] {"Drug name", "Dose", "Frequency", "Start date", "End date", "Status"});
            tblDrugs.setModel(dtm);
            
        } catch (Exception e) {
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPrescriptionNo = new javax.swing.JTextField();
        btnValidate = new javax.swing.JButton();
        lblPatientName = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        lblDoctor = new javax.swing.JLabel();
        txtDoctor = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDrugs = new javax.swing.JTable();
        btnEditName = new javax.swing.JButton();
        btnEditDoctor = new javax.swing.JButton();
        btnEditTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter the prescription ID:");

        btnValidate.setText("Validate");
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });

        lblPatientName.setText("Patient Name:");

        lblDoctor.setText("Responsible Doctor:");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel2.setText("Administered drugs:");

        tblDrugs.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDrugs);

        btnEditName.setText("Change");
        btnEditName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditNameActionPerformed(evt);
            }
        });

        btnEditDoctor.setText("Change");
        btnEditDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDoctorActionPerformed(evt);
            }
        });

        btnEditTable.setText("Edit field");
        btnEditTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblPatientName)
                                    .addComponent(lblDoctor)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrescriptionNo)
                                    .addComponent(txtPatientName)
                                    .addComponent(txtDoctor))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnEditTable))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnEditDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnEditName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnValidate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPrescriptionNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValidate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientName)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctor)
                    .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditDoctor))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnEditTable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed
        
        
        txtPatientName.setText("");
        txtDoctor.setText("");
        dtm.setRowCount(0);
        
        // get assigned values for prescriptionPrinter info
        int prescriptionNo = Integer.parseInt(txtPrescriptionNo.getText());
        String prescribedDoctor;
        String patientName;
        int prescribedPatientId;
        String drugName;
        String drugDose;
        String frequency;
        int iStatus;
        String status;
        long sDate;
        long eDate;
        
        // assign query into sql variable
        String sqlPrinter = "SELECT * FROM prescription WHERE prescriptionNo = ?";
        String sqlDetailsPrinter = "SELECT * FROM prescriptionDetails WHERE prescriptionNo = ?";
        
        // connect to the database
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");
            PreparedStatement psPrinter = connection.prepareStatement(sqlPrinter);
            psPrinter.setInt(1, prescriptionNo);
            ResultSet rsPrinter = psPrinter.executeQuery();
            
            while(rsPrinter.next()) {
                patientName = rsPrinter.getString(5);
                prescribedDoctor = rsPrinter.getString(3);
                prescribedPatientId = rsPrinter.getInt(4);
                txtPatientName.setText(patientName);
                txtDoctor.setText(prescribedDoctor);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        for(int i = 0; i < 15; i++) {
            try {
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");
                PreparedStatement psPrinterDetails = connection.prepareStatement(sqlDetailsPrinter);
                psPrinterDetails.setInt(1, prescriptionNo + i);
                ResultSet rsDetails = psPrinterDetails.executeQuery();

                while(rsDetails.next()) {

                    drugName = rsDetails.getString(2);
                    drugDose = rsDetails.getString(4);
                    frequency = rsDetails.getString(5);
                    iStatus = rsDetails.getInt(6);
                    sDate = rsDetails.getLong(8);
                    eDate = rsDetails.getLong(9);
                    if(iStatus == 0) {
                        status = "Active";
                    } else {
                        status = "Not active";
                    }

                    Date startDate = new Date(sDate * 1000);
                    Date endDate = new Date(eDate * 1000);

                    dtm.addRow(new Object[] {drugName, drugDose, frequency, startDate, endDate, status});

                }    
                
            } catch (SQLException e) {
                System.out.println(e);
            }

        }
        
        
    }//GEN-LAST:event_btnValidateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnEditNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditNameActionPerformed
        String patientName = JOptionPane.showInputDialog("Enter a new patient name");
        txtPatientName.setText(patientName);
    }//GEN-LAST:event_btnEditNameActionPerformed

    private void btnEditDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDoctorActionPerformed
        String doctorName = JOptionPane.showInputDialog("Enter a new doctor name");
        txtDoctor.setText(doctorName);
    }//GEN-LAST:event_btnEditDoctorActionPerformed

    private void btnEditTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTableActionPerformed
        
        boolean isSelected = tblDrugs.getSelectionModel().isSelectionEmpty();
        
        int row = tblDrugs.getSelectedRow();
        int column = tblDrugs.getSelectedColumn();
        
        if(isSelected == true) {
            row = Integer.parseInt(JOptionPane.showInputDialog("Choose row to edit"));
            column = Integer.parseInt(JOptionPane.showInputDialog("Choose column to edit"));
        }
        
        if(column == 0) {
            String drugName = JOptionPane.showInputDialog("Enter new drug name");
            tblDrugs.setValueAt(drugName, row, column);
        } else if(column == 1) {
            String dose = JOptionPane.showInputDialog("Enter new dose");
            tblDrugs.setValueAt(dose, row, column);
        } else if(column == 2) {
            String[] options = {"Once a day", "Twice a day", "Three times a day", "Once a week", "Twice a week", "Three times a week", "Other"}; 
                String frequency = (String)JOptionPane.showInputDialog(null, "Enter the correct frequency", null, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                tblDrugs.getModel().setValueAt(frequency, row, column);
        } else if(column == 3) {
            String startDate = JOptionPane.showInputDialog("Enter the correct start date");
            tblDrugs.getModel().setValueAt(startDate, row, column);
        } else if(column == 4) {
            String endDate = JOptionPane.showInputDialog("Enter the correct end date");
            tblDrugs.getModel().setValueAt(endDate, row, column);
        } else if(column == 5) {
            String status = (String) tblDrugs.getValueAt(row, column);

                if (status == "Active") {
                    tblDrugs.setValueAt("Not active", row, column);
                } else {
                    tblDrugs.setValueAt("Active", row, column);
                }
        }
                
        
    }//GEN-LAST:event_btnEditTableActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EditPrescriptionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPrescriptionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPrescriptionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPrescriptionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPrescriptionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditDoctor;
    private javax.swing.JButton btnEditName;
    private javax.swing.JButton btnEditTable;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnValidate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JTable tblDrugs;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPrescriptionNo;
    // End of variables declaration//GEN-END:variables
}
