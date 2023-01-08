package skinConsultation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WestminsterSkinConsultationManagerTest {

    @Test
    void main() {

        //created a new object called testDoctor to do the unit test using Junit
        Doctor testDoctor = new Doctor();

        //set the values
        testDoctor.setName("Devin");
        testDoctor.setSurName("Fernando");
        testDoctor.setDate_of_Birth("2001");
        testDoctor.setPhone_Number(119);
        testDoctor.setMedical_Licence_Number(20200219);
        testDoctor.setSpecialisation("Coding");

        //get the values that we are expecting from the test
        assertEquals("Devin",testDoctor.getName());
        assertEquals("Fernando",testDoctor.getSurName());
        assertEquals("2001",testDoctor.getDate_of_Birth());
        assertEquals(119,testDoctor.getPhone_Number());
        assertEquals(20200219,testDoctor.getMedical_Licence_Number());
        assertEquals("Coding",testDoctor.getSpecialisation());

    }
}

//resources link : https://youtu.be/o5pE7L2tVV8