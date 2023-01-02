package skinConsultation;
import javax.print.Doc;
import java.util.*;

public class WestminsterSkinConsultationManager extends Person {
    //implementing the main code base
    public static void main(String[] args) {




        //letting the user to input unlimited userinputs
        while (true){
            System.out.println("Welcome to Westminster SkinConsultation Doctor Manager");
            System.out.println();//new line

            System.out.println("Please Select An Option");
            System.out.println();
            System.out.println("""
                    A) To add a Doctor press 1
                    B) To delete a Doctor press 2
                    C) To see the all available Doctors press 3
                    D) To save Data press 4""");

            System.out.println();
            //get a input from user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an Option to continue");
            int userOption= scanner.nextInt();


            if (userOption==1){

                System.out.println("Enter Doctor's Name:");
                Scanner userin = new Scanner(System.in);
                String docName = userin.nextLine();

                System.out.println("Enter Doctor's  SurName:");
                String docSurName = userin.nextLine();

                System.out.println("Enter Doctor's Phone Number");
                int docPhoneNumber = userin.nextInt();

                System.out.println("Enter Doctor's DOB:");
                String docDOB = userin.nextLine();

                System.out.println("Enter Doctor's Address:");
                String docAddress = scanner.nextLine();


                System.out.println(docName+" "+docSurName+" "+docPhoneNumber+" "+docDOB+" "+docAddress);
//                Doctor newDoctor = new Doctor();
//                newDoctor.setName(docName);
            }



            break;


        }



    }
}
