package Put;
import java.util.Scanner;


public class Admin {

    public static void main(String[] args) throws Exception {
        Scanner customer = new Scanner(System.in).useDelimiter("\n");
        Health_A patient_A = new Health_A();
        Health_B patient_B = new Health_B();
        Health_C patient_C = new Health_C();
        System.out.print("Welcome to Blood Hospital, please input your health insurance type with a single character. Your health plan will determine how the billing form is auto generated: ");
        char seguro =   customer.next().toUpperCase().charAt(0);
        switch (seguro){

        case 'A':
        System.out.println("Please enter your Social Secuity number: ");
        int social =customer.nextInt();
        patient_A.setSocial(social);

        System.out.println("What is your name? Please type it here:");
        String name=customer.next();
        patient_A.setName(name);


        System.out.println("What treatment did you receive? Please type the name of the illness/injury here:");
        String treatment = customer.next().replaceAll("\\s+", "");
        patient_A.setTreatment(treatment);

        customer.close();


        System.out.println("----------------------------");
        System.out.println("------Health Plan A Billing Form------");
        System.out.println("Social Security number: " + patient_A.getSocial());

        System.out.println("Full name: " + patient_A.getName());

        System.out.println("Reason for visit: " + patient_A.getTreatment());

        System.out.println("*** $800 billed to insurance ***");
        System.out.println("*** $60 copay required for visit ***");


        System.out.println("Doctor's signature at the bottom in accordance with Health Plan A: " + patient_A.Doc_Sig());

        System.out.println("----------------------------");
                break;
         
         
        case 'B':

        System.out.println("What is your name? Please type it here:");
        String B_name=customer.next();
        patient_B.setName(B_name);


        System.out.println("What treatment did you receive? Please type the name of the illness/injury here:");
        String B_treatment = customer.next().replaceAll("\\s+", "");
        patient_B.setTreatment(B_treatment);


        System.out.println("Please enter your Social Secuity number: ");
        int B_social =customer.nextInt();
        patient_B.setSocial(B_social);
            
        customer.close();
        System.out.println("----------------------------");
        System.out.println("------ Health Plan B Billing Form--------");
        System.out.println("Doctor's signature at the top in accordance with Health Plan B: " + patient_B.Doc_Sig());
        System.out.println("Full name: " + patient_B.getName());
        System.out.println("*** $1000 billed to insurer for visit ***");
        System.out.println("*** $20 copay required for visit ***");
        System.out.println("Reason for visit: " + patient_B.getTreatment());
        System.out.println("Social Security number: " +patient_B.getSocial());


        System.out.println("----------------------------");


        break;
        
        case 'C':

        System.out.println("What is your name? Please type it here:");
        String C_name=customer.next();
        patient_C.setName(C_name);


        System.out.println("What treatment did you receive? Please type the name of the illness/injury here:");
        String C_treatment = customer.next().replaceAll("\\s+", "");
        patient_C.setTreatment(C_treatment);


        System.out.println("Please enter your Social Secuity number: ");
        int C_social =customer.nextInt();
        patient_C.setSocial(C_social);

        customer.close();
        System.out.println("----------------------------");
        System.out.println("------ Health Plan C Billing Form--------");
        System.out.println("Doctor's signature at the top in accordance with Health Plan C: " + patient_C.Doc_Sig());
        System.out.println("Size of bed occupied for procedurce(required info for Health Care C Plan): " + patient_C.bed_size());
        System.out.println("Full name: " + patient_C.getName());
        System.out.println("*** $1200 billed to insurer for visit ***");
        System.out.println("*** $30 copay required for visit ***");
        System.out.println("Reason for visit: " + patient_C.getTreatment());
        System.out.println("Social Security number: " +patient_C.getSocial());


        System.out.println("----------------------------");

            break;
        default:
         System.out.println("Get insurance");
         System.exit(0);
        }
    }
}