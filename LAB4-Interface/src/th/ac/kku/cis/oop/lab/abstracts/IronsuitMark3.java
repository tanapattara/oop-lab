package th.ac.kku.cis.oop.lab.abstracts;

import th.ac.kku.cis.oop.lab.abstracts.Ironsuit;

public class IronsuitMark3 extends Ironsuit {
    public IronsuitMark3(){
        this.model = "Mark3";
    }

    @Override
    public void takeoff() {
        System.out.print(this.model + " ");
        super.takeoff();
    }
}
