package Console_Implementation;

public class Consultation {
    private Date date;
    private String timeSlot;
    private double cost;
    private String notes;
    private Doctor doctor;
    private Patient patient;
    private int patientAppTime;

    public Consultation(Date date, String timeSlot, double cost, String notes) {
        this.date = date;
        this.timeSlot = timeSlot;
        this.cost = cost;
        this.notes = notes;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getPatientAppTime() {
        return patientAppTime;
    }

    public void setPatientAppTime(int patientAppTime) {
        this.patientAppTime = patientAppTime;
    }

    public Doctor getDoctors(){
        return getDoctors();
    }
}
