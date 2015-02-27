package za.ac.cput.employee;

/**
 * Created by student on 2015/02/26.
 */
public class HourlyEmployee extends Employee{
    private int hoursWorked;
    private double payRate;
    private Employee emp;


    public void setEmployeeInfor(String fn, String ln, int a)
    {
        emp = new HourlyEmployee();
        emp.setF_name(fn);
        emp.setL_name(ln);
        emp.setAge(a);
    }
    public int getHourWorked() {
        return hoursWorked;
    }

    public void setHourWorked(int hourWorked) {
        this.hoursWorked = hourWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public String getL_name()
    {
        return emp.getL_name();
    }

    public String getF_name()
    {
        return emp.getF_name();
    }
    public int getAge()
    {
        return emp.getAge();
    }
    @Override
    public double pay(){
       return hoursWorked * payRate;
    }
}
