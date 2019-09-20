/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacare;

/**
 *
 * @author marcelo
 */
public class IndoorPrescription {
    
    // declare class variables
    int roomNumber;
    int wingNumber;
    int floorNumber;
    int nurseStationID;
    
    // constructor
    private void indoorPrescription(int roomNumber, int wingNumber, int floorNumber, int nurseStationID) {
        this.roomNumber = roomNumber;
        this.wingNumber = wingNumber;
        this.floorNumber = floorNumber;
        this.nurseStationID = nurseStationID;
    }
    
    // methods
    public int getRoomNumber() {
        return this.roomNumber;
    }
    
    public int getWingNumber() {
        return this.wingNumber;
    }
    
    public int getFloorNumber() {
        return this.floorNumber;
    }
    
    public int getNurseStationID() {
        return this.nurseStationID;
    }
    
}
