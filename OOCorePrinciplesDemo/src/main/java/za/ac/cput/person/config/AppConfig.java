package za.ac.cput.person.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import za.ac.cput.person.Employee;
import za.ac.cput.person.HourlyEmployee;
import za.ac.cput.person.SalariedEmployee;

/**
 * Created by student on 2015/02/25.
 */
@Configuration
public class AppConfig {

    @Bean(name = "hEmpl")
    public Employee getHourlyEmployee()
    {
        return new HourlyEmployee();
    }

    @Bean(name = "sEmpl")
    public Employee getSalariedEmployee()
    {
        return new SalariedEmployee();
    }
}
