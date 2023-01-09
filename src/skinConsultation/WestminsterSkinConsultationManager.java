package skinConsultation;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Collections;

public class WestminsterSkinConsultationManager extends Person {



    //implementing the main code base
    public static void main(String[] args) throws IOException{

        List<String> Doclist = new ArrayList<>();
        List<String> allDoclist = new ArrayList<>(10);
        int docCount=0;



        //letting the user to input unlimited userinputs
        while (true) {
            System.out.println("Welcome to Westminster SkinConsultation Doctor Manager");
            System.out.println();//new line

            System.out.println("Please Select An Option");
            System.out.println();
            System.out.println("""
                    A) To add a Doctor press 1
                    B) To delete a Doctor press 2
                    C) To see the all available Doctors press 3
                    D) To save Data press 4
                    E) To exit press 0
                    """);

            System.out.println();
            //get a input from user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter an Option to continue");
            int userOption = scanner.nextInt();



            if (userOption == 1) {
                docCount++;
                if (docCount == 10) {
                    System.out.println("Maximum Number of Doctors Reached, Delete some doctors to add new");
                    break;

                }


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
                System.out.println("Doctor has been added to the system");


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
                String strDocPhoneNumber = String.valueOf(newDoctor.getPhone_Number()); //converting int values into string
                Doclist.add(strDocPhoneNumber);
                String strDocMedLicNumber = String.valueOf(newDoctor.getMedical_Licence_Number());
                Doclist.add(strDocMedLicNumber);
                Doclist.add(newDoctor.getSpecialisation());

                allDoclist.add(Doclist.toString());
                Doclist.clear();
//                System.out.println(allDoclist); //remove later -only for testing-


            } else if (userOption == 2) {
                Scanner userin = new Scanner(System.in);
                System.out.println("Please enter Doctor's Medical Licence Number to delete ");
                String deleteDoc = userin.nextLine();

                //added a for loop iterate over the list to check the doctor is available in the multi.d list
                for (int docIndex = 0; docIndex < allDoclist.size(); docIndex++) {
                    if (allDoclist.get(docIndex).contains(deleteDoc)) {
                        allDoclist.remove(docIndex);
                        System.out.println("Doctor has been deleted!!!");
                        System.out.println("System has "+allDoclist.size()+" number of doctors");
                        break;
                    }
                }

            } else if (userOption == 3) {

                //sort using java collection sort
                Collections.sort(allDoclist);
                for (String Doctors : allDoclist) {
                    System.out.println(Doctors);}


                //sort uing java collection sort
//                }
//                Collections.sort(allDoclist, (list1, list2) -> 0);
//                for (String sublist : allDoclist) {
//                    System.out.println(sublist);
//                }




            } else if (userOption==4) {
                //write data into a file
                FileWriter writer = new FileWriter("Doctordata.txt", true);
                for (String ddata : allDoclist) { //ddata = doctor's data
                    writer.write(ddata + "\n");
                }
                writer.close();
                System.out.println("Data saved successfully!!1");

            }else if (userOption==0) {
                break;
            }else{
                System.out.println("Please check the option again...");
            }
        }


    }
}
