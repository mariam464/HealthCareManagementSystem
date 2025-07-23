package Data;

import Models.Doctor;

import java.util.ArrayList;

public class ModelsInstences {
    public ArrayList<Doctor> doctors = new ArrayList();
    Doctor doctor = new Doctor(5, 3);

    public ArrayList<Doctor> getdoctors(){
        return doctors;
    }


}
