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
public class Pika {
   protected double x;
    protected double y;
    public Pika(double a,double b){
        x=a;
        y=b;
    }
    public Pika(Pika t){
        x= t.x;
        y=t.y;
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
    
    public double ODist(){
        return Math.sqrt(Math.pow(x, 2)+Math.pow(y,2));
    }
    public void zhvendos(double a,double b){
        x=x+a;
        y=y+b;
    }
    
}   
