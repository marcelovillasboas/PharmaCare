package pharmacare;

public class Drugs {
    
    String drugName;
    String drugDose;
    long startDate;
    long endDate;
    String frequency;
    int status;
    String colunm;
    
    // constructor
    public Drugs(String drugName, String drugDose, long startDose, long endDate, String frequency, int status) {
        
        this.drugName = drugName;
        this.drugDose = drugDose;
        this.startDate = startDate;
        this.endDate = endDate;
        this.frequency = frequency;
        this.status = status;
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
    
    public String getColunm() {
        return this.colunm;
    }
}
