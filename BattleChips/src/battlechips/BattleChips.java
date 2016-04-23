/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlechips;
import java.awt.Dimension;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
/**
 *
 * @author paulo
 */
public class BattleChips extends JButton {
    
    private GameStarter GameStarter;
 
 // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JFrame Loading;
    // End of variables declaration     
    
    private Gui_MainMenu GuiMainMenu;
    private Gui_SetupBoard GuiSetupBoard;
    private Gui_GamePlay GuiGamePlay;
    
    
    
    
    /**
     * @param args the command line arguments
     */
    
    public BattleChips () {
        
        
        
        GameStarter = new GameStarter(this);
        
        
        
        
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
       
        BattleChips b = new BattleChips();
        b.Alternar();
         
         
        
        
        
        
        
        /* 
        Table T = new Table(new Facil());
        T.InserirChip(2, 2, 2, 4);
        
        T.InserirChip(1, 3, 5, 4);
        
        T.imprimeStatus();
        
        T.RemoveChip(3, 7);
        
        T.imprimeStatus();
        
        T.InserirChip(2, 2, 7, 4);
        
        T.imprimeStatus();
        
        
        
        
        Dificuldade d = new Facil();
        
                Game_controler g = new Game_controler(d);
        g.IiciarJogo();
        
        
        Player p = g.GetPlayer(1);
        
        for (int i =1; i<=4; i++) {
            
        
        while (!(p.getTable().getNichipsTipo(i)>=d.getNchipsTipo(i))) {
            g.setChipPlayer(1,p.getTable().getRandomPosition(), p.getTable().getRandomPosition(), 
                    p.getTable().getRandomOrientation(), i);
        }
        
        }
        
       
        
        
        g.IiciarJogo();
      
        
         p = g.GetPlayer(2);
         for (int i =1; i<=4; i++) {
            
        
        while (!(p.getTable().getNichipsTipo(i)>=d.getNchipsTipo(i))) {
            g.setChipPlayer(2,p.getTable().getRandomPosition(), p.getTable().getRandomPosition(), 
                    p.getTable().getRandomOrientation(), i);
        }
        
        }
        
        
        
        
        g.IiciarJogo();
        
    
        g.GetPlayer(2).getTable().imprimeStatus();
        
        Scanner s = new Scanner(System.in);
        int x,y;
        while (!g.ChecarFimDeJogo()) {
            System.out.println("informe um valor para x e y");
            int a = s.nextInt();
            int b = s.nextInt();
            g.PlayerShoot(a, b);
            
            g.CpuShoot();
            
            g.GetPlayer(2).getTable().imprimeStatus();
            g.GetPlayer(1).getTable().imprimeStatus();
        
                }
        
   
    */
    
    }
    
    
    
    public void Alternar() {
        
        if (GameStarter.ExitGame==false) {
            
            
            if (GameStarter.Load) Load();
            
            if (GameStarter.mainMenu) ShowMenu();
            
            if (GameStarter.setup) ShowSetup();
              
            if (GameStarter.StartGame) ShowGamePlay();
            
            
            
        } else {
            System.exit(0);
        }
        
        
        
        }
    
    
    
    private void Load() {
        
        if (GuiMainMenu!=null) {
            GuiMainMenu.setVisible(false);
        }
        
        if (GuiSetupBoard!=null) {
            GuiSetupBoard.setVisible(false);
        }
        
        if (GuiGamePlay!=null) {
            GuiGamePlay.setVisible(false);
        }
        
        
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        Loading = new javax.swing.JFrame();
        GameStarter.jProgressBar1 = jProgressBar1;
         jProgressBar1.setValue(0);
         Loading.setUndecorated(true);
         
         Loading.setLocationRelativeTo(null);
        Loading.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Loading.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Loading.getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 498, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        Loading.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 420));

        Loading.pack();
        
       // if (!GameStarter.GameStarted) {
            Loading.setVisible(true);
            //GameStarter.GameStarted = true;
       // } 
        
        
        //jProgressBar1.setValue(5);
        
        GuiMainMenu = new Gui_MainMenu(GameStarter);
        GuiMainMenu.InitComponents();
        
        //jProgressBar1.setValue(50);
        
        GuiSetupBoard = new Gui_SetupBoard(GameStarter);
        GuiSetupBoard.InitComponents();
        
        //jProgressBar1.setValue(75);
        
        GuiGamePlay = new Gui_GamePlay(GameStarter);
        GuiGamePlay.InitComponents();
        
        
        //jProgressBar1.setValue(100);
        GameStarter.Load = false;
        GameStarter.SetMainMenu();
        
    }
    
    private void ShowMenu() {
        
        
        if (Loading!=null) {
            Loading.setVisible(false);
        }
        Loading=null;
        
        
        
        if (GuiSetupBoard!=null) {
            GuiSetupBoard.setVisible(false);
        }
        
        if (GuiGamePlay!=null) {
            GuiGamePlay.setVisible(false);
        }
        
        
        
        
        GuiMainMenu.setVisible(true);
        GameStarter.mainMenu = false;
        
    }
    
    private void ShowSetup() {
        
        System.out.println("Showing Setup ");  
        
        if (Loading!=null) {
            Loading.setVisible(false);
        }
 
        if (GuiMainMenu!=null) {
            GuiMainMenu.setVisible(false);
        }
        
        if (GuiGamePlay!=null) {
            GuiGamePlay.setVisible(false);
        }
       
        
        GuiSetupBoard.setVisible(true);
        GameStarter.setup = false;
    
    }
    
    
    
    private void ShowGamePlay() {
        if (Loading!=null) {
            Loading.setVisible(false);
        }
 
        if (GuiMainMenu!=null) {
            GuiMainMenu.setVisible(false);
        }
        
        if (GuiSetupBoard!=null) {
            GuiSetupBoard.setVisible(false);
        }
       
        
        GuiGamePlay.setVisible(true);
        GameStarter.StartGame = false;
        
        
    }
    
    
    
}
