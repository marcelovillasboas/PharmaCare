package pharmacare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class DrugReportsGUI extends javax.swing.JFrame {

    // define table model
    DefaultTableModel dtm = new DefaultTableModel();
    DefaultTableModel dtm2 = new DefaultTableModel();
    
    // define date format
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();
    
    public DrugReportsGUI() {
        initComponents();
        
        try {
        
        // define column names    
        dtm.setColumnIdentifiers(new Object[] {"Drug name", "Dose", "Frequency"});
        tblReport.setModel(dtm);
        dtm2.setColumnIdentifiers(new Object[] {"Drug name", "Dose"});
        tblFilter.setModel(dtm2);
        
        // set current date
        txtReportDate.setText(formatter.format(date));
        
        } catch (Exception e) {
            
            System.out.println(e);        
            
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblReportDate = new javax.swing.JLabel();
        txtReportDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReport = new javax.swing.JTable();
        btnShowReport = new javax.swing.JButton();
        cmbShift = new javax.swing.JComboBox<>();
        btnExit = new javax.swing.JButton();
        lblShift = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFilter = new javax.swing.JTable();
        btnFilter = new javax.swing.JButton();

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
        jScrollPane2.setViewportView(jTable1);

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

        lblReportDate.setText("Report date:");

        tblReport.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblReport);

        btnShowReport.setText("Show report");
        btnShowReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowReportActionPerformed(evt);
            }
        });

        cmbShift.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Afternoon", "Evening", "Whole day" }));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblShift.setText("Choose shift:");

        tblFilter.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblFilter);

        btnFilter.setText("Filter results");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblReportDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtReportDate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnShowReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(381, 381, 381)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblShift)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbShift, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReportDate)
                    .addComponent(txtReportDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowReport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblShift)
                    .addComponent(btnFilter))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnShowReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowReportActionPerformed
        
        dtm.setRowCount(0);
        
        String drugName;
        String dose;
        String frequency;
        int status;
        long startDate;
        long endDate;
        String sReportDate = txtReportDate.getText();
        
        try {
            
            Date d = formatter.parse(sReportDate);
            long reportDate = (long) (d.getTime());
            System.out.println(reportDate);
            String sRDate = Long.toString(reportDate);
            String cmbSelection = cmbShift.getSelectedItem().toString();
            
                       
            System.out.println(sRDate);
            try {
                
                String sqlDetails = "SELECT * FROM prescriptionDetails WHERE sDate <= ? AND eDate >= ?";
                Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");
                PreparedStatement ps = connection.prepareStatement(sqlDetails);
                ps.setString(1, sRDate);
                ps.setString(2, sRDate);
                ResultSet rs = ps.executeQuery();
                
                while(rs.next()) {
                
                    drugName = rs.getString(2);
                    dose = rs.getString(4);
                    frequency = rs.getString(5);
                    dtm.addRow(new Object[] {drugName, dose, frequency});
                    
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }        
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnShowReportActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        
        dtm2.setRowCount(0);
        
        String cmbSelection = cmbShift.getSelectedItem().toString();
        int row = dtm.getRowCount();
        
        for(int r = 0; r < row; r++) {
            String frequency = tblReport.getValueAt(r, 2).toString();
            String drugName = tblReport.getValueAt(r, 0).toString();
            String dose = tblReport.getValueAt(r, 1).toString();
            String once = "Once a day";
            String twice = "Twice a day";
            System.out.println("Frequency:" + frequency + "drug name:" + drugName + "dose:" + dose);
            if (cmbSelection == "Morning") {
                dtm2.addRow(new Object[] {drugName, dose});
                
            } else if((frequency.contentEquals(once) == false) && (cmbSelection == "Afternoon")) {
                System.out.println(r);
                dtm2.addRow(new Object[] {drugName, dose});
            } else if((cmbSelection == "Evening") && (frequency.contentEquals(once) == false) && (frequency.contentEquals(twice)) == false) {
                dtm2.addRow(new Object[] {drugName, dose});
            }
        }
        
        
        
    }//GEN-LAST:event_btnFilterActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrugReportsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnShowReport;
    private javax.swing.JComboBox<String> cmbShift;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblReportDate;
    private javax.swing.JLabel lblShift;
    private javax.swing.JTable tblFilter;
    private javax.swing.JTable tblReport;
    private javax.swing.JTextField txtReportDate;
    // End of variables declaration//GEN-END:variables
}
