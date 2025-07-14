package Inheritance.HospitalManagementSystem;

public class Billing {
    public static double[] computePaymentAmounts(Patient patient, double amount){
        double[] payments = new double[2];
        double amountPayByInsurance;
        double amountPayByPatient;
        double discount;

        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        //logic
        if(patientInsurancePlan instanceof PlatinumPlan){
            amountPayByInsurance = amount * patientInsurancePlan.getCoverage();
            discount = 50;
        }

        else if(patientInsurancePlan instanceof GoldPlan){
            amountPayByInsurance = amount * patientInsurancePlan.getCoverage();
            discount = 40;
        }
        else if(patientInsurancePlan instanceof SilverPlan){
            amountPayByInsurance = amount * patientInsurancePlan.getCoverage();
            discount = 30;
        }
        else if(patientInsurancePlan instanceof BronzePlan){
            amountPayByInsurance = amount * patientInsurancePlan.getCoverage();
            discount = 25;
        }

        else{
            amountPayByInsurance = 0;
            discount = 20;
        }

        amountPayByPatient = amount - amountPayByInsurance - discount;

        payments[0] = amountPayByInsurance;
        payments[1] = amountPayByPatient;

        return payments;

    }
}
