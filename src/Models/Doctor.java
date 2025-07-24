package Models;

import java.sql.Array;
import java.util.ArrayList;

public class Doctor extends Person
  {
   private ArrayList<String> daysAvailable ;
   private String specialization;

      public Doctor(int age, String gender, String firstName, String lastNAme, ArrayList<String> daysAvailable, String specialization) {
          super(age, gender, firstName, lastNAme);
          this.daysAvailable = daysAvailable;
          this.specialization = specialization;
      }
     public Doctor(){

     }
      public ArrayList<String> getDaysAvailable() {
        return daysAvailable;
    }

    public void setDays(ArrayList<String> daysAvailable) {
        this.daysAvailable = daysAvailable;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

      public void displayData(){
          System.out.println("Name: "+ this.getFirstName()+ " "+ this.getLastNAme());
          System.out.println("Gender: "+this.getGender());
          System.out.println("Age: "+ this.getAge());
          System.out.println("Specialization: "+ this.specialization);
          System.out.println("Days available: "+this.daysAvailable);
      }
      public void displayDataDuringReservingAppointments(){
          System.out.println(this.getFullName());
          System.out.println(this.getSpecialization());
          System.out.println(this.getDaysAvailable());

      }


  }
