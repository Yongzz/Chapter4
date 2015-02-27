package za.ac.cput.totalPayCalculator;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created by student on 2015/02/27.
 */
@Configurable
public class AppConfig1 {

    @Bean(name = "hEmp")
    public Employee getHourlyEmployee()
    {
        return new HourlyEmployee();
    }

    @Bean(name ="sEmp")
    public Employee getSalariedEmployee()
    {
        return new SalariedEmployee();
    }

}
