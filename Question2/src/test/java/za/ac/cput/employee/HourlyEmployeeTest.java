package za.ac.cput.employee;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.employee.Config.AppConfig;

/**
 * Created by student on 2015/02/26.
 */
public class HourlyEmployeeTest extends TestCase{
    private HourlyEmployee hEmployee;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        hEmployee = (HourlyEmployee)ctx.getBean("emp");
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testPay() throws Exception {
        hEmployee.setEmployeeInfor("Yongama","Ngwenduna",22);
        hEmployee.setHourWorked(3);
        hEmployee.setPayRate(10);
        assertEquals(30.0, hEmployee.pay());
    }
}

