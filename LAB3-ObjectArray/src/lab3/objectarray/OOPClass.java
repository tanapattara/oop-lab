/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.objectarray;

import java.util.ArrayList;

/**
 *
 * @author Lab
 */
public class OOPClass {
    ArrayList<Member> members = new ArrayList<Member>();
    //init class
    public OOPClass(){
        this.loadMember();
    }
    //load member to class
    private void loadMember(){
        this.members.add(new Member("Ann",80.0));
        this.members.add(new Member("Bee",45.80));
        this.members.add(new Member("Coco",11.75));
    }
    public double getClassMean(){
        double totalscore = 0.0;
        for(Member m : members){
            totalscore += m.getScore();
        }        
        double result = totalscore/members.size();
        return result;
    }
}
