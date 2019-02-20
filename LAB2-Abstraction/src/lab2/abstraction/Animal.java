/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.abstraction;

/**
 *
 * @author Tanapattara Wongkhamchan <tanapattara@kku.ac.th>
 */
public abstract class Animal {
    protected String species, Family, Skin;
    public Animal(){}
    public abstract void move();
    public void Sound(){};        
}
