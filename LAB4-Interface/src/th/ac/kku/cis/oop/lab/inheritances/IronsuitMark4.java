package th.ac.kku.cis.oop.lab.inheritances;


public class IronsuitMark4 extends Ironsuit{
    public IronsuitMark4(){
        this.model = "Mark4";
    }

    @Override
    public void takeoff() {
        System.out.print(this.model + " ");
        super.takeoff();
    }
}
