package za.ac.cput.customer.ObeySRP;

/**
 * Created by student on 2015/02/27.
 */
public class ChangeEmail implements ChangeEmailInter {
    private String c_Fname;
    private String email;
    private String c_password;


    @Override
    public Boolean changeEmail(O_CustomerInter c,String fn,String pswd, String eml)
    {

        if (fn.equals(c.getC_Fname()) && pswd.equals(c.getC_password()))
        {
            email = eml;
            return true;
        }
        else
        {
            return false;
        }
    }
}
