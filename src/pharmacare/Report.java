package pharmacare;

public class Report {
    
    long reportDate;
    String drugName;
    String dose;
    long startDate;
    long endDate;
    String frequency;
    int status;
    
    // constructor
    public Report(long reportDate, String drugName, String dose, long startDate, long endDate, String frequency, int status) {
        
        this.reportDate = reportDate;
        this.drugName = drugName;
        this.dose = dose;
        this.startDate = startDate;
        this.endDate = endDate;
        this.frequency = frequency;
        this.status = status;
        
    }
    
    // methods
    public long getReportDate() {
        return this.reportDate;
    }
    
    public String getDrugName() {
        return this.drugName;
    }
    
    public String getDose() {
        return this.dose;
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
    
    public int getStatus() {
        return this.status;
    }
    
}
