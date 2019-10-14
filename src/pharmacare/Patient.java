/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacare;

public class Patient {
    
    int patientId;
    String patientName;
    int prescriptionNo;
    int patientType;
    
    // constructor
    private void patient(int patientId, String patientName, int prescriptionNo, int patientType) {
        
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientType = patientType;
        this.prescriptionNo = prescriptionNo;
        
    }
    
    // methods
    public int getPatientId() {
        return this.patientId;
    }
    
    public String getPatientName() {
        return this.patientName;
    }
    
    public int getPatientType() {
        return this.patientType;
    }
    
    public int getPrescriptionNo() {
        return this.prescriptionNo;
    }
}
