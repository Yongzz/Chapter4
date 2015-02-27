package za.ac.cput.totalPayCalculator.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import za.ac.cput.totalPayCalculator.Employee;
import za.ac.cput.totalPayCalculator.HourlyEmployee;
import za.ac.cput.totalPayCalculator.SalariedEmployee;

/**
 * Created by student on 2015/02/27.
 */
@Configurable
public class AppConfig {

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
