package th.ac.kku.cis.lab.polymorphism;

public class Person {
    protected String name;
    protected PersonType type;
    public Person(String name, PersonType type){
        this.name = name;
        this.type = type;
    }

    public void printInformation(){
        System.out.println("Person information, " + this.name + ":" + this.type.toString());
    }
}
