package th.ac.kku.cis.oop.lab.interfaces;

public class IronsuitMark2 implements Ironsuit{
    private String model = "Mark2";
    public IronsuitMark2(){
        //this.model = "Mark2";
        //model variable not inherit from Ironsuit interface
    }
    @Override
    public void takeoff() {
        System.out.println(model + " Takeoff...");
    }

    @Override
    public void landing() {

    }
}
