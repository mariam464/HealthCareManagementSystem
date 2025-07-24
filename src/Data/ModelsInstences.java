package Data;

import Models.Appointment;
import Models.Doctor;
import Models.Patient;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;

public class ModelsInstences {
    public ArrayList<Doctor> doctors = new ArrayList();
    public ArrayList<Patient> patients = new ArrayList();
    public ArrayList<Appointment> appointments = new ArrayList();



    public ModelsInstences() {
        Doctor doctor1 = new Doctor(

                35,
                "Female",
                "Mariam",
                "Ahmed",
                new ArrayList<>(Arrays.asList("Sunday", "Tuesday", "Thursday")),
                "Gynecologist"
        );

        Doctor doctor2 = new Doctor(

                40,
                "Male",
                "Ali",
                "Hassan",
                new ArrayList<>(Arrays.asList("Monday", "Wednesday")),
                "Cardiologist"
        );

        Doctor doctor3 = new Doctor(
                38,
                "Female",
                "Sarah",
                "Mahmoud",
                new ArrayList<>(Arrays.asList("Friday", "Saturday")),
                "Pediatrician"
        );
        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);

        Patient patient1 = new Patient(25, "Female", "Sara", "Nabil");
        Patient patient2 = new Patient(30, "Male", "Mohamed", "Hassan");


        Appointment appointment1 = new Appointment();
        appointment1.date = "9/8/2024";
        appointment1.doctorName = "Dr. Mariam Ahmed";
        appointment1.patientName = patient1.getFirstName() + " " + patient1.getLastNAme();

        Appointment appointment2 = new Appointment();
        appointment1.date = "3/2/2025";
        appointment2.doctorName = "Dr. Ali Hassan";
        appointment2.patientName = patient2.getFirstName() + " " + patient2.getLastNAme();
        patient1.appointments.add(appointment1);
        patient2.appointments.add(appointment2);
        patients.add(patient1);
        patients.add(patient2);
        appointments.add(appointment1);
        appointments.add(appointment2);



    }

    public ArrayList<Doctor> getDoctors(){
      return doctors;
    }
    public ArrayList<Patient> getPatients(){
        return patients;
    }
    public ArrayList<Appointment> getAppointments(){
        return appointments;
    }

    public void addDoctor(Doctor doctor){
       doctors.add(doctor);
    }
    public void removeDoctor(Doctor doctor){
        if(patients.contains(doctor)){
            doctors.remove(doctor);
        }
    }
    public void addPatient(Patient patient){
        patients.add(patient);
    }
    public void removePatient(Patient patient){
        if(patients.contains(patient)){
            patients.remove(patient);
        }
    }
    public void reserveAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void cancelAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }
}
