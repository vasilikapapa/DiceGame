/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dice;
import java.awt.FlowLayout; // specifies how components are arranged
 import javax.swing.JFrame; // provides basic window features
 import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
 import javax.swing.Icon; // interface used to manipulate images
 import javax.swing.ImageIcon; 
/**
 *
 * @author admin
 */
public class Test extends JFrame{
    private JLabel label1,label2,label3;
    public Test(){
        super(" Testing Label ");
        setLayout(new FlowLayout());
        label1= new JLabel(" label with txt");
        label1.setToolTipText(" this is a sjiajf");
        add(label1);
        Icon bug= new ImageIcon(getClass().getResource("dice1.png"));
        label2 = new JLabel(" Label2 construction ",bug,SwingConstants.LEFT);
        label2.setToolTipText(" this is label 2");
        add(label2);
        label3 = new JLabel();
        label3.setText(" label seted by t");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("  this is label 3");
        add(label3);
        
    }
    public static void main(String[] args){
        Test t = new Test();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setSize(300,300);
        t.setVisible(true);
    }
}
