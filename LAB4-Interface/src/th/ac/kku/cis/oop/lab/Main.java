/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.kku.cis.oop.lab;

import th.ac.kku.cis.oop.lab.abstracts.IronsuitMark3;
import th.ac.kku.cis.oop.lab.inheritances.IronsuitMark4;
import th.ac.kku.cis.oop.lab.interfaces.IronsuitMark2;

/**
 *
 * @author Tanapattara Wongkhamchan <tanapattara@kku.ac.th>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        IronsuitMark2 irm2 = new IronsuitMark2();
        irm2.takeoff();

        IronsuitMark3 irm3 = new IronsuitMark3();
        irm3.takeoff();


        IronsuitMark4 irm4 = new IronsuitMark4();
        irm4.takeoff();
    }
    
}
