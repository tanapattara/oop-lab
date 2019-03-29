/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_studentapp;

import Student.*;
import Student.Control.StudentClass;

/**
 *
 * @author Lab
 */
public class LAB4_StudentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentClass s = new StudentClass();
        s.displaydata();
        
        StudentsFrame ss = new StudentsFrame();
        //ss.setVisible(true);
    }
    
}
