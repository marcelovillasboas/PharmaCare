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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditPrescriptionGUI extends javax.swing.JFrame {
    
    // define table model
    DefaultTableModel dtm = new DefaultTableModel();
    
    // define date format
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();

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
        btnEditTable = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter the prescription ID:");

        btnValidate.setText("Validate");
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });

        lblPatientName.setText("Patient Name:");

        txtPatientName.setEditable(false);

        lblDoctor.setText("Responsible Doctor:");

        txtDoctor.setEditable(false);

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

        btnEditTable.setText("Edit field");
        btnEditTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTableActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(btnValidate))))
                .addContainerGap())
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
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctor)
                    .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnEditTable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnSubmit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed
        
        // clear fields
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
        
        // connect to the database for prescription data
        try {
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");
            PreparedStatement psPrinter = connection.prepareStatement(sqlPrinter);
            psPrinter.setInt(1, prescriptionNo);
            ResultSet rsPrinter = psPrinter.executeQuery();
            
            // print retrieved values in the correct fields
            while(rsPrinter.next()) {
                patientName = rsPrinter.getString(4);
                prescribedDoctor = rsPrinter.getString(2);
                prescribedPatientId = rsPrinter.getInt(3);
                txtPatientName.setText(patientName);
                txtDoctor.setText(prescribedDoctor);
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
            
            // connect to the database to get prescription details
            try {
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");
                PreparedStatement psPrinterDetails = connection.prepareStatement(sqlDetailsPrinter);
                psPrinterDetails.setInt(1, prescriptionNo);
                ResultSet rsDetails = psPrinterDetails.executeQuery();
                
                // assign values to variables
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

                    Date longStartDate = new Date(sDate);
                    Date longEndDate = new Date(eDate);
                    String startDate = formatter.format(longStartDate);
                    String endDate = formatter.format(longEndDate);
                    
                    // add a new row to the table
                    dtm.addRow(new Object[] {drugName, drugDose, frequency, startDate, endDate, status});
                }    
                
            } catch (SQLException e) {
                System.out.println(e);
            }

    }//GEN-LAST:event_btnValidateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        // class variables
        int row = tblDrugs.getModel().getRowCount();
        
        try {
            for (int r = 0; r < row; r++) {
                System.out.println(r);
                String drugName = tblDrugs.getValueAt(r, 0).toString();
                String drugDose = tblDrugs.getValueAt(r, 1).toString();
                String frequency = tblDrugs.getValueAt(r, 2).toString();
                String sStatus = tblDrugs.getValueAt(r, 5).toString();
                String sStartDate = tblDrugs.getValueAt(r, 3).toString();
                String sEndDate = tblDrugs.getValueAt(r, 4).toString();
                
                Date date1 = formatter.parse(sStartDate);
                Date date2 = formatter.parse(sEndDate);
                long startDate = date1.getTime();
                long endDate = date2.getTime();
                System.out.println("String start date: " + sStartDate + "     Date start date: " + date1 + "    long start date: " + startDate);
                
                int status;
                int prescriptionNo = Integer.parseInt(txtPrescriptionNo.getText());
                if (sStatus == "Active") {
                    status = 1;
                } else {
                    status = 0;
                }
                
                Drugs d = new Drugs(drugName, prescriptionNo, drugDose, frequency, startDate, endDate, status);
        
                PharmaDB.editDrugs(d);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

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
    private javax.swing.JButton btnEditTable;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSubmit;
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
