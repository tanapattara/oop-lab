/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.objectarray;

/**
 *
 * @author Lab
 */
public class Member {
    private String name;
    private double score;
    public Member(String name,double score) {
        this.name = name;
        this.score = score;
    }
    public String getName(){ return this.name;}
    public double getScore(){ return this.score;}
}
