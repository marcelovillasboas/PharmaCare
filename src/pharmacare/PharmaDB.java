package pharmacare;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class PharmaDB {
    
    public static void addPrescription(Prescription p) throws Exception {
        String sqlPrescription = "INSERT INTO prescription (prescriptionNo, prescribedDoctor, prescribedPatientId, patientName) VALUES (?, ?, ?, ?)";
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");

        try {
            PreparedStatement psPrescription = connection.prepareStatement(sqlPrescription);
            psPrescription.setInt(1, p.getPrescriptionNo());
            psPrescription.setString(2, p.getPrescribedDoctor());
            psPrescription.setInt(3, p.getPrescribedPatientID());
            psPrescription.setString(4, p.getPatientName());
            psPrescription.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Prescription not added");
            throw new Exception(e);
        }
    }
    
    /*public static void getPrescriptionNo(Prescription p) throws Exception {
        String sqlPresNo = "SELECT prescriptionNo FROM prescription WHERE (patientName = ? AND prescribedDoctor = ?)";
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");
                
        try {
            PreparedStatement psPresNo = connection.prepareStatement(sqlPresNo);
            psPresNo.setString(1, p.getPatientName());
            psPresNo.setString(2, p.getPrescribedDoctor());
            ResultSet rsPresNo = psPresNo.executeQuery();
            
            while(rsPresNo.next()) {
                int prescriptionNo = rsPresNo.getInt(1);
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }*/
    
    public static void addPrescriptionDetails(PrescriptionDetails pd, Prescription p) throws Exception {
    
        long startDate = pd.getStartDate();
        long endDate = pd.getEndDate();
        int prescriptionNo;
        
        
        String sqlPrescriptionDetails = "INSERT INTO prescriptionDetails (prescriptionNo, drugName, drugDose, frequency, status, sDate, eDate) VALUES (?, ?, ?, ?, ?, ?, ?)";
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");
        
        try {
                        
            PreparedStatement psPresDetails = connection.prepareStatement(sqlPrescriptionDetails);
            psPresDetails.setInt(1, p.prescriptionNo);
            psPresDetails.setString(2, pd.getDrugName());
            psPresDetails.setString(3, pd.getDrugDose());
            psPresDetails.setString(4, pd.getFrequency());
            psPresDetails.setInt(5, pd.getStatusOfDose());
            psPresDetails.setLong(6, startDate);
            psPresDetails.setLong(7, endDate);
            psPresDetails.executeUpdate();
            System.out.println("Prescription Details added");
        } catch (Exception e) {
            System.out.println("Prescription details not added");
            System.out.println(e);
        }
        
    }
    
    public static void editDrugs(Drugs d) throws Exception {
         
        long startDate = d.getStartDate();
        long endDate = d.getEndDate();
        String drugName = d.getDrugName();
        String dose = d.getDrugDose();
        int prescriptionNo = d.getPrescriptionNo();
        String frequency = d.getFrequency();
        int status = d.getStatus();        
        
        System.out.println("drug name: " + drugName + "     dose: " + dose + "      number: " + prescriptionNo);
        
        
        String sqlDose = "UPDATE prescriptionDetails SET drugDose = ? WHERE (drugName = ? AND prescriptionNo = ?)";
        String sqlFrequency = "UPDATE prescriptionDetails SET frequency = ? WHERE (drugName = ? AND prescriptionNo = ?)";
        String sqlStartDate = "UPDATE prescriptionDetails SET sDate = ? WHERE (drugName = ? AND prescriptionNo = ?)";
        String sqlEndDate = "UPDATE prescriptionDetails SET eDate = ? WHERE (drugName = ? AND prescriptionNo = ?)";
        String sqlStatus = "UPDATE prescriptionDetails SET status = ? WHERE (drugName = ? AND prescriptionNo = ?)";
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");
        
        try {
            PreparedStatement psDose = connection.prepareStatement(sqlDose);
            psDose.setString(1, dose);
            psDose.setString(2, drugName);
            psDose.setInt(3, prescriptionNo);
            psDose.executeUpdate();
            System.out.println("Worked");
        } catch (Exception e) {
            System.out.println("Dose to DB issue.");
        }
        
        /*
        try {
            PreparedStatement psFrequency = connection.prepareStatement(sqlFrequency);
            psFrequency.setString(1, frequency);
            psFrequency.setString(2, drugName);
            psFrequency.setInt(3, prescriptionNo);
            psFrequency.executeUpdate();
        } catch (Exception e) {
            System.out.println("Frequency to DB issue.");
        }
        
        try {
            PreparedStatement psStartDate = connection.prepareStatement(sqlStartDate);
            psStartDate.setLong(1, startDate);
            psStartDate.setString(2, drugName);
            psStartDate.setInt(3, prescriptionNo);
            psStartDate.executeUpdate();
        } catch (Exception e) {
            System.out.println("sDate to DB issue.");
        }
        
        try {
            PreparedStatement psEndDate = connection.prepareStatement(sqlEndDate);
            psEndDate.setLong(1, endDate);
            psEndDate.setString(2, drugName);
            psEndDate.setInt(3, prescriptionNo);
            psEndDate.executeUpdate();
        } catch (Exception e) {
            System.out.println("eDate to DB issue.");
        }
        
        try {
            PreparedStatement psStatus = connection.prepareStatement(sqlStatus);
            psStatus.setInt(1, status);
            psStatus.setString(2, drugName);
            psStatus.setInt(3, prescriptionNo);
            psStatus.executeUpdate();   
        } catch (Exception e) {
            System.out.println("Status to DB issue.");
        }
        */
    }
    
    /*public static void printReport(Report r) throws Exception {
        
        String drugName;
        String dose;
        String frequency;
        int status;
        long startDate;
        long endDate;
        long reportDate = r.getReportDate();
        int prescriptionNo;
        
        String sqlDetails = "SELECT * FROM prescriptionDetails WHERE sDate <= ? AND eDate >= ?";
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "P@ssw0rd011");
        
        try {
            
            PreparedStatement ps = connection.prepareStatement(sqlDetails);
            ps.setLong(1, reportDate);
            ps.setLong(2, reportDate);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                drugName = rs.getString(2);
                dose = rs.getString(3);
                prescriptionNo = rs.getInt(1);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }        
}*/

}
