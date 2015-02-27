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
public class SalariedEmployeeTest extends TestCase{
    private SalariedEmployee salEmp;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        salEmp = (SalariedEmployee)ctx.getBean("sEmpl");
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testPay() throws Exception {
        salEmp.setSalary(15000);
        assertEquals(15000.0,salEmp.getSalary());

    }
}
