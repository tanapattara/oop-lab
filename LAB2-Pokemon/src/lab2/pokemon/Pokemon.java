/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.pokemon;

/**
 *
 * @author Lab
 */
public class Pokemon {
    protected String name;
    protected int hp;
    protected int atk;
    protected int def;
    protected String img;
    public int Atk(){return this.atk;}
    public int Def(){return this.def;}
    public void TakeDamage(int damage){
        this.hp = this.hp - damage;
    }
    public int ShowHP(){ return this.hp;}
}
