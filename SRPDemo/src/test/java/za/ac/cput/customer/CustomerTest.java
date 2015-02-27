package za.ac.cput.customer;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.customer.ViolateSRP.Impl.Customer;
import za.ac.cput.customer.ViolateSRP.CustomerInter;
import za.ac.cput.customer.config.AppConfig;

/**
 * Created by student on 2015/02/27.
 */
public class CustomerTest extends TestCase{
    private CustomerInter c;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        c = (Customer)ctx.getBean("cust");

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testGetC_password() throws Exception {
        c.setC_password("Xola4");
        assertEquals("Xola4",c.getC_password());
    }
}
