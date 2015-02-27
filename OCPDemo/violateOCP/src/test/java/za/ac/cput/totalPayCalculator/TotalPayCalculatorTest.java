package za.ac.cput.totalPayCalculator;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.totalPayCalculator.config.AppConfig;

/**
 * Created by student on 2015/02/27.
 */
public class TotalPayCalculatorTest  extends TestCase {
    private Employee hEmp[] = new Employee[2];
    private ApplicationContext ctx;
    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        hEmp[0] = (HourlyEmployee)ctx.getBean("hEmp");
        hEmp[1] = (SalariedEmployee)ctx.getBean("sEmp");
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testName() throws Exception {

        TotalPayCalcutor tot = new TotalPayCalcutor();
        ((HourlyEmployee) hEmp[0]).setEmployeeDetails("Amanda", "Ndawana", "2/05/2006", "Marketing Director", 12, 20.00);
        ((SalariedEmployee)hEmp[1]).setEmployeeDetails("Xokayo","Munde","05/08/2003","HR",15000);

        assertEquals(15240., tot.calcTotalPay(hEmp));



    }
}
