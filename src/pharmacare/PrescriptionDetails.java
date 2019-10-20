/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacare;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


public class PrescriptionDetails {
    
    // declare class variables
    //int prescriptionNo;
    String drugName;
    // String drugForm;
    String drugDose;
    long startDate;
    long endDate;
    String frequency;
    int statusOfDose;
    
    // constructor
    public PrescriptionDetails(/*int prescriptionNo,*/ String drugName, String drugDose, long startDate, long endDate, String frequency, int status) {
        
        // this.prescriptionNo = prescriptionNo;
        this.drugName = drugName;
        // this.drugForm = drugForm;
        this.drugDose = drugDose;
        this.startDate = startDate;
        this.endDate = endDate;
        this.frequency = frequency;
        this.statusOfDose = statusOfDose;
        
    }
    
    // methods
    
    /*
    public int getPrescriptionNo() {
        return this.prescriptionNo;
    }*/
    
    public String getDrugName() {
        return this.drugName;
    }
    
    /*public String getDrugForm() {
        return this.drugForm;
    }*/
    
    public String getDrugDose() {
        return this.drugDose;
    }
    
    public long getStartDate() {
        return this.startDate;
    }
    
    public long getEndDate() {
        return this.endDate;
    }
    
    public String getFrequency() {
        return this.frequency;
    }
    
    public int getStatusOfDose() {
        return this.statusOfDose;
    }
    
}
