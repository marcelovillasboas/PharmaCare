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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
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
                                .addComponent(btnValidate)))
                        .addGap(39, 39, 39))))
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
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed
        
        // get assigned values for prescriptionPrinter info
        int prescriptionNo = Integer.parseInt(txtPrescriptionNo.getText());
        String prescribedDoctor;
        String patientName;
        int prescribedPatientId;
        String drugName;
        String drugDose;
        String frequency;
        int status;
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
                    status = rsDetails.getInt(6);
                    sDate = rsDetails.getLong(8);
                    eDate = rsDetails.getLong(9);

                    Date startDate = new Date(sDate * 1000);
                    Date endDate = new Date(eDate * 1000);

                    dtm.addRow(new Object[] {drugName, drugDose, frequency, startDate, endDate, status});

                }    
                
            } catch (SQLException e) {
                System.out.println(e);
            }
            
            /*drugName = tblDrugs.getValueAt(tblDrugs.getRowCount(), 1).toString();
            System.out.println(drugName);*/
            /*if (drugName == "") {
                break;
            };*/
        }
        
        
    }//GEN-LAST:event_btnValidateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
