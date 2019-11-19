/**********************************************************************/
// Filename: PharmaDB.java
// Purpose: To provide database connectivity and SQL processing
// Author: Marcelo Villas Boas
// Version: 1.0
// Date: 19/11/2019
// Tests: 
/**********************************************************************/

package pharmacare;

public class Doctor {

    int doctorId;
    String doctorName;
    
    // constructor
    private void doctor(int doctorId, String doctorName) {
        
        this.doctorId = doctorId;
        this.doctorName = doctorName;
    }
    
    // methods
    public int getDoctorId() {
        return this.doctorId;
    }
    
    public String getDoctorName() {
        return this.doctorName;
    }
}
