package Models;

import java.util.ArrayList;

public class Patient extends Person implements IPerson<Patient>
{

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    private ArrayList<Appointment> appointments = new ArrayList();
    @Override
    public void add(Patient patient) {

    }

    @Override
    public void remove(Patient patient) {

    }
}
