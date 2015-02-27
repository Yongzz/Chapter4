package za.ac.cput.totalPayCalculator;

/**
 * Created by student on 2015/02/27.
 */
public class HourlyEmployee extends Employee{

    private int hoursWorked;
    private double payRate;

    public void setEmployeeDetails(String nm, String sn, String hd, String jt, int hoursWorked, double payRate)
    {
        setName(nm);setSurname(sn);setHireDate(hd);setJob_tittle(jt);
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
