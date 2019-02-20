/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.polymorphism;

/**
 *
 * @author Tanapattara Wongkhamchan <tanapattara@kku.ac.th>
 */
public class LAB2Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal bird = new Bird();
        
        animal.Move();
        dog.Move();
        bird.Move();
        
        Dog donky = new Dog();
        Animal lucky = new Dog();
        
        donky.Move();
        lucky.Move();
    }
    
}
