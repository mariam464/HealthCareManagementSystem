package Models;

import java.util.Date;

public class Appointment {
    public String date;
    public String doctorName;
    public String patientName;
    public void displayFullAppiontmentData(){
        System.out.println("Date: "+ this.date);
        System.out.println("Patient name: " + this.patientName);
        System.out.println("Doctor name: " + this.doctorName);
    }
    public void displayAppiontmentDataForSpecificPatient(){
        System.out.println("Date: "+ this.date);
        System.out.println("Doctor name: " + this.doctorName);
    }
    public void displayData(){
        System.out.println("Patient: "+this.patientName);
        System.out.println("Doctor: "+this.doctorName);
        System.out.println("Date: "+ this.date);


    }

    public Appointment(String date, String doctorName, String patientName) {
        this.date = date;
        this.doctorName = doctorName;
        this.patientName = patientName;
    }
    public Appointment(){

    }
}
