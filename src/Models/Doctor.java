package Models;

public class Doctor extends Person implements IPerson<Doctor>
  {
   private int daysAvailable;
   private int deptId;

    public int getDaysAvailable() {
        return daysAvailable;
    }

    public void setDays(int daysAvailable) {
        this.daysAvailable = daysAvailable;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Override
    public void add(Doctor doctor) {

    }

    @Override
    public void remove(Doctor doctor) {

    }

      public Doctor(int daysAvailable, int deptId) {
          this.daysAvailable = daysAvailable;
          this.deptId = deptId;
      }
  }
