/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacare;

import java.util.Date;

public class OpdPrescription {
    
    // declare class variables
    boolean toFill;
    boolean filedAndDispatched;
    Date dateDispatched;
    String timeDispatched;
    boolean indoorEmergency;
    
    // constructor
    private void opdPrescription(boolean toFill, boolean filedAndDispatched, Date dateDispatched, String timeDispatched, boolean indoorEmergency) {
        
        this.toFill = toFill;
        this.filedAndDispatched = filedAndDispatched;
        this.dateDispatched = dateDispatched;
        this.timeDispatched = timeDispatched;
        this.indoorEmergency = indoorEmergency;
    }
    
    // methods
    public boolean getToFill() {
        return this.toFill;
    }
    
    public boolean getFiledAndDispatched() {
        return this.filedAndDispatched;
    }
    
    public Date getDateDispatched() {
        return this.dateDispatched;
    }
    
    public String getTimeDispatched() {
        return this.timeDispatched;
    }
    
    public boolean getIndoorEmergency() {
        return this.indoorEmergency;
    }
}
