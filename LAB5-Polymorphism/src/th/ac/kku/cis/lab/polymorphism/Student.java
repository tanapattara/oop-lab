package th.ac.kku.cis.lab.polymorphism;

public class Student extends Person{
    protected String studentid;
    protected String studentGroupCode;
    public Student(String name,String studentid, String studentGroupCode) {
        super(name, PersonType.Student);
        this.studentid = studentid;
        this.studentGroupCode = studentGroupCode;
    }
}
