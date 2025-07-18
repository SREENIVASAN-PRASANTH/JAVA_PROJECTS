package Inheritance.HospitalManagementSystem;

public class Patient extends User{
    
    private long patientId;
    private boolean insured;
    private HealthInsurancePlan insurancePlan;
    
    
    public void setPatientId(long patientId){
        this.patientId = patientId;
    }
    
    public long getPatientId(){
        return patientId;
    }
    
    public boolean isInsured(){
        return insured;
    }
    
    public void setInsured(boolean insured){
        this.insured = insured;
    }

    
    public HealthInsurancePlan getInsurancePlan(){
        return insurancePlan;
    }

    public void setInsurancePlan(HealthInsurancePlan insurancePlan){
        this.insurancePlan = insurancePlan;
    }
    
}
