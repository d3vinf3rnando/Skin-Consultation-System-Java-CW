package skinConsultation;
import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class WestminsterSkinConsultationManager extends Person {



    //implementing the main code base
    public static void main(String[] args) {

        List<String> Doclist = new ArrayList<>();
        List<String> allDoclist = new ArrayList<>();



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
                
                System.out.println("Enter Doctor's DOB:");
                String docDOB = userin.nextLine();

                System.out.println("Enter Doctor's Address:");
                String docAddress = userin.nextLine();

                System.out.println("Enter Doctor's Specialisation:");
                String docSpec = userin.nextLine();

                System.out.println("Enter Doctor's Phone Number");
                int docPhoneNumber = userin.nextInt();

                System.out.println("Enter Doctor's Medical Licence Number");
                int docMedLicenceNumber = userin.nextInt();



                //create doctor object to add a new doctor
                Doctor newDoctor = new Doctor();
                newDoctor.setName(docName);
                newDoctor.setSurName(docSurName);
                newDoctor.setDate_of_Birth(docDOB);
                newDoctor.setAddress(docAddress);
                newDoctor.setPhone_Number(docPhoneNumber);
                newDoctor.setMedical_Licence_Number(docMedLicenceNumber);
                newDoctor.setSpecialisation(docSpec);

                //add user input doctor details to a list
                Doclist.add(newDoctor.getName());
                Doclist.add(newDoctor.getSurName());
                Doclist.add(newDoctor.getDate_of_Birth());
                Doclist.add(newDoctor.getAddress());
                String strDocPhoneNumber=String.valueOf(newDoctor.getPhone_Number()); //converting int values into string
                Doclist.add(strDocPhoneNumber);
                String strDocMedLicNumber=String.valueOf(newDoctor.getMedical_Licence_Number());
                Doclist.add(strDocMedLicNumber);
                Doclist.add(newDoctor.getSpecialisation());

                allDoclist.add(Doclist.toString());
                System.out.println(allDoclist);



            }else if(userOption==2){

            }






        }



    }
}
