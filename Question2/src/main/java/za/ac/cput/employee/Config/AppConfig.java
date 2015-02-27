package za.ac.cput.employee.Config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.employee.Employee;
import za.ac.cput.employee.HourlyEmployee;

/**
 * Created by student on 2015/02/26.
 */
@Configuration
public class AppConfig {
    @Bean(name = "emp")
    public Employee getEmployee()
    {
        return new HourlyEmployee();
    }

}

