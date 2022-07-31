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
public class Rrethi extends Pika{
    double rreze;
    static int nrObjekt=0;
    
    public  Rrethi(Pika p,double r){
       
       super(p);
       rreze=r;
        nrObjekt++;
    }
    
    public void ndryshoRreze(double newR){
        rreze=newR;
    }
    public void zhvendosRrethin(int x,int y){
        super.zhvendos(x, y);
    }
    public double siperfaqe(){
        return Math.PI*rreze*rreze;
    }
    @Override
    public String toString(){
        return "[ rreze : "+rreze+" ;"+super.toString();
    }
    public static double nrobj(){
  return nrObjekt;
    
}
}