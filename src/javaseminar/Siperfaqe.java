/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaseminar;
/**
 *
 * @author admin
 */
public class Siperfaqe {
    public static void main(String [] args){
        String arg= new String("234A");
        
        try{
            int X = Integer.parseInt(arg);
            if(X<0)
                throw new IllegalArgumentException(" vlera eshtre me e vohel se 0");
             System.out.print(X*X*3.14);
            
        }
        catch(IllegalArgumentException e){}
        
    }
    
}
