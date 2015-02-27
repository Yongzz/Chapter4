package za.ac.cput.totalPayCalculator;

/**
 * Created by student on 2015/02/27.
 */
public class SalariedEmployee extends Employee {

    private double salary;

    public void setEmployeeDetails(String nm, String sn, String hd, String jt, double salary)
    {
        setName(nm);setSurname(sn);setHireDate(hd);setJob_tittle(jt);
        this.salary = salary;
    }
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
