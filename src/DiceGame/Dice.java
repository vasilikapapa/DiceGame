/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiceGame;

/**
 *
 * @author admin
 */
public class Dice {
    private int value;
    public Dice(){
        value= -1;
    }
    public int gatValue(){
        return value;
    }
    public void roll(){
        value = 1 + (int)Math.floor(Math.random()*6);
    }
    
    
    
}
