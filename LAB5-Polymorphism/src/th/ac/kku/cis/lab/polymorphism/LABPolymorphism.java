/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.kku.cis.lab.polymorphism;

import java.util.ArrayList;

/**
 *
 * @author Tanapattara Wongkhamchan <tanapattara@kku.ac.th>
 */
public class LABPolymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student mickey = new Student("Mickey","","");
        Staff donald = new Staff("Donald");
        Person goofy = new Student("Goofy","","");

        mickey.printInformation();
        donald.printInformation();
        goofy.printInformation();

        ArrayList<Person> students = new ArrayList<>();
        students.add(mickey);
        students.add(donald);
        students.add(goofy);

        for (Person student:students) {
            System.out.println(student.name);
        }

        CSVReader csvReader = new CSVReader("C:\\CISStudentData.csv");
        ArrayList<Student> studentsList = csvReader.getData();

        for (Student s: studentsList){
            s.printInformation();
        }
    }
    
}
