/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlechips;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author berto
 */
public class Gui_MainMenu extends JPanel {
    
    public int diffTemp = 2;
    public int diff = 2;
    private Dificuldade Dificuldade = new Normal();
    private Game_controler Jogo;
    public int bot, res, dec, mic = 0;
    
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel settings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration          
    
    
    GameStarter gameSt;
    
    public Gui_MainMenu(GameStarter gameSt) {
        
        this.gameSt = gameSt;
    }
    
    @Override
    public void setVisible(boolean a) {
        if (a==true) {
            
            //updateComponents();
            
            
        }
        
        super.setVisible(a);
    }
    
    
    
    
    public void InitComponents() {
        
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setBackground(new java.awt.Color(76, 175, 80));
         
        
        settings = new javax.swing.JPanel();
        
        
        
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        
        
        painelPrincipal.setBackground(new java.awt.Color(76, 175, 80));
        
        jPanel3.setBackground(new java.awt.Color(76, 175, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Settings_img.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Adobe Garamond Pro Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Difficulty.png"))); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Easy_Unselected.png"))); // NOI18N
        jButton4.setText("jButton1");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setMaximumSize(new java.awt.Dimension(219, 39));
        jButton4.setMinimumSize(new java.awt.Dimension(219, 39));
        jButton4.setPreferredSize(new java.awt.Dimension(219, 39));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        
      

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Medium_Unselected.png"))); // NOI18N
        jButton5.setText("jButton1");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setMaximumSize(new java.awt.Dimension(219, 39));
        jButton5.setMinimumSize(new java.awt.Dimension(219, 39));
        jButton5.setPreferredSize(new java.awt.Dimension(219, 39));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Hard_Unselected.png"))); // NOI18N
        jButton6.setText("jButton1");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setMaximumSize(new java.awt.Dimension(219, 39));
        jButton6.setMinimumSize(new java.awt.Dimension(219, 39));
        jButton6.setPreferredSize(new java.awt.Dimension(219, 39));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        
        

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Button_Salvar.png"))); // NOI18N
        jButton7.setText("jButton1");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setMaximumSize(new java.awt.Dimension(219, 39));
        jButton7.setMinimumSize(new java.awt.Dimension(219, 39));
        jButton7.setPreferredSize(new java.awt.Dimension(219, 39));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Button_Cancel.png"))); // NOI18N
        jButton8.setText("jButton1");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setMaximumSize(new java.awt.Dimension(219, 39));
        jButton8.setMinimumSize(new java.awt.Dimension(219, 39));
        jButton8.setPreferredSize(new java.awt.Dimension(219, 39));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        
        

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 148, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        
       

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(settings);
        settings.setMaximumSize(new java.awt.Dimension(800, 600));
        settings.setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        

        jPanel2.setMaximumSize(new java.awt.Dimension(439, 480));
        jPanel2.setMinimumSize(new java.awt.Dimension(439, 480));
        jPanel2.setPreferredSize(new java.awt.Dimension(439, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/background-no-color.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(76, 175, 80));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/New_Game.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setMaximumSize(new java.awt.Dimension(219, 39));
        jButton1.setMinimumSize(new java.awt.Dimension(219, 39));
        jButton1.setPreferredSize(new java.awt.Dimension(219, 39));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Settings.png"))); // NOI18N
        jButton2.setText("jButton1");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setMaximumSize(new java.awt.Dimension(219, 39));
        jButton2.setMinimumSize(new java.awt.Dimension(219, 39));
        jButton2.setPreferredSize(new java.awt.Dimension(219, 39));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/help.png"))); // NOI18N
        jButton3.setText("jButton1");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setMaximumSize(new java.awt.Dimension(219, 39));
        jButton3.setMinimumSize(new java.awt.Dimension(219, 39));
        jButton3.setPreferredSize(new java.awt.Dimension(219, 39));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        
     
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        this.add(painelPrincipal);
        
    }
    
    
    
     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        //jButton3.setIcon((new ImageIcon("src/resources/Settings.PNG")));
        
        gameSt.SetSetup();
        gameSt.Alternar();
         System.out.println("New Game Started");
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        if (diff == 1)
        {
        jButton4.setIcon((new ImageIcon("src/resources/Easy_Selected.PNG")));
        jButton5.setIcon((new ImageIcon("src/resources/Medium_Unselected.PNG")));
        jButton6.setIcon((new ImageIcon("src/resources/Hard_Unselected.PNG")));
        }
        
        else if (diff == 2)
        {
        jButton4.setIcon((new ImageIcon("src/resources/Easy_Unselected.PNG")));
        jButton5.setIcon((new ImageIcon("src/resources/Medium_Selected.PNG")));
        jButton6.setIcon((new ImageIcon("src/resources/Hard_Unselected.PNG")));
        }
        
        else if (diff == 3)
        {
        jButton4.setIcon((new ImageIcon("src/resources/Easy_Unselected.PNG")));
        jButton5.setIcon((new ImageIcon("src/resources/Medium_Unselected.PNG")));
        jButton6.setIcon((new ImageIcon("src/resources/Hard_Selected.PNG"))); 
        }
        
        
        painelPrincipal.setVisible(false);
        this.add(settings);
        
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        jButton4.setIcon((new ImageIcon("src/resources/Easy_Selected.PNG")));
        jButton5.setIcon((new ImageIcon("src/resources/Medium_Unselected.PNG")));
        jButton6.setIcon((new ImageIcon("src/resources/Hard_Unselected.PNG")));
        
        diffTemp = 1;
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        jButton4.setIcon((new ImageIcon("src/resources/Easy_Unselected.PNG")));
        jButton5.setIcon((new ImageIcon("src/resources/Medium_Selected.PNG")));
        jButton6.setIcon((new ImageIcon("src/resources/Hard_Unselected.PNG")));
        
        diffTemp = 2;
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        jButton4.setIcon((new ImageIcon("src/resources/Easy_Unselected.PNG")));
        jButton5.setIcon((new ImageIcon("src/resources/Medium_Unselected.PNG")));
        jButton6.setIcon((new ImageIcon("src/resources/Hard_Selected.PNG")));
        
        diffTemp = 3;
        
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        if (diff!=diffTemp) {
            
        
        diff = diffTemp;
        
         if (diff == 1)
        {
           
            gameSt.SetGameControler(new Game_controler(new Facil()));
            
            
            
        }
        
        else if (diff == 2)
        {
        
             gameSt.SetGameControler(new Game_controler(new Normal()));
            
        }
        
        else if (diff == 3)
        {
           
            gameSt.SetGameControler(new Game_controler(new Dificil()));
           
            
        } 
        
        
        }
        
        
        painelPrincipal.setVisible(true);
        this.remove(settings);
        
        
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        painelPrincipal.setVisible(true);
        this.remove(settings);
        
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
       
    }     
    
}
