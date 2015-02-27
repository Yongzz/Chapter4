package za.ac.cput.employee;

/**
 * Created by student on 2015/02/26.
 */
public abstract class Employee {

    private String f_name;
    private String l_name;
    private int age;

    abstract double pay();
    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
