/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiceGame;
import java.awt.*;
import javax.swing.*;
import players.Player1;
/**
 *
 * @author admin
 */
public class MainFrame extends javax.swing.JFrame {

      public void Name(String []name)
    {
        players=new Player[name.length];
       
        numplayers=name.length;
       
        for(int i=0;i<numplayers;i++)
            players[i]=new Player(name[i]);
        //  players = new Player[numplayers];
      // players[0] = new Player(" noBody ");
      
     //  data = players[turn].datasheet();
     values=new int[5];
       for(int i=0;i<numplayers;i++)
       {for(int j=0;j<13;j++)
      choise[i][j] = false;
       data=players[turn].datasheet();
     
       for(int j=0;j<4;j++)
           if(j<players.length)
       this.jTable1.getColumnModel().getColumn(j).setHeaderValue(players[j].getName());
           else this.jTable1.getColumnModel().getColumn(j).setHeaderValue("    -     ");
       
       
       }
    }
    public MainFrame() {
       
        initComponents();
          turn = 0;
        Dices = new ImageIcon[7];
        Dices[0] = new ImageIcon(getClass().getResource("Dice1.gif"));
        Dices[1] = new ImageIcon(getClass().getResource("Dice2.gif"));
        Dices[2] = new ImageIcon(getClass().getResource("Dice3.gif"));
        Dices[3] = new ImageIcon(getClass().getResource("Dice4.gif"));
        Dices[4] = new ImageIcon(getClass().getResource("Dice5.gif"));
        Dices[5] = new ImageIcon(getClass().getResource("Dice6.gif"));
        Dices[6] = new ImageIcon(getClass().getResource("image.png"));
        this.categories = new JButton[15];
      
        categories[0]=jButton1;
        categories[1]=jButton2;
        categories[2]=jButton3;
        categories[3]=jButton4;
        categories[4]=jButton5;
        categories[5]=jButton6;
        categories[6]=jButton7;
        categories[7]=jButton8;
        categories[8]=jButton9;
        categories[9]=jButton10;
        categories[10]=jButton11;
        categories[11]=jButton12;
        categories[12]=jButton13;
        for(int i=0;i<13;i++)
         categories[i].setEnabled(false);
        firstroll=false;
       
        
        
         dices = new Dice[5];
        for(int i=0;i<5;i++)
            dices[i]= new Dice();
        this.rollbutton = new JLabel[5];
        rollbutton[0]=jDie1;
         rollbutton[1]=jDie2;
          rollbutton[2]=jDie3;
           rollbutton[3]=jDie4;
            rollbutton[4]=jDie5;
       numrolls=0;
       ////per ? 
       for(int j = 0;j<5;j++)
                rollbutton[j].setIcon(this.Dices[6]);
       }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        pp = new javax.swing.JPanel();
        jDie1 = new javax.swing.JLabel();
        jDie2 = new javax.swing.JLabel();
        jDie3 = new javax.swing.JLabel();
        jDie4 = new javax.swing.JLabel();
        jDie5 = new javax.swing.JLabel();
        jNextButton = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonRoll = new javax.swing.JButton();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 0));
        setForeground(java.awt.Color.black);

        pp.setBackground(new java.awt.Color(0, 102, 0));

        jDie1.setForeground(new java.awt.Color(240, 240, 240));
        jDie1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDie1MouseClicked(evt);
            }
        });

        jDie2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDie2MouseClicked(evt);
            }
        });

        jDie3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDie3MouseClicked(evt);
            }
        });

        jDie4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDie4MouseClicked(evt);
            }
        });

        jDie5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDie5MouseClicked(evt);
            }
        });

        jNextButton.setLabel("Next");
        jNextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNextButtonActionPerformed(evt);
            }
        });

        jButton12.setLabel("Same value");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 1, true));
        jTable1.setForeground(new java.awt.Color(51, 51, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Lojtari 1", "Lojtari 2", "Lojtari 3", "Lojtari 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(51, 51, 255));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Lojtari 1");
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Lojtari 2");
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Lojtari 3");
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Lojtari 4");
        }

        jButton13.setLabel("Any case");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel1.setText("                Piket E Siperme");
        jLabel1.setToolTipText("");

        jButton10.setLabel("Four consecutive");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel2.setText("                      Bonus");

        jButton11.setLabel("Five consecutive");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel3.setText("                    Down points");

        jLabel4.setText("                     Total");

        jButton1.setLabel("Ones");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setLabel("Twosome");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setLabel("Threesome");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setLabel("Foursome");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setLabel("Fivesome");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setLabel("Sixsome");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setLabel("Three in one value");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setLabel("Four in one value");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setLabel("Three and two");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButtonRoll.setLabel("roll");
        jButtonRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRollActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ppLayout = new javax.swing.GroupLayout(pp);
        pp.setLayout(ppLayout);
        ppLayout.setHorizontalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jNextButton, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(jButtonRoll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDie3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDie4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDie5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDie1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDie2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        ppLayout.setVerticalGroup(
            ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ppLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ppLayout.createSequentialGroup()
                        .addGroup(ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ppLayout.createSequentialGroup()
                                .addComponent(jDie1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDie2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDie3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jDie4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDie5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ppLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ppLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jNextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ppLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDie1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDie1MouseClicked
       if(firstroll)
        jDie1.setEnabled(!jDie1.isEnabled());
        // TODO add your handling code here:
    }//GEN-LAST:event_jDie1MouseClicked

    private void jDie2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDie2MouseClicked
      if(firstroll)
          jDie2.setEnabled(!jDie2.isEnabled());        // TODO add your handling code here:
    }//GEN-LAST:event_jDie2MouseClicked

    private void jDie3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDie3MouseClicked
         if(firstroll)
        jDie3.setEnabled(!jDie3.isEnabled());        // TODO add your handling code here:
    }//GEN-LAST:event_jDie3MouseClicked

    private void jDie4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDie4MouseClicked
         if(firstroll)
        jDie4.setEnabled(!jDie4.isEnabled());        // TODO add your handling code here:
    }//GEN-LAST:event_jDie4MouseClicked

    private void jDie5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDie5MouseClicked
         if(firstroll)
        jDie5.setEnabled(!jDie5.isEnabled());       // TODO add your handling code here:
    }//GEN-LAST:event_jDie5MouseClicked

    private void jNextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNextButtonActionPerformed
          
    }//GEN-LAST:event_jNextButtonActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        
     
        for(int i=0;i<5;i++)
        values[i]=dices[i].gatValue();
        jTable1.setValueAt(Calcer.pAllSame(values), 13, turn);
        data.setSameValue(Calcer.pAllSame(values));
        // TODO add your handling code here:
        pInitialise(11);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

       
        for(int i=0;i<5;i++)
        values[i]=dices[i].gatValue();
        jTable1.setValueAt(Calcer.pEvryCase(values), 14, turn);
        data.setEvryCase(Calcer.pEvryCase(values));
        // TODO add your handling code here:
        pInitialise(12);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

      
        for(int i=0;i<5;i++)
        values[i]=dices[i].gatValue();
        jTable1.setValueAt(Calcer.pFourQ(values), 11, turn);
        // TODO add your handling code here:
          data.setFourQ(Calcer.pFourQ(values));
        pInitialise(9);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        
        for(int i=0;i<5;i++)
        values[i]=dices[i].gatValue();
        jTable1.setValueAt(Calcer.pFiveQ(values), 12, turn);
        players[turn].datasheet().setFiveQ(Calcer.pFiveQ(values));
        // TODO add your handling code here:
        pInitialise(10);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // taking the values

       
        for(int i=0;i<5;i++)
        values[i]=dices[i].gatValue();
        jTable1.setValueAt(Calcer.pOne(values), 0, turn);
      data.settOne(Calcer.pOne(values));// TODO add your handling code here:
    
        pInitialise(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

      
        for(int i=0;i<5;i++)
        values[i]=dices[i].gatValue();
        jTable1.setValueAt(Calcer.pTwo(values), 1, turn);
     data.setTwo(Calcer.pTwo(values));// TODO add your handling code here:
        pInitialise(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        for(int i=0;i<5;i++)
        values[i]=dices[i].gatValue();
        jTable1.setValueAt(Calcer.pThree(values), 2, turn);
         data.setThree(Calcer.pThree(values));
        // TODO add your handling code here:
        pInitialise(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        for(int i=0;i<5;i++)
        values[i]=dices[i].gatValue();
        jTable1.setValueAt(Calcer.pFour(values),3, turn);
         data.setFour(Calcer.pFour(values));
        // TODO add your handling code here:
        pInitialise(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        for(int i=0;i<5;i++)
        values[i]=dices[i].gatValue();
        jTable1.setValueAt(Calcer.pFive(values), 4, turn);
         data.setFive(Calcer.pFive(values));
        // TODO add your handling code here:
        pInitialise(4);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       
        for(int i=0;i<5;i++)
        values[i]=dices[i].gatValue();
        jTable1.setValueAt(Calcer.pSix(values), 5, turn);
         data.setSix(Calcer.pSix(values));

        // TODO add your handling code here:
        pInitialise(5);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        for(int i=0;i<5;i++)
        values[i]=dices[i].gatValue();
        jTable1.setValueAt(Calcer.pThreeOfOne(values), 8, turn);
         data.setThreeOfOne(Calcer.pThreeOfOne(values));

        // TODO add your handling code here:
        pInitialise(6);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       
        for(int i=0;i<5;i++)
        values[i]=dices[i].gatValue();
        jTable1.setValueAt(Calcer.pFourOfOne(values), 9, turn);
             data.setFourOfOne(Calcer.pFourOfOne(values));
        // TODO add your handling code here
        pInitialise(7);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        
        for(int i=0;i<5;i++)
        values[i]=dices[i].gatValue();
        jTable1.setValueAt(Calcer.pFullHouse(values), 10, turn);
        data.setFullHouse(Calcer.pFullHouse(values));
        // TODO add your handling code here:
        pInitialise(8);
    }//GEN-LAST:event_jButton9ActionPerformed
private void updateTable(){
    int uperpoints=0;
    
}
    
    
    private void jButtonRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRollActionPerformed
       
        this.firstroll=true;
        for(int i = 0;i<5;i++){ 
            if(rollbutton[i].isEnabled()){
                dices[i].roll();
                rollbutton[i].setIcon(this.Dices[dices[i].gatValue()-1]);
            }

        }
         for(int i=0;i<13;i++)
        { if(choise[turn][i]==true)   
         categories[i].setEnabled(false);     
     else
            categories[i].setEnabled(true); } 
        numrolls++;
        if(numrolls==3){
            numrolls=0;
            jButtonRoll.setEnabled(false);}

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRollActionPerformed
       void initialiseImg(){};
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    private void pInitialise(int c){
       choise[turn][c]=true;
       this.jButtonRoll.setEnabled(true);
            for(int i=0;i<5;i++){
                rollbutton[i].setEnabled(true);
                // vendos ?
            
                rollbutton[i].setIcon(this.Dices[6]);
                
            }
            firstroll = false;
            numrolls=0;
            jTable1.setValueAt(data.getUperPoints(), 6, turn);
            jTable1.setValueAt(data.getBonus(), 7, turn);
            jTable1.setValueAt(data.getDownPoints(), 15, turn);
            jTable1.setValueAt(data.getDownPoints()+data.getUperPoints(), 16, turn);
            jNextButton.setEnabled(true);
          
            turn = (turn+1)%numplayers;
            
            data= players[turn].datasheet();
         
             // zgjidh kategorit qe i lejohen
     for(int i=0;i<13;i++)
         categories[i].setEnabled(false);
       
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonRoll;
    private javax.swing.JLabel jDie1;
    private javax.swing.JLabel jDie2;
    private javax.swing.JLabel jDie3;
    private javax.swing.JLabel jDie4;
    private javax.swing.JLabel jDie5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jNextButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JPanel pp;
    // End of variables declaration//GEN-END:variables

    private Icon [] Dices;
    JLabel [] rollbutton ;
    Dice[] dices;
    int numrolls;
    int []values;
    Player[] players;
    DataSheet data;
    int turn;
    int numplayers;
    boolean gameover;
    private JFrame firstframe;
    private String [] player_name; 
    private JTextField pname;
    private int player_registered;
    private JButton register;
    private JButton start_game;
    private JButton[] categories;
    boolean choise[][]=new boolean[5][14];
    boolean firstroll;
}
