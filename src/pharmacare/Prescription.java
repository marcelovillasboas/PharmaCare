package pharmacare;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Prescription {
    
    // declare class variables
    int prescriptionNo;
    Date prescriptionDate;
    String prescriptionDetails;
    String prescribedDoctor;
    int prescribedPatientId;
    String patientName;
    boolean statusOfPrescription;

    
    // constructor
    public Prescription(int prescriptionNo, String prescribedDoctor, int prescribedPatientId, String patientName) {
        this.prescriptionNo = prescriptionNo;
        this.prescribedDoctor = prescribedDoctor;
        this.prescribedPatientId = prescribedPatientId;
        this.patientName = patientName;
    }
       
    // methods
    public int getPrescriptionNo() {
        return this.prescriptionNo;
    }
    
    public Date getPrescriptionDate() {
        return this.prescriptionDate;
    }
    
    public String getPrescriptionDetails() {
        return this.prescriptionDetails;
    }
    
    public String getPrescribedDoctor() {
        return this.prescribedDoctor;
    }
    
    public int getPrescribedPatientID() {
        return this.prescribedPatientId;
    }
    
    public String getPatientName() {
        return this.patientName;
    }
    
    public boolean getStatusOfPrescription() {
        return this.statusOfPrescription;
    }
}
