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
public class Emer {
    String emer;
    String mbiemer;
    String e_m_babait;
     public boolean krahaso(Emer k){
         return ((k.emer.equals(this.emer))&&(k.mbiemer.equals(this.mbiemer))&&(k.e_m_babait.equals(this.e_m_babait)));
     }
    public Emer(String e,String m,String mb){
        emer=new String(e);
        mbiemer= new String(m);
        e_m_babait = new String(mb);
    }
    
        

public String getName(){
return "[ "+emer+" , "+mbiemer+" , "+e_m_babait+" ]";
}

}