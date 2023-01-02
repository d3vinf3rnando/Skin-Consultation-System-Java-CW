package skinConsultation;

import java.util.Date;

public class Consultation extends  Person {
    private int Consultation_ID;

    public int getConsultation_ID() {
        return Consultation_ID;
    }

    public void setConsultation_ID(int consultation_ID) {
        Consultation_ID = consultation_ID;
    }

    public Date getDateAndTime() {
        return DateAndTime;
    }

    public void setDateAndTime(Date dateAndTime) {
        DateAndTime = dateAndTime;
    }

    public Double getCost() {
        return Cost;
    }

    public void setCost(Double cost) {
        Cost = cost;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    private Date DateAndTime;

    private Double Cost;
    private String Notes;
}
