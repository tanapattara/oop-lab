/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student.Control;

import Student.Model.Student;
import Student.StudentFrame;
import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class StudentClass {
    ArrayList<Student> students = new ArrayList<Student>();  
    //Start first
    public StudentClass(){
        loaddata();               
    }    
    private void loaddata() {   
        Student s = new Student();
        s.setName("Naruto");
        s.setId("001");
        s.setYear(61);
        s.setSchool("shinobi");
        s.setProvince("Ninja");
        
        students.add(s);
    }
    public void displaydata() {
        StudentFrame sf = new StudentFrame();
        sf.showStudent(students.get(0));
        sf.setVisible(true);
    }
}
