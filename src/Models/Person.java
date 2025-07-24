package Models;
import java.util.regex.*;
 public class Person {


    private  int age;
    private String gender;
    private String firstName;
    private String lastNAme;
    String pattern ="^[a-zA-z]";


     public Person(int age, String gender, String firstName, String lastNAme) {

         this.age = age;
         this.gender = gender;
         this.firstName = firstName;
         this.lastNAme = lastNAme;

     }

     public Person() {
     }

     public String getLastNAme() {
         return lastNAme;
     }
     public void setLastNAme(String lastNAme) {
        if(lastNAme.matches(pattern)) {
            this.lastNAme = lastNAme;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.matches(firstName)) {
            this.firstName = firstName;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender.equalsIgnoreCase("female")|| gender.equalsIgnoreCase("male")) {
            this.gender = gender;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0 && age<200) {
            this.age = age;
        }
    }


     public String getFullName() {
         return this.firstName.concat(" "+ this.lastNAme);
     }
 }
