/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlechips;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author berto
 */
public class Gui_GamePlay extends JPanel {
    
    Game_controler jogo;
    private Gui_TableBlock casasJog[][];
    private Gui_TableBlock casasAdv[][]; 
    Dificuldade Dificuldade;
    int BlockSize;
    int UserBlockSize;
    
    boolean VezJogador;
    boolean VezCpu;
    int cont,x,y;
    Gui_TableBlock temp;
    
    
    
    //componentes de interface
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel nCpuHits;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel nCpuMisses;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nCpuChipsLeft;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel nCpuChipsDestroyed;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel nUserHits;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel nUserChipsLeft;
    private javax.swing.JLabel nUserMisses;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel nUserChipsDestroyed;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel nbotaoUsu;
    private javax.swing.JLabel nResistUsu;
    private javax.swing.JLabel nDecodUsu;
    private javax.swing.JLabel nMicroUsu;
    private javax.swing.JLabel nbotaoCpu;
    private javax.swing.JLabel nResistCpu;
    private javax.swing.JLabel nDecodCpu;
    private javax.swing.JLabel nMicroCpu;
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
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel infoUsuario;
    private javax.swing.JPanel infoCPU;
    private javax.swing.JPanel PainelAdversario;
    private javax.swing.JPanel PaunelUsuario;
    private javax.swing.JPanel imgBotoaoCpu;
    private javax.swing.JPanel imgResistCpu;
    private javax.swing.JPanel imgDecodCpu;
    private javax.swing.JPanel imgMicroCpu;
    private javax.swing.JPanel imgbotaoPlayer;
    private javax.swing.JPanel imgResistPlayer;
    private javax.swing.JPanel imgDecodPlayer;
    private javax.swing.JPanel imgMicroPlayer;
    private javax.swing.JLabel x1,x2,x3,x4,x5,x6;
    private Timer CpuAnimationTimer;
    
    
    java.awt.event.MouseListener blockListener;
    java.awt.event.ActionEvent turnListener;
    GameStarter GameSt;
    
    
    
    @Override
    public void setVisible (boolean a) {
        
        if (a==true) {
            
            
        if (jogo!=GameSt.GetGameControler())  {
            System.out.println("Componentes atualizados");
            updateCompnents();
        }      
            
        updateTables();
        VezJogador=true;
        jogo.IiciarJogo();
        
        }
        
        super.setVisible(a);
        
    }
    
    public Gui_GamePlay (GameStarter game) {
        
        
        
        GameSt = game;
        this.jogo = game.GetGameControler();
        
        Dificuldade = jogo.getDificuldade();
        int a,b;
        
        if (Dificuldade.DIFICULDADE == 3) {
        a = 30;
        b = 20; 
        } else if (Dificuldade.DIFICULDADE == 2) {
        a = 37;
        b = 37; 
        } else {
        a = 37;
        b = 37; 
        }
        
        BlockSize = a;
        UserBlockSize = b;
        
        casasJog = new Gui_TableBlock[Dificuldade.TABSIZE][Dificuldade.TABSIZE];
        casasAdv = new Gui_TableBlock[Dificuldade.TABSIZE][Dificuldade.TABSIZE];
        
        
        
        
    }
    
    
    
    
    
    
    
