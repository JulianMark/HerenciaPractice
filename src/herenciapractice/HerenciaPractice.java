/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciapractice;

import java.util.Scanner;


/**
 *
 * @author Julian
 */
public class HerenciaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Person person;
        
        System.out.println("Ingrese: ");
        System.out.println("1 - para agregar un Profesor");
        System.out.println("2 - para agregar un Estudiante");
        int typePerson = sc.nextInt();
        
        if (typePerson == 1){
            person = new Profesor();
        }else {
            person = new Student();
        }
        
        person.setId(1);//id de tipo generico para test
        System.out.print("Ingrese el nombre: ");
        String name = sc.next();
        person.setName(name);
        System.out.print("Ingrese el apellido: ");
        String surname = sc.next();
        person.setSurname(surname);
        
        if (person instanceof Profesor){
            System.out.print("Ingrese número de matrícula: ");
            String enrollment = sc.next();
            ((Profesor) person).setEnrollment(enrollment);
            System.out.print("Ingrese cantidad de horas trabajadas: ");
            int amountsHours = sc.nextInt();
            ((Profesor) person).setAmountsHours(amountsHours);
            System.out.print("Ingrese cuanto cobra por hora: ");
            float salary = sc.nextFloat();
            ((Profesor) person).setSalary(salary);
        }else if (person instanceof Student){
            System.out.print("Ingrese legajo: ");
            String file = sc.next();
            ((Student) person).setFile(file);
            System.out.print("Ingrese nota 1: ");
            int note = sc.nextInt();
            ((Student) person).setNote1(note);
            System.out.print("Ingrese nota 2: ");
            note = sc.nextInt();
            ((Student) person).setNote2(note);
            System.out.print("Ingrese nota 3: ");
            note = sc.nextInt();
            ((Student) person).setNote3(note);
        }
        
        person.calculate();
        System.out.println(" "); //dejamos un reglon
        System.out.println(person.toString());
    }
    
}
