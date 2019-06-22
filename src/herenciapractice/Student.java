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
public class Student extends Person{
    private String file;
    private int note1;
    private int note2;
    private int note3;
    
    public Student() {
        super();
    }

    public Student(int id, String name, String surname, String file) {
        super(id,name,surname);
        this.file = file;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void setNote1(int note1) {
        this.note1 = note1;
    }

    public void setNote2(int note2) {
        this.note2 = note2;
    }

    public void setNote3(int note3) {
        this.note3 = note3;
    }
    
    @Override
    public String toString() {
        return super.toString() +"\n"
                + "file= "+file + "\n"
                + "promedio= "+calculate();
    }

    @Override
    public float calculate() {
        return (note1 + note2 + note3) / 3;
    }
}
