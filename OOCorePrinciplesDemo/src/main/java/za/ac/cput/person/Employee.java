package za.ac.cput.person;

/**
 * Created by student on 2015/02/26.
 */
public abstract class Employee {
    private int empoyee_id;
    private String tittle;

    abstract double pay();

    public void setEmpoyee_id(int id)
    {
        empoyee_id = id;
    }

    public int getEmpoyee_id()
    {
        return empoyee_id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String t) {
        tittle = t;
    }
}
