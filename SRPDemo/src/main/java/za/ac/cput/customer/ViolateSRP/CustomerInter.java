package za.ac.cput.customer.ViolateSRP;

/**
 * Created by student on 2015/02/27.
 */
public interface  CustomerInter {
    public String getC_Fname();
    public void setC_Fname(String c_Fname);

    public String getC_Lname();
    public void setC_Lname(String c_Lname);

    public String getEmail();
    public void setEmail(String email);

    public String getC_password();

    public void setC_password(String c_password);

    public void changeEmail(String fn,String pswd, String eml);
}
