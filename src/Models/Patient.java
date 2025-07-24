package Models;

import java.util.ArrayList;

public class Patient extends Person
{
    public ArrayList<Appointment> appointments = new ArrayList();

    public Patient( int age, String gender, String firstName, String lastNAme) {
        super(age, gender, firstName, lastNAme);
    }
    public Patient(){

    }
    public void displayData(){
        System.out.println("Name: "+ this.getFirstName()+ " "+ this.getLastNAme());
        System.out.println("Gender: "+this.getGender());
        System.out.println("Age: "+ this.getAge());
        if(appointments.toArray().length!=0){
            System.out.println("Appointments: ");
            for (var item : appointments){
                item.displayAppiontmentDataForSpecificPatient();
            }
        }
    }



}
