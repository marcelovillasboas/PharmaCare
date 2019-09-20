/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacare;

import java.util.Date;

public class PrescriptionDetails {
    
    // declare class variables
    String drugName;
    String drugForm;
    String drugDose;
    Date firstTime;
    Date lastTime;
    int timesPerDay;
    boolean statusOfDose;
    
    // constructor
    private void prescriptionDetails(String drugName, String drugForm, String drugDose, Date firstTime, Date lastTime, int timesPerDay, boolean statusOfDose) {
        
        this.drugName = drugName;
        this.drugForm = drugForm;
        this.drugDose = drugDose;
        this.firstTime = firstTime;
        this.lastTime = lastTime;
        this.timesPerDay = timesPerDay;
        this.statusOfDose = statusOfDose;
        
    }
    
    // methods
    
    public String getDrugName() {
        return this.drugName;
    }
    
    public String getDrugForm() {
        return this.drugForm;
    }
    
    public String getDrugDose() {
        return this.drugDose;
    }
    
    public Date getFirstTime() {
        return this.firstTime;
    }
    
    public Date getLastTime() {
        return this.lastTime;
    }
    
    public int getTimesPerDay() {
        return this.timesPerDay;
    }
    
    public boolean getStatusOfDose() {
        return this.statusOfDose;
    }
    
}
