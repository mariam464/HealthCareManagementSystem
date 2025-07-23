package Models;
import java.util.regex.*;
abstract public class Person {

    private int nationalId;
    private int age;
    private String gender;
    private String firstName;
    private String lastNAme;
    String pattern ="^[a-zA-z]";
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

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        if(String.valueOf(nationalId).length() == 14) {
            this.nationalId = nationalId;
        }
    }



}
