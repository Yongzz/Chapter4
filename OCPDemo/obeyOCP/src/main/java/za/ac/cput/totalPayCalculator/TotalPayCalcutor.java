package za.ac.cput.totalPayCalculator;

/**
 * Created by student on 2015/02/27.
 */
public class TotalPayCalcutor {

    private double totalPay = 0;



    public double calcTotalPay(Employee emp[])
    {
        for(int i =0; i < emp.length;i++)
        {
            totalPay +=emp[i].pay();
        }
        return totalPay;
    }

}
