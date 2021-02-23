package th.ac.kku.cis.oop.lab.abstracts;

import java.util.SplittableRandom;

public abstract class Ironsuit {
    public String model;
    public void takeoff(){
        System.out.println("Takeoff...");
    };

    public void landing() {
        System.out.println("Super hero landing...");
    }
}
