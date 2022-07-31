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
public class JavaSeminar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emer first= new Emer("Altin","Bexhet","Pacolli");
        System.out.print(first.getName());
        
        Pika p = new Pika(2,2);
        Rrethi r = new Rrethi(p,12);
        System.out.println();
        System.out.print(r.toString());
    }
    
}
