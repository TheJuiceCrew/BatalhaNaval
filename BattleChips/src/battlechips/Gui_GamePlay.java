/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlechips;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author berto
 */
public class Gui_GamePlay extends JFrame {
    
    Game_controler jogo;
    private Gui_TableBlock casasJog[][];
    private Gui_TableBlock casasAdv[][]; 
    Dificuldade Dificuldade;
    int BlockSize;
    int UserBlockSize;
    
    
    
    //componentes de interface
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel PainelAdversario;
    private javax.swing.JPanel PaunelUsuario;
    
    
    
    
    public Gui_GamePlay (Game_controler game) {
        jogo = game;
        
        Dificuldade = jogo.getDificuldade();
        int a,b;
        
        if (Dificuldade.DIFICULDADE == 3) {
        a = 30;
        b = 20; 
        } else if (Dificuldade.DIFICULDADE == 2) {
        a = 35;
        b = 25; 
        } else {
        a = 37;
        b = 37; 
        }
        
        BlockSize = a;
        UserBlockSize = b;
        
        casasJog = new Gui_TableBlock[Dificuldade.TABSIZE][Dificuldade.TABSIZE];
        casasAdv = new Gui_TableBlock[Dificuldade.TABSIZE][Dificuldade.TABSIZE];
        initComponents ();
    }
    
    
    
    
    
    
    
    private void initComponents () {
        
        //inicialização de variaveis
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        PainelAdversario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PaunelUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(76, 175, 80));

