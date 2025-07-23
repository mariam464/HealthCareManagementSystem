package Models;

import java.util.ArrayList;

public class Department {
    private int id;
    private String name;
    private ArrayList<Doctor> doctors = new ArrayList();

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void add(int id, String name){
        Department dept = new Department();
        dept.setId(id);
        dept.setName(name);

    }
}