    public void InitComponents () {
        
        
        
        //inicialização de variaveis
        jPanel1 = new javax.swing.JPanel();
        infoCPU = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nCpuHits = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nCpuMisses = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        nCpuChipsLeft = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        nCpuChipsDestroyed = new javax.swing.JLabel();
        PainelAdversario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PaunelUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        infoUsuario = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        nUserHits = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        nUserChipsLeft = new javax.swing.JLabel();
        nUserMisses = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        nUserChipsDestroyed = new javax.swing.JLabel();
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
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        nbotaoUsu = new javax.swing.JLabel();
        nResistUsu = new javax.swing.JLabel();
        nDecodUsu = new javax.swing.JLabel();
        nMicroUsu = new javax.swing.JLabel();
        nbotaoCpu = new javax.swing.JLabel();
        nResistCpu = new javax.swing.JLabel();
        nDecodCpu = new javax.swing.JLabel();
        nMicroCpu = new javax.swing.JLabel();
        
       imgBotoaoCpu = new javax.swing.JPanel();
       imgResistCpu = new javax.swing.JPanel();
       imgDecodCpu = new javax.swing.JPanel();
       imgMicroCpu = new javax.swing.JPanel();
       imgbotaoPlayer = new javax.swing.JPanel();
       imgResistPlayer = new javax.swing.JPanel();
       imgDecodPlayer = new javax.swing.JPanel();
       imgMicroPlayer = new javax.swing.JPanel();
       x1 = new javax.swing.JLabel();
       x2 = new javax.swing.JLabel();
       x3 = new javax.swing.JLabel();
       x4 = new javax.swing.JLabel();
       x5 = new javax.swing.JLabel();
       x6 = new javax.swing.JLabel();
        
        
        

        
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        

        jPanel1.setBackground(new java.awt.Color(76, 175, 80));

        infoCPU.setBackground(new java.awt.Color(129, 199, 132));
        infoCPU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 81, 30)));
        infoCPU.setMaximumSize(new java.awt.Dimension(793, 50));
        infoCPU.setMinimumSize(new java.awt.Dimension(793, 50));
        infoCPU.setName(""); // NOI18N
        infoCPU.setPreferredSize(new java.awt.Dimension(793, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CPUart.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/CPUname.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("HITS:");
        jLabel15.setMaximumSize(new java.awt.Dimension(26, 17));
        jLabel15.setMinimumSize(new java.awt.Dimension(26, 17));
        jLabel15.setPreferredSize(new java.awt.Dimension(26, 17));

        nCpuHits.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nCpuHits.setText("00");
        nCpuHits.setMaximumSize(new java.awt.Dimension(26, 15));
        nCpuHits.setMinimumSize(new java.awt.Dimension(26, 15));
        nCpuHits.setPreferredSize(new java.awt.Dimension(26, 15));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("MISSES:");
        jLabel17.setMaximumSize(new java.awt.Dimension(24, 15));
        jLabel17.setMinimumSize(new java.awt.Dimension(24, 15));
        jLabel17.setPreferredSize(new java.awt.Dimension(24, 15));

        nCpuMisses.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nCpuMisses.setText("00");
        nCpuMisses.setMaximumSize(new java.awt.Dimension(26, 15));
        nCpuMisses.setMinimumSize(new java.awt.Dimension(26, 15));
        nCpuMisses.setPreferredSize(new java.awt.Dimension(26, 15));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("CHIPS DESTROYED:");
        jLabel19.setMaximumSize(new java.awt.Dimension(24, 15));
        jLabel19.setMinimumSize(new java.awt.Dimension(24, 15));
        jLabel19.setPreferredSize(new java.awt.Dimension(24, 15));

        nCpuChipsLeft.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nCpuChipsLeft.setText("00");
        nCpuChipsLeft.setMaximumSize(new java.awt.Dimension(26, 15));
        nCpuChipsLeft.setMinimumSize(new java.awt.Dimension(26, 15));
        nCpuChipsLeft.setPreferredSize(new java.awt.Dimension(26, 15));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("CHIPS LEFT:");
        jLabel21.setMaximumSize(new java.awt.Dimension(24, 15));
        jLabel21.setMinimumSize(new java.awt.Dimension(24, 15));
        jLabel21.setPreferredSize(new java.awt.Dimension(24, 15));

        nCpuChipsDestroyed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nCpuChipsDestroyed.setText("00");
        nCpuChipsDestroyed.setMaximumSize(new java.awt.Dimension(26, 15));
        nCpuChipsDestroyed.setMinimumSize(new java.awt.Dimension(26, 15));
        nCpuChipsDestroyed.setPreferredSize(new java.awt.Dimension(26, 15));

        
        
   
        
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(infoCPU);
        infoCPU.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(nCpuHits, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nCpuMisses, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nCpuChipsLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)    
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nCpuChipsDestroyed, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(9, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nCpuHits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nCpuMisses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nCpuChipsDestroyed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nCpuChipsLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel15, nCpuHits, jLabel17, nCpuMisses});
        
        PainelAdversario.setBackground(new java.awt.Color(255, 255, 102));
        java.awt.Dimension d = new java.awt.Dimension((jogo.getDificuldade().TABSIZE*BlockSize)+5, (jogo.getDificuldade().TABSIZE*BlockSize)+5);
        java.awt.GridLayout TabAdvLayout = new java.awt.GridLayout(jogo.getDificuldade().TABSIZE,jogo.getDificuldade().TABSIZE);
        PainelAdversario.setLayout(TabAdvLayout);
        PainelAdversario.setMaximumSize(d);
        PainelAdversario.setMinimumSize(d);
        PainelAdversario.setPreferredSize(d);
        
        
        
        

           
        
        blockListener = new java.awt.event.MouseListener() {

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
                     BlockTableAdvReleased(e);
                     
                     
        
                 }

                 @Override
                 public void mouseEntered(MouseEvent e) {
                     BlockTableAdvEntered(e);
                     
                 }

                 @Override
                 public void mouseExited(MouseEvent e) {
                     BlockTableAdvExited(e);
                     
                 }
             
             
             } ;
        
        
        CpuAnimationTimer = new Timer(100, new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CpuTurn();
            }           
        });
        
        
        for (int i = 0; i<jogo.getDificuldade().TABSIZE; i++) {  
         //alterncanci de coluna
         for (int j = 0; j<jogo.getDificuldade().TABSIZE; j++) {
             
             Gui_TableBlock b = casasAdv[i][j] = new Gui_TableBlock(i+1,j+1,BlockSize);
             b.addMouseListener(blockListener);
             b.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pressed-but.png")));
             
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
      
        infoUsuario.setBackground(new java.awt.Color(46, 125, 50));
        infoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        infoUsuario.setMaximumSize(new java.awt.Dimension(793, 50));
        infoUsuario.setMinimumSize(new java.awt.Dimension(793, 50));
        infoUsuario.setName(""); // NOI18N

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

        nUserHits.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nUserHits.setText("00");
        nUserHits.setMaximumSize(new java.awt.Dimension(26, 15));
        nUserHits.setMinimumSize(new java.awt.Dimension(26, 15));
        nUserHits.setPreferredSize(new java.awt.Dimension(26, 15));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("MISSES:");
        jLabel26.setMaximumSize(new java.awt.Dimension(24, 15));
        jLabel26.setMinimumSize(new java.awt.Dimension(24, 15));
        jLabel26.setPreferredSize(new java.awt.Dimension(24, 15));

        nUserChipsLeft.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nUserChipsLeft.setText("00");
        nUserChipsLeft.setMaximumSize(new java.awt.Dimension(26, 15));
        nUserChipsLeft.setMinimumSize(new java.awt.Dimension(26, 15));
        nUserChipsLeft.setPreferredSize(new java.awt.Dimension(26, 15));

        nUserMisses.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nUserMisses.setText("00");
        nUserMisses.setMaximumSize(new java.awt.Dimension(26, 15));
        nUserMisses.setMinimumSize(new java.awt.Dimension(26, 15));
        nUserMisses.setPreferredSize(new java.awt.Dimension(26, 15));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("CHIPS DESTROYED:");
        jLabel29.setMaximumSize(new java.awt.Dimension(24, 15));
        jLabel29.setMinimumSize(new java.awt.Dimension(24, 15));
        jLabel29.setPreferredSize(new java.awt.Dimension(24, 15));

        nUserChipsDestroyed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nUserChipsDestroyed.setText("00");
        nUserChipsDestroyed.setMaximumSize(new java.awt.Dimension(26, 15));
        nUserChipsDestroyed.setMinimumSize(new java.awt.Dimension(26, 15));
        nUserChipsDestroyed.setPreferredSize(new java.awt.Dimension(26, 15));

   
        
        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(infoUsuario);
        infoUsuario.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nUserHits, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nUserMisses, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nUserChipsLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nUserChipsDestroyed, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(32, 32, 32))
        );
        jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nUserHits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nUserMisses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nUserChipsLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nUserChipsDestroyed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(infoCPU, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE))
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
                .addComponent(infoCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelAdversario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaunelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(infoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        
    
        jMenu3.setText("Game");
        
        jMenuItem9.setText("Restart");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                jogo.RestartGame();
                updateTables();
                UpdatePlayerInfo();
                jogo.IiciarJogo(); 
            }
        });
        
        jMenu3.add(jMenuItem9);
        
        jMenuItem10.setText("EditTable");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                
                updateTables();
                UpdatePlayerInfo();
                GameSt.SetSetup();
                GameSt.Alternar();   
            }
        });
        
        jMenu3.add(jMenuItem10);

        jMenuItem1.setText("New Game");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
                GameSt.NewGame();
                GameSt.SetSetup();
                GameSt.Alternar();
                
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem8.setText("Return to Main Menu");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameSt.SetMainMenu();
                GameSt.NewGame();
                GameSt.Alternar();
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameSt.ExitGame();
                
                GameSt.Alternar();
                
                
            }
        });
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

        //setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
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

        
        
        updateTables();
        UpdatePlayerInfo();
    }
    
    
    
    public void updateCompnents() {
        
        this.jogo = GameSt.GetGameControler();
        
        Dificuldade = jogo.getDificuldade();
        
        int a,b;
        
        if (Dificuldade.DIFICULDADE == 3) {
        a = 30;
        b = 20; 
        } else if (Dificuldade.DIFICULDADE == 2) {
        a = 37;
        b = 37; 
        } else {
        a = 37;
        b = 37; 
        }
        
        BlockSize = a;
        UserBlockSize = b;
        
        casasJog = new Gui_TableBlock[Dificuldade.TABSIZE][Dificuldade.TABSIZE];
        casasAdv = new Gui_TableBlock[Dificuldade.TABSIZE][Dificuldade.TABSIZE];
        
        
        
        java.awt.Dimension d = new java.awt.Dimension((jogo.getDificuldade().TABSIZE*BlockSize)+5, (jogo.getDificuldade().TABSIZE*BlockSize)+5);
        java.awt.GridLayout TabAdvLayout = new java.awt.GridLayout(jogo.getDificuldade().TABSIZE,jogo.getDificuldade().TABSIZE);
        PainelAdversario.removeAll();
        PainelAdversario.setLayout(TabAdvLayout);
        PainelAdversario.setMaximumSize(d);
        PainelAdversario.setMinimumSize(d);
        PainelAdversario.setPreferredSize(d);
        
        
        for (int i = 0; i<jogo.getDificuldade().TABSIZE; i++) {  
         //alterncanci de coluna
         for (int j = 0; j<jogo.getDificuldade().TABSIZE; j++) {
             
             Gui_TableBlock block = casasAdv[i][j] = new Gui_TableBlock(i+1,j+1,BlockSize);
             block.addMouseListener(blockListener);
             block.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pressed-but.png")));
             PainelAdversario.add(block);

         }       
     }
        
        PaunelUsuario.removeAll();
        java.awt.Dimension d2 = new java.awt.Dimension((jogo.getDificuldade().TABSIZE*UserBlockSize)+1, (jogo.getDificuldade().TABSIZE*UserBlockSize)+1);
        java.awt.GridLayout TabJogLayout = new java.awt.GridLayout(jogo.getDificuldade().TABSIZE,jogo.getDificuldade().TABSIZE);
        PaunelUsuario.setLayout(TabJogLayout);
        PaunelUsuario.setMaximumSize(d2);
        PaunelUsuario.setMinimumSize(d2);
        PaunelUsuario.setPreferredSize(d2);

        
        
        for (int i = 0; i<jogo.getDificuldade().TABSIZE; i++) {  
         //alterncanci de coluna
         for (int j = 0; j<jogo.getDificuldade().TABSIZE; j++) {
             
             Gui_TableBlock block = casasJog[i][j] = new Gui_TableBlock(i+1,j+1,UserBlockSize);
             
             PaunelUsuario.add(block);

         }       
        }
        
        
        
        
        
        
    }
    
    
    
    
    
    private void userTableEnabled(boolean enabled) {
       for (int i = 0; i<jogo.getDificuldade().TABSIZE; i++) {  
         //alterncanci de coluna
         for (int j = 0; j<jogo.getDificuldade().TABSIZE; j++) {
             
             JButton b = casasAdv[i][j];
             if (enabled)  b.addMouseListener(blockListener);
                     else b.removeMouseListener(blockListener);
             b.setDisabledIcon(b.getIcon());
             b.setEnabled(enabled);
   
         }
       }
   }
   
    private void UpdateOneBlockUser (Gui_TableBlock B) {
        //verifica qual o bloco esta alocado no tabuleiro
        
             
             int x = B.getPosition(1);
             int y = B.getPosition(2);
             
             
             
             Block b2 = jogo.GetPlayer(2).getTable().VerificarBloco(x, y);
             
             
            if (b2.getChipPiece()!=null) { 
                  if (b2.IsShot()) {
                 casasAdv[x-1][y-1].setIconChip(b2.getChipPiece().getTipo(),b2.getChipPiece().getOrient(),b2.getChipPiece().getpedaço());
                 casasAdv[x-1][y-1].setPressedIcon(null);
                  } else {
                      casasAdv[x-1][y-1].setIconChip(0,0,1);
                  }
               }   else {
                       if (b2.IsShot()) {
                 casasAdv[x-1][y-1].setIconChip(0,0,3);
                  } else   casasAdv[x-1][y-1].setIconChip(0,0,1);
              } 
            
            
                  
             
    }
    
    private void UpdateTableBlockCpu () {
        int utimoTiro[] = jogo.GetPlayer(1).getTable().getLastShoot();
             int x = utimoTiro[0];
             int y = utimoTiro[1];
             
             
                  Block b = jogo.GetPlayer(1).getTable().VerificarBloco(x, y);
              
              
               if (b.getChipPiece()!=null) { 
                  casasJog[x-1][y-1].setIconChip(b.getChipPiece().getTipo(),b.getChipPiece().getOrient(),b.getChipPiece().getpedaço());
                 if (b.IsShot()) {
                     casasJog[x-1][y-1].setEnabled(false);
                  } else {
                      
                  }
               }   else {
                       if (b.IsShot()) {
                 casasJog[x-1][y-1].setIconChip(0,0,3);
                  } else   casasJog[x-1][y-1].setIconChip(0,0,0);
              }
             
    }
    
    private void UpdateOneBlockCpu (Gui_TableBlock B) {
        int x = B.getPosition(1);
        int y = B.getPosition(2);
             
             
                  Block b = jogo.GetPlayer(1).getTable().VerificarBloco(x, y);
              
              
               if (b.getChipPiece()!=null) { 
                  casasJog[x-1][y-1].setIconChip(b.getChipPiece().getTipo(),b.getChipPiece().getOrient(),b.getChipPiece().getpedaço());
                 if (b.IsShot()) {
                     casasJog[x-1][y-1].setEnabled(false);
                  } else {
                      
                  }
               }   else {
                       if (b.IsShot()) {
                 casasJog[x-1][y-1].setIconChip(0,0,3);
                  } else   casasJog[x-1][y-1].setIconChip(0,0,0);
              }
             
    }
    
    
    
    private void CpuTurn() {
    
        cont++;
        
        
      if (cont<10) {
        
          if (cont==1) {
        
        userTableEnabled(false);
        infoCPU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        infoCPU.setBackground(new java.awt.Color(46, 125, 50));
        infoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
        infoUsuario.setBackground(new java.awt.Color(129, 199, 132));
        infoCPU.setSize(infoCPU.getWidth(),infoCPU.getHeight()+30);
        x = jogo.GetPlayer(1).getTable().getRandomPosition();
        y = jogo.GetPlayer(1).getTable().getRandomPosition();
        temp = casasJog[x-1][y-1];
          }
        
        
                
           
           if (cont % 2==0) {
               
                x = jogo.GetPlayer(1).getTable().getRandomPosition();
                y = jogo.GetPlayer(1).getTable().getRandomPosition();
                temp = casasJog[x-1][y-1];
                temp.setEnabled(true);
                temp.setIconChip(0, 1, 1);
           } else { 
               
               UpdateOneBlockCpu (temp);
           }
           
       
        
      }else {
          
            
        
        if (cont==10) { 
            CpuAnimationTimer.setDelay(CpuAnimationTimer.getDelay()/2);
            jogo.CpuShoot();
            
            int utimoTiro[] = jogo.GetPlayer(1).getTable().getLastShoot();
            x = utimoTiro[0];
            y = utimoTiro[1];
        }
        
        if (cont<30) {
        
        
        
        if (cont % 3==0) {
                
               temp = casasJog[x-1][y-1];
                temp.setEnabled(true);
                temp.setIconChip(0, 1, 1);
           } else { 
               UpdateOneBlockCpu (temp);
           }
        }
        else {
            CpuAnimationTimer.setDelay(CpuAnimationTimer.getInitialDelay());
            updateTables();
            cont=0;
        CpuAnimationTimer.stop();
        infoCPU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 1));
        infoCPU.setBackground(new java.awt.Color(129, 199, 132));
        userTableEnabled(true);
        infoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3));
        infoUsuario.setBackground(new java.awt.Color(46, 125, 50));
        
        VezCpu=false;
        VezJogador=true;
              }
        }
    }
    
    
    
    
    private void PlayerTurn() {
        
        
        
    }
    
    
    
    
    private void UpdatePlayerInfo() {
        
        nUserHits.setText(""+jogo.GetPlayer(1).getAcertos());
        nUserMisses.setText(""+jogo.GetPlayer(1).getErros());
        nUserChipsDestroyed.setText(""+jogo.GetPlayer(1).getTable().chipsCrashed());
        nUserChipsLeft.setText(""+(jogo.GetPlayer(1).getTable().getNChips()-jogo.GetPlayer(1).getTable().chipsCrashed()));
        
        nCpuHits.setText(""+jogo.GetPlayer(2).getAcertos());
        nCpuMisses.setText(""+jogo.GetPlayer(2).getErros());
        nCpuChipsDestroyed.setText(""+jogo.GetPlayer(2).getTable().chipsCrashed());
        nCpuChipsLeft.setText(""+(jogo.GetPlayer(2).getTable().getNChips()-jogo.GetPlayer(2).getTable().chipsCrashed()));
        
    }
    
    
    private void RevealUserTableBlock() {
        
        for (int i = 0; i<jogo.getDificuldade().TABSIZE; i++) {  
         //alterncanci de coluna
         for (int j = 0; j<jogo.getDificuldade().TABSIZE; j++) {
        
        Block b = jogo.GetPlayer(2).getTable().VerificarBloco(i+1, j+1);
        
        if (b.getChipPiece()!=null) { 
                  
                  casasAdv[i][j].setIconChip(b.getChipPiece().getTipo(),b.getChipPiece().getOrient(),b.getChipPiece().getpedaço());
                  casasAdv[i][j].setDisabledIcon(casasAdv[i][j].getIcon());
                  casasAdv[i][j].setEnabled(false);
                  if (b.IsShot()) {
                     casasAdv[i][j].setEnabled(false);
                  } else {
                      
                  }
               }   else {
            
            casasAdv[i][j].setEnabled(false);
                       if (b.IsShot()) {
                 casasAdv[i][j].setIconChip(0,0,3);
                 casasAdv[i][j].setDisabledIcon(casasAdv[i][j].getIcon());
                  } else  {
                           casasAdv[i][j].setIconChip(0,0,0);
                           casasAdv[i][j].setDisabledIcon(casasAdv[i][j].getIcon());
                       }
              }
    
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
                  casasJog[i][j].setEnabled(true);
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
                 casasAdv[i][j].setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                  } else {
                      casasAdv[i][j].setIconChip(0,0,1);
                      casasAdv[i][j].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                  }
               }   else {
                  
                       if (b2.IsShot()) {
                 casasAdv[i][j].setIconChip(0,0,3);
                 casasAdv[i][j].setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                  } else   {
                           casasAdv[i][j].setIconChip(0,0,1);
                           casasAdv[i][j].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                       }
              } 
         }
      }
      
      
      
     
      
    }
    
    
    private void  BlockTableAdvPressed(java.awt.event.MouseEvent evt) {
       
        
    }
    
    
    private void BlockTableAdvReleased(java.awt.event.MouseEvent evt) {
        
        
        if (jogo.ChecarFimDeJogo()) {
             RevealUserTableBlock();
             userTableEnabled(false);
        }
        
    }
    
    
    private void BlockTableAdvClicked(java.awt.event.MouseEvent evt) {
          Gui_TableBlock block = (Gui_TableBlock) evt.getSource();
       if (!jogo.ChecarFimDeJogo()) {   
          if (VezJogador==true) {
          Block casa = jogo.GetPlayer(2).getTable().VerificarBloco(block.getPosition(1), block.getPosition(2));
          if (!casa.IsShot()) { 
              
                  jogo.PlayerShoot(block.getPosition(1), block.getPosition(2));
                  UpdateOneBlockUser(block);
                  UpdatePlayerInfo();
                  CpuAnimationTimer.start();
                  
                  VezJogador=false;
                  
           
          }
          
          }
       }
    }
    
    
    
    
    public void BlockTableAdvEntered(MouseEvent e) {
         Gui_TableBlock block = (Gui_TableBlock) e.getSource();
         Block casa = jogo.GetPlayer(2).getTable().VerificarBloco(block.getPosition(1), block.getPosition(2));
          if (!casa.IsShot()) { 
              
              block.setIconChip(0, 1, 4);
          
          }
    }
                     
    public void BlockTableAdvExited (MouseEvent e) {
         Gui_TableBlock block = (Gui_TableBlock) e.getSource();
          Block casa = jogo.GetPlayer(2).getTable().VerificarBloco(block.getPosition(1), block.getPosition(2));
          if (!casa.IsShot()) { 
              
              block.setIconChip(0, 1, 1);
          
          }
                    
    }
    
    
}
      
       
    
