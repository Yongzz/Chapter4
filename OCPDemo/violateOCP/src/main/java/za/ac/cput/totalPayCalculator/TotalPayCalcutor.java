package za.ac.cput.totalPayCalculator;

/**
 * Created by student on 2015/02/27.
 */
public class TotalPayCalcutor {
    private double totalPay;



    public double calcTotalPay(Employee emp[])
    {
        for(int i =0; i < emp.length;i++)
        {
            if(emp[i] instanceof HourlyEmployee)
            {

                totalPay += ((HourlyEmployee) emp[i]).getHoursWorked() * ((HourlyEmployee) emp[i]).getPayRate();
            }
            else
            {
                totalPay += ((SalariedEmployee) emp[i]).getSalary();
            }
        }
        return totalPay;
    }

}
