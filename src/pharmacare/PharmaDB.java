package pharmacare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class PharmaDB {
    
    public static int addPrescription(Prescription p) throws Exception {
       String sqlPrescription = "INSERT INTO prescription (prescriptionNo, prescribedDoctor, prescribedPatientId, patientName) VALUES (prescriptionId.nextval, ?, ?, ?)";
       Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");

       try {
           PreparedStatement psPrescription = connection.prepareStatement(sqlPrescription, PreparedStatement.RETURN_GENERATED_KEYS);
           psPrescription.setString(1, p.getPrescribedDoctor());
           psPrescription.setInt(2, p.getPrescribedPatientID());
           psPrescription.setString(3, p.getPatientName());
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
    
        long startDate = pd.getStartDate();
        long endDate = pd.getEndDate();
        
        String sqlPrescriptionDetails = "INSERT INTO prescriptionDetails (prescriptionNo, drugName, drugDose, frequency, status, sDate, eDate) VALUES (prescriptionId.nextval, ?, ?, ?, ?, ?, ?)";
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");
        
        try {
                        
            PreparedStatement psPresDetails = connection.prepareStatement(sqlPrescriptionDetails);
            psPresDetails.setString(1, pd.getDrugName());
            psPresDetails.setString(2, pd.getDrugDose());
            psPresDetails.setString(3, pd.getFrequency());
            psPresDetails.setInt(4, pd.getStatusOfDose());
            psPresDetails.setLong(5, startDate);
            psPresDetails.setLong(6, endDate);
            psPresDetails.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Didn't enter prepared statement");
            System.out.println(e);
        }
                
    }

}
