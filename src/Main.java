import Data.ModelsInstences;
import Models.Appointment;
import Models.Doctor;
import Models.Patient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ModelsInstences models = new ModelsInstences();
        ArrayList<Doctor> doctors = models.getDoctors();
        ArrayList<Patient> patients = models.getPatients();
        ArrayList<Appointment> appointments = models.getAppointments();
        boolean exit = false;
        int choice;
        System.out.println("Health care clinics management system");
        System.out.println("________________________________________________");
        while(!exit) {
        System.out.println();
        System.out.println("1. Register new patient");
        System.out.println("2. view patients");
        System.out.println("3. Edit a patient record");
        System.out.println("4. Register new doctor");
        System.out.println("5. View doctors");
        System.out.println("6. Edit doctor profile");
            System.out.println("7. Reserve an appointment");
            System.out.println("8. Cancel an appointment");
            System.out.println("9. Change date appointment");
            System.out.println("10. View past visits and future appointments");
            System.out.println("11. Exit");
        System.out.print("Enter your choice: ");
        Scanner scan = new Scanner(System.in);
        choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter patient first name: ");
                    String firstName = scan.next();
                    System.out.print("Enter patient last name: ");
                    String lastName = scan.next();
                    System.out.print("Enter patient gender: ");
                    String gender = scan.next();
                    System.out.print("Enter patient age: ");
                    int age = scan.nextInt();
                    Patient patient = new Patient(age, gender, firstName, lastName);
                    models.addPatient(patient);
                    patient.displayData();

                    break;
                case 2:
                    for (var person : patients) {
                        person.displayData();
                        //couple of line spacing
                        System.out.println();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter patient first name: ");
                    String _firstName = scan.next().toLowerCase();
                    System.out.print("Enter patient last name: ");
                    String _lastName = scan.next().toLowerCase();
                    String fullName = _firstName.concat(" "+_lastName);
                    Patient foundPatient = new Patient();
                    for (var person : patients) {
                        if (fullName.equals(person.getFullName().toLowerCase())) {
                            foundPatient = person;
                           break;
                        } else {
                            foundPatient = null;
                        }
                    }
                    if (foundPatient == null) {
                        System.out.println("Name is incorrect");
                    } else {
                        foundPatient.displayData();
                        System.out.println("Enter new data");
                        System.out.print("Enter patient first name: ");
                        String newFirstName = scan.next();
                        System.out.print("Enter patient last name: ");
                        String newLastName = scan.next();
                        System.out.print("Enter patient gender: ");
                        String newGender = scan.next();
                        System.out.print("Enter patient age: ");
                        int newAge = scan.nextInt();
                        Patient updatedPatient = new Patient(newAge, newGender, newFirstName, newLastName);
                        updatedPatient.appointments = foundPatient.appointments;
                        models.removePatient(foundPatient);
                        models.addPatient(updatedPatient);
                        updatedPatient.displayData();
                    }
                    break;
                case 4:
                    System.out.print("Enter doctor first name: ");
                    String doctorFirstName = scan.next();
                    System.out.print("Enter doctor last name: ");
                    String doctorLastName = scan.next();
                    System.out.print("Enter doctor gender: ");
                    String doctorGender = scan.next();
                    System.out.print("Enter doctor age: ");
                    int doctorAge = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter specialization: ");
                    String specialization = scan.nextLine();
                    System.out.println("Enter days available with a space between: ");
                    String[] days = scan.nextLine().split(" ");
                    ArrayList<String> daysAvailable = new ArrayList();
                    daysAvailable.addAll(List.of(days));


                    Doctor doctor = new Doctor(doctorAge, doctorGender, doctorFirstName, doctorLastName, daysAvailable, specialization);
                    models.addDoctor(doctor);
                    doctor.displayData();

                    break;
                case 5:
                    if (models.doctors.toArray().length != 0) {
                        for (var person : models.doctors) {
                            person.displayData();
                            //couple of line spacing
                            System.out.println();
                            System.out.println();
                        }
                    }
                    break;
                case 6:
                    System.out.print("Enter doctor first name: ");
                    String _doctorFirstName = scan.next().toLowerCase();
                    System.out.print("Enter doctor last name: ");
                    String _doctorLastName = scan.next().toLowerCase();
                    String _fullName = _doctorFirstName.concat(" "+_doctorLastName);
                    Doctor foundDoctor = new Doctor();
                    for (var person : doctors) {
                        if (_fullName.equals(person.getFullName().toLowerCase())) {
                            foundDoctor = person;
                            break;
                        } else {
                            foundDoctor = null;
                        }
                    }
                    if (foundDoctor == null) {
                        System.out.println("Name is incorrect");
                    } else {
                        foundDoctor.displayData();
                        System.out.println("Enter new data");
                        System.out.print("Enter patient first name: ");
                        String newFirstName = scan.next();
                        System.out.print("Enter patient last name: ");
                        String newLastName = scan.next();
                        System.out.print("Enter patient gender: ");
                        String newGender = scan.next();
                        System.out.print("Enter patient age: ");
                        int newAge = scan.nextInt();
                        scan.nextLine();

                        System.out.println("Enter days available with a space between: ");
                        String[] newDays = scan.nextLine().split(" ");
                        ArrayList<String> newDaysAvailable = new ArrayList();
                        newDaysAvailable.addAll(List.of(newDays));
                        Doctor updatedDoctor = new Doctor(newAge, newGender, newFirstName, newLastName,newDaysAvailable,foundDoctor.getSpecialization());
                        models.removeDoctor(foundDoctor);
                        models.addDoctor(updatedDoctor);
                        updatedDoctor.displayData();
                    }
                case 7:
                    System.out.println("Enter patient name: ");
                    String patientName = scan.nextLine();
                    System.out.println("Doctors");
                    for(var person : doctors){
                        person.displayDataDuringReservingAppointments();
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("Enter doctor name: ");
                    String doctorName = scan.nextLine();
                    System.out.println("Enter date  in (mm-dd-yy) format: ");
                    String date = scan.nextLine();
                    Appointment newAppointment = new Appointment(date,patientName, doctorName);
                    models.reserveAppointment(newAppointment);
                    System.out.println("Success");
                    break;
                case 8:
                    System.out.println("Enter patient name:");
                    String name = scan.nextLine();
                    for(var appoint : appointments){
                        if(appoint.patientName.equals(name)){
                            models.cancelAppointment(appoint);
                            break;
                        }
                    }
                    break;
                case 9:
                    System.out.println("Enter patient name:");
                    String _name = scan.nextLine();
                    for(var appoint : appointments){
                        if(appoint.patientName.equals(_name)){
                            System.out.println("Enter new date in (mm-dd-yy)format");
                            appoint.date = scan.nextLine();
                        }
                    }
                    break;
                case 10:
                    for(var item : appointments){
                        item.displayData();
                    }
                    break;
                case 11:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }
}