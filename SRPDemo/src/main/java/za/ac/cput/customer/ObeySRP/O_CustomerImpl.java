package za.ac.cput.customer.ObeySRP;

/**
 * Created by student on 2015/02/27.
 */
public class O_CustomerImpl implements O_CustomerInter{

    private String c_Fname;
    private String c_Lname;
    private String email;
    private String c_password;

    @Override
    public String getC_Fname() {
        return c_Fname;
    }

    @Override
    public void setC_Fname(String c_Fname) {
        this.c_Fname = c_Fname;
    }

    @Override
    public String getC_Lname() {
        return c_Lname;
    }

    @Override
    public void setC_Lname(String c_Lname) {
        this.c_Lname = c_Lname;
    }

    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getC_password() {
        return c_password;
    }
    @Override
    public void setC_password(String c_password) {
        this.c_password = c_password;
    }
}
