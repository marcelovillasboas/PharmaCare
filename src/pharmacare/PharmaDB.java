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

/**
 *
 * @author marce
 */
public class PharmaDB {
    
    public static int addPrescription(String prescribedDoctor, int prescribedPatientId,
                                                        String patientName) throws Exception {
       String sqlPrescription = "INSERT INTO prescription (prescriptionNo, prescribedDoctor, prescribedPatientId, patientName) VALUES (prescriptionNoSequence.nextval, ?, ?, ?)";
       Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");

       
       // need to fix the generated key with an auto increment SQL solution (IDENTITY)
       try {
           PreparedStatement psPrescription = connection.prepareStatement(sqlPrescription, PreparedStatement.RETURN_GENERATED_KEYS);
           psPrescription.setString(1, prescribedDoctor);
           psPrescription.setInt(2, prescribedPatientId);
           psPrescription.setString(3, patientName);
           psPrescription.executeUpdate();
           ResultSet rs = psPrescription.getGeneratedKeys();
           
           if (rs.next()) {
               return (rs.getInt(1));
           } else {
               return -1;
           }
           
       } catch (SQLException e) {
           throw new Exception(e);
       }
    }
    
    public static void addPrescriptionDetails(PrescriptionDetails pd) throws Exception {
    
        System.out.println("Enter presdetails");
        Date startDate = pd.getStartDate();
        Date endDate = pd.getEndDate();
        
        // need to fix the date conversion to DB
        String sqlPrescriptionDetails = "INSERT INTO prescriptionDetails (prescriptionNo, drugName, drugDose, frequency, startDate, endDate, status) VALUES (prescriptionDetailsSeq.nextval, ?, ?, ?, TO_DATE('" + startDate + "', 'dd/MM/yyyy'), TO_DATE('" + endDate + "', 'dd/MM/yyyy'), ?)";
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");
        System.out.println("presdetails connected");
        
        try {
                        
            PreparedStatement psPresDetails = connection.prepareStatement(sqlPrescriptionDetails);
            // psPresDetails.setInt(1, pd.getPrescriptionNo());
            psPresDetails.setString(1, pd.getDrugName());
            psPresDetails.setString(2, pd.getDrugDose());
            psPresDetails.setString(3, pd.getFrequency());
            psPresDetails.setInt(4, pd.getStatusOfDose());
            psPresDetails.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Didn't enter the prepared statement");
            System.out.println(e);
        }
                
    }
}