        jPanel2.setBackground(new java.awt.Color(46, 125, 50));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 81, 30)));
        jPanel2.setMaximumSize(new java.awt.Dimension(793, 50));
        jPanel2.setMinimumSize(new java.awt.Dimension(793, 50));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(793, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CPUart.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CPUname.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("HITS:");
        jLabel15.setMaximumSize(new java.awt.Dimension(26, 17));
        jLabel15.setMinimumSize(new java.awt.Dimension(26, 17));
        jLabel15.setPreferredSize(new java.awt.Dimension(26, 17));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("00");
        jLabel16.setMaximumSize(new java.awt.Dimension(26, 15));
        jLabel16.setMinimumSize(new java.awt.Dimension(26, 15));
        jLabel16.setPreferredSize(new java.awt.Dimension(26, 15));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("MISSES:");
        jLabel17.setMaximumSize(new java.awt.Dimension(24, 15));
        jLabel17.setMinimumSize(new java.awt.Dimension(24, 15));
        jLabel17.setPreferredSize(new java.awt.Dimension(24, 15));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("00");
        jLabel18.setMaximumSize(new java.awt.Dimension(26, 15));
        jLabel18.setMinimumSize(new java.awt.Dimension(26, 15));
        jLabel18.setPreferredSize(new java.awt.Dimension(26, 15));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("CHIPS DESTROYED:");
        jLabel19.setMaximumSize(new java.awt.Dimension(24, 15));
        jLabel19.setMinimumSize(new java.awt.Dimension(24, 15));
        jLabel19.setPreferredSize(new java.awt.Dimension(24, 15));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("00");
        jLabel20.setMaximumSize(new java.awt.Dimension(26, 15));
        jLabel20.setMinimumSize(new java.awt.Dimension(26, 15));
        jLabel20.setPreferredSize(new java.awt.Dimension(26, 15));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("CHIPS LEFT:");
        jLabel21.setMaximumSize(new java.awt.Dimension(24, 15));
        jLabel21.setMinimumSize(new java.awt.Dimension(24, 15));
        jLabel21.setPreferredSize(new java.awt.Dimension(24, 15));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("00");
        jLabel22.setMaximumSize(new java.awt.Dimension(26, 15));
        jLabel22.setMinimumSize(new java.awt.Dimension(26, 15));
        jLabel22.setPreferredSize(new java.awt.Dimension(26, 15));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(9, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel15, jLabel16, jLabel17, jLabel18});
        
        PainelAdversario.setBackground(new java.awt.Color(255, 255, 102));
        java.awt.Dimension d = new java.awt.Dimension((jogo.getDificuldade().TABSIZE*BlockSize)+5, (jogo.getDificuldade().TABSIZE*BlockSize)+5);
        java.awt.GridLayout TabAdvLayout = new java.awt.GridLayout(jogo.getDificuldade().TABSIZE,jogo.getDificuldade().TABSIZE);
        PainelAdversario.setLayout(TabAdvLayout);
        PainelAdversario.setMaximumSize(d);
        PainelAdversario.setMinimumSize(d);
        PainelAdversario.setPreferredSize(d);
        
        
        
        
        
        java.awt.event.MouseListener blockListener = new java.awt.event.MouseListener() {

                 @Override
                 public void mouseClicked(MouseEvent e) {
                     BlockTableAdvClicked(e);
                 }

                 @Override
                 public void mousePressed(MouseEvent e) {
                     BlockTableAdvPressed(e);
                 }

                 @Override
                 public void mouseReleased(MouseEvent e) {
                     //do nothing
                 }

                 @Override
                 public void mouseEntered(MouseEvent e) {
                     
                 }

                 @Override
                 public void mouseExited(MouseEvent e) {
                     
                 }
             
             
             } ;
        
        
        for (int i = 0; i<jogo.getDificuldade().TABSIZE; i++) {  
         //alterncanci de coluna
         for (int j = 0; j<jogo.getDificuldade().TABSIZE; j++) {
             
             Gui_TableBlock b = casasAdv[i][j] = new Gui_TableBlock(i+1,j+1,BlockSize);
             b.addMouseListener(blockListener);
             b.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pressed-but.png")));
             b.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pressed-but.png")));
             PainelAdversario.add(b);

         }       
     }
        

        

        PaunelUsuario.setBackground(new java.awt.Color(255, 255, 102));
        java.awt.Dimension d2 = new java.awt.Dimension((jogo.getDificuldade().TABSIZE*UserBlockSize)+1, (jogo.getDificuldade().TABSIZE*UserBlockSize)+1);
        java.awt.GridLayout TabJogLayout = new java.awt.GridLayout(jogo.getDificuldade().TABSIZE,jogo.getDificuldade().TABSIZE);
        PaunelUsuario.setLayout(TabJogLayout);
        PaunelUsuario.setMaximumSize(d2);
        PaunelUsuario.setMinimumSize(d2);
        PaunelUsuario.setPreferredSize(d2);

        
        
        for (int i = 0; i<jogo.getDificuldade().TABSIZE; i++) {  
         //alterncanci de coluna
         for (int j = 0; j<jogo.getDificuldade().TABSIZE; j++) {
             
             Gui_TableBlock b = casasJog[i][j] = new Gui_TableBlock(i+1,j+1,UserBlockSize);
             
             PaunelUsuario.add(b);

         }       
        }
        

        jPanel12.setBackground(new java.awt.Color(129, 199, 132));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setMaximumSize(new java.awt.Dimension(793, 50));
        jPanel12.setMinimumSize(new java.awt.Dimension(793, 50));
        jPanel12.setName(""); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/usericon.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/youlabel.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("HITS:");
        jLabel23.setMaximumSize(new java.awt.Dimension(26, 17));
        jLabel23.setMinimumSize(new java.awt.Dimension(26, 17));
        jLabel23.setPreferredSize(new java.awt.Dimension(26, 17));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("CHIPS LEFT:");
        jLabel24.setMaximumSize(new java.awt.Dimension(24, 15));
        jLabel24.setMinimumSize(new java.awt.Dimension(24, 15));
        jLabel24.setPreferredSize(new java.awt.Dimension(24, 15));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("00");
        jLabel25.setMaximumSize(new java.awt.Dimension(26, 15));
        jLabel25.setMinimumSize(new java.awt.Dimension(26, 15));
        jLabel25.setPreferredSize(new java.awt.Dimension(26, 15));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("MISSES:");
        jLabel26.setMaximumSize(new java.awt.Dimension(24, 15));
        jLabel26.setMinimumSize(new java.awt.Dimension(24, 15));
        jLabel26.setPreferredSize(new java.awt.Dimension(24, 15));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("00");
        jLabel27.setMaximumSize(new java.awt.Dimension(26, 15));
        jLabel27.setMinimumSize(new java.awt.Dimension(26, 15));
        jLabel27.setPreferredSize(new java.awt.Dimension(26, 15));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("00");
        jLabel28.setMaximumSize(new java.awt.Dimension(26, 15));
        jLabel28.setMinimumSize(new java.awt.Dimension(26, 15));
        jLabel28.setPreferredSize(new java.awt.Dimension(26, 15));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("CHIPS DESTROYED:");
        jLabel29.setMaximumSize(new java.awt.Dimension(24, 15));
        jLabel29.setMinimumSize(new java.awt.Dimension(24, 15));
        jLabel29.setPreferredSize(new java.awt.Dimension(24, 15));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("00");
        jLabel30.setMaximumSize(new java.awt.Dimension(26, 15));
        jLabel30.setMinimumSize(new java.awt.Dimension(26, 15));
        jLabel30.setPreferredSize(new java.awt.Dimension(26, 15));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(32, 32, 32))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PaunelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelAdversario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelAdversario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaunelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        jMenu3.setText("Game");

        jMenuItem1.setText("New Game");
        jMenu3.add(jMenuItem1);

        jMenuItem8.setText("Return to Main Menu");
        jMenu3.add(jMenuItem8);

        jMenuItem2.setText("Exit");
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        jMenu1.setText("Config");

        jMenuItem3.setText("Volume");
        jMenu1.add(jMenuItem3);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem6.setText("Help Contents");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("About");
        jMenu2.add(jMenuItem7);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        
        updateTables();
    }
    
    
    private void userTableEnabled(boolean enabled) {
       for (int i = 0; i<jogo.getDificuldade().TABSIZE; i++) {  
         //alterncanci de coluna
         for (int j = 0; j<jogo.getDificuldade().TABSIZE; j++) {
             
             JButton b = casasAdv[i][j];
             b.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pressed-but.png")));
             b.setEnabled(enabled);
   
         }
       }
   }
   
    
    private void updateTables() {
    
      for (int i = 0; i<jogo.getDificuldade().TABSIZE; i++) {  
         //alterncanci de coluna
         for (int j = 0; j<jogo.getDificuldade().TABSIZE; j++) {
             
             Block b = jogo.GetPlayer(1).getTable().VerificarBloco(i+1, j+1);
             Block b2 = jogo.GetPlayer(2).getTable().VerificarBloco(i+1, j+1);
             
             
              if (b.getChipPiece()!=null) { 
                  casasJog[i][j].setIconChip(b.getChipPiece().getTipo(),b.getChipPiece().getOrient(),b.getChipPiece().getpedaço());
                 if (b.IsShot()) {
                     casasJog[i][j].setEnabled(false);
                  } else {
                      
                  }
               }   else {
                       if (b.IsShot()) {
                 casasJog[i][j].setIconChip(0,0,3);
                  } else   casasJog[i][j].setIconChip(0,0,0);
              }
                  
                  
              if (b2.getChipPiece()!=null) { 
                  if (b2.IsShot()) {
                 casasAdv[i][j].setIconChip(b2.getChipPiece().getTipo(),b2.getChipPiece().getOrient(),b2.getChipPiece().getpedaço());
                 
                  } else {
                      casasAdv[i][j].setIconChip(0,0,1);
                  }
               }   else {
                       if (b2.IsShot()) {
                 casasAdv[i][j].setIconChip(0,0,3);
                  } else   casasAdv[i][j].setIconChip(0,0,1);
              } 
         }
      }
      
      
      
     
      
    }
    
    
    private void  BlockTableAdvPressed(java.awt.event.MouseEvent evt) {
       
        
    }
    
    
    private void BlockTableAdvClicked(java.awt.event.MouseEvent evt) {
          Gui_TableBlock block = (Gui_TableBlock) evt.getSource();
          Block casa = jogo.GetPlayer(2).getTable().VerificarBloco(block.getPosition(1), block.getPosition(2));
          if (!casa.IsShot()) { 
              
                  jogo.PlayerShoot(block.getPosition(1), block.getPosition(2));
                  updateTables();
                  
                  
                  CpuTime();
                  
                  jogo.CpuShoot(); 
                  
                  
                  
                  PlayerTime();
           
          }
    
    }
      
       
    
private void CpuTime() {

   userTableEnabled(false);
   

}


private void PlayerTime() {
    

    userTableEnabled(true);
}


}