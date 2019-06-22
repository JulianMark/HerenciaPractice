/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciapractice;

/**
 *
 * @author Julian
 */
public class Profesor extends Person{
    private String enrollment;
    private int amountsHours;
    private float salary;

    public Profesor() {
        super();
    }

    public Profesor(int id, String name, String surname, String enrollment) {
        super(id,name,surname);
        this.enrollment = enrollment;
    }

    public String getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(String enrollment) {
        this.enrollment = enrollment;
    }

    public void setAmountsHours(int amountsHours) {
        this.amountsHours = amountsHours;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() 
                + ", enrollment= " + enrollment +"\n"
                + "sueldo= "+ calculate();
    }

    @Override
    public float calculate() {
        return (amountsHours * salary);
    }
}
