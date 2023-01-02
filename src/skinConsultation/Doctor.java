package skinConsultation;

//create a subclass called doctor
public class Doctor  extends  Person{

    //create private variables for doctor class
    private int Medical_Licence_Number;
    private String Specialisation;

    String[] allDoctors;






    //generating getters and setters for above variables
    public int getMedical_Licence_Number() {
        return Medical_Licence_Number;
    }

    public void setMedical_Licence_Number(int medical_Licence_Number) {
        Medical_Licence_Number = medical_Licence_Number;
    }

    public String getSpecialisation() {
        return Specialisation;
    }

    public void setSpecialisation(String specialisation) {
        Specialisation = specialisation;
    }
}
