/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacare;

import java.util.Date;

public class Prescription {
    
    // declare class variables
    int prescriptionNo;
    Date prescriptionDate;
    String prescriptionDetails;
    String prescribedDoctor;
    int prescribedPatientID;
    String patientName;
    boolean statusOfPrescription;
    
    // constructor
    private void prescription(int prescriptionNo, Date prescriptionDate, String prescriptionDetais, String prescribedDoctor, int prescribedPatientID, String patientName, boolean statusOfPrescription) {
        
        this.prescriptionNo = prescriptionNo;
        this.prescriptionDate = prescriptionDate;
        this.prescriptionDetails = prescriptionDetails;
        this.prescribedDoctor = prescribedDoctor;
        this.prescribedPatientID = prescribedPatientID;
        this.patientName = patientName;
        this.statusOfPrescription = statusOfPrescription;
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
        return this.prescribedPatientID;
    }
    
    public String getPatientName() {
        return this.patientName;
    }
    
    public boolean getStatusOfPrescription() {
        return this.statusOfPrescription;
    }
}
