package za.ac.cput.totalPayCalculator;

/**
 * Created by student on 2015/02/27.
 */
public abstract class Employee {
    private String name;
    private String Surname;
    private String hireDate;
    private String job_tittle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getJob_tittle() {
        return job_tittle;
    }

    public void setJob_tittle(String job_tittle) {
        this.job_tittle = job_tittle;
    }

    abstract double pay();
}
