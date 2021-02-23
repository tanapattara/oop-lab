package th.ac.kku.cis.lab;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.color = Color.red;
        car.model = "Sport";
        car.Type = "A";
        car.price = 10000000;

        System.out.println("Car model " + car.model + " type  " + car.Type);


        Student student = new Student();
        student.name = "Mickey Mouse";
        student.sid = "001";
        student.major = "Walt Disney Studios";

        Student student2 = new Student();
        student2.name = "Bug Bunny";
        student2.sid = "002";
        student2.major = "Warner Bros. Entertainment";

	    System.out.println("Hello my name is " + student.name + " from " + student.major);
        System.out.println(String.format("Hello my name is %s from %s",student2.name, student2.major));
    }
}
