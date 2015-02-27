package za.ac.cput.customer;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.customer.ObeySRP.ChangeEmail;
import za.ac.cput.customer.ObeySRP.ChangeEmailInter;
import za.ac.cput.customer.ObeySRP.O_CustomerImpl;
import za.ac.cput.customer.ObeySRP.O_CustomerInter;
import za.ac.cput.customer.config.AppConfig;

/**
 * Created by student on 2015/02/27.
 */
public class ChangeEmailTest extends TestCase{

    private ChangeEmailInter ce;
    private O_CustomerInter o_cust;
    private ApplicationContext ctx;


    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        o_cust = (O_CustomerImpl)ctx.getBean("custo");
        ce = (ChangeEmail)ctx.getBean("em");
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void testChangeEmail() throws Exception {
        o_cust.setC_Fname("Yongama");
        o_cust.setC_password("yongz12");
        o_cust.setEmail("yongz.ngwenduna@gmail.org");

        assertTrue(ce.changeEmail(o_cust,"Yongama","yongz12","yongz.ngwenduna@gmail.com"));
    }
}
