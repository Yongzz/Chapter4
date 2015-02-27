package za.ac.cput.person;

/**
 * Created by student on 2015/02/26.
 */
public class HourlyEmployee extends Employee {

    private double hoursWorked;
    private double payRate;

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    double pay() {
        return hoursWorked * payRate;
    }
}
