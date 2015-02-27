package za.ac.cput.person;

/**
 * Created by student on 2015/02/26.
 */
public class SalariedEmployee extends Employee{

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    double pay() {
        return salary;
    }
}
