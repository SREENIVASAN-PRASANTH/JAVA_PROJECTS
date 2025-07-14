package Inheritance.HospitalManagementSystem;
 
public class UserTest {
    public static void main(String args[]){
        HealthInsurancePlan insurancePlan = new PlatinumPlan();
        Patient patient = new Patient();

        patient.setInsurancePlan(insurancePlan);

        double[] payments = Billing.computePaymentAmounts(patient, 950);

        System.out.println(payments[0] + " " + payments[1]);
    }
}
