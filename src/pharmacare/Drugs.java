package pharmacare;

public class Drugs {
    
    String drugName;
    String drugDose;
    long startDate;
    long endDate;
    String frequency;
    int status;
    String colunm;
    int prescriptionNo;
    
    // constructor
    public Drugs(String drugName, int prescriptionNo, String drugDose, String frequency,  long startDate, long endDate, int status) {
        
        this.prescriptionNo = prescriptionNo;
        this.drugDose = drugDose;
        this.frequency = frequency;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.drugName = drugName;
    }
    
    // methods
    
    public String getDrugName() {
        return this.drugName;
    }
    
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
    
    public int getDose() {
        return this.status;
    }
    
    public String getColumn() {
        return this.column;
    }
    
    public int getPrescriptionNo() {
        return this.prescriptionNo;
    }
    
    public int getStatus() {
        return this.status;
    }
}
