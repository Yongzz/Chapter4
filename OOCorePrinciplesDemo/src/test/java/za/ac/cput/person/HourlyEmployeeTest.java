package za.ac.cput.person;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.person.config.AppConfig;

/**
 * Created by student on 2015/02/26.
 */
public class HourlyEmployeeTest extends TestCase{

    private HourlyEmployee hEmp;
    private ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
        ctx =  new AnnotationConfigApplicationContext(AppConfig.class);
        hEmp = (HourlyEmployee)ctx.getBean("hEmpl");
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testPay() throws Exception {
        hEmp.setHoursWorked(8);
        hEmp.setPayRate(30);
        assertEquals(240.0,hEmp.pay());

    }
}
