package za.ac.cput.customer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.customer.ObeySRP.ChangeEmail;
import za.ac.cput.customer.ObeySRP.ChangeEmailInter;
import za.ac.cput.customer.ObeySRP.O_CustomerImpl;
import za.ac.cput.customer.ObeySRP.O_CustomerInter;
import za.ac.cput.customer.ViolateSRP.Impl.Customer;
import za.ac.cput.customer.ViolateSRP.CustomerInter;

/**
 * Created by student on 2015/02/27.
 */
@Configuration
public class AppConfig {

    @Bean(name = "cust")
    public CustomerInter getCustomer()
    {
        return new Customer();
    }

    @Bean(name = "custo")
    public O_CustomerInter getO_Customer()
    {
        return new O_CustomerImpl();
    }

    @Bean(name = "em")
    public ChangeEmailInter getChangeEmail()
    {
        return new ChangeEmail();
    }


}
