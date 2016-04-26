

package battlechips;
import javax.swing.JFrame;

/*
 *
 * @author paulo
 * CLASSE BattleChips
 * 
 * é a Classe principal do jogo, possui o método auxiliar GameStarter
 * para alternar entre as Telas do jogo.
 * 
 */

public class BattleChips {
    
    
    private GameStarter GameStarter; //instância de GameStarter
 
                
    private javax.swing.JLabel LogoTJC; //logotipo the juice Crew
    private javax.swing.JProgressBar barraDeProgressLoading; //barra de progresso da tela de carregamento
    private javax.swing.JFrame Loading; //Tela de Carregamento
       
    
    //Principais janelas do Jogo - todas são subclasses de JFrame
    private Gui_MainMenu GuiMainMenu; // janela de menu principal
    private Gui_SetupBoard GuiSetupBoard; //janela de montagem de placa
    private Gui_GamePlay GuiGamePlay; //janela de jogo
    
    
    
    
    //contrutor da classe principal;
    public BattleChips () 
    {
        //cria um objeto do tipo GameStarter e envia uma referencia de BatleChips como argumento
        GameStarter = new GameStarter(this);  
        
        //cria os objetos de janelas
        GuiMainMenu = new Gui_MainMenu(GameStarter);
        GuiSetupBoard = new Gui_SetupBoard(GameStarter);
        GuiGamePlay = new Gui_GamePlay(GameStarter);
        
        //cria objetos de interface
        barraDeProgressLoading = new javax.swing.JProgressBar();
        LogoTJC = new javax.swing.JLabel();
        Loading = new javax.swing.JFrame();
        
    }
    
    
    //classe main do projeto
    public static void main(String[] args) 
    {
        //cria um objeto Desta Classe
        BattleChips b = new BattleChips();
        
        //Executa o método Alternar, que atualiza das janelas de acordo com o estado
        b.Alternar();
         
        
    }
    
    
    /*
    * MÉTODO Alternar
    * Verifica qual o estado do Jogo e alterna as Janelas do Jogo
    */
    public void Alternar() {
        
        //se a variavel de fim de jogo for falsa
        if (GameStarter.ExitGame==false) {
            
            //se o estado do jogo for para carregar os componentes - Inicia o metodo load()
            if (GameStarter.Load) Load();
            
            //se o estado do jogo for para exibir o menu - executa o método ShowMenu();
            if (GameStarter.mainMenu) ShowMenu();
            
            //se o estado do jogo for para exibir o Setup de placa - executa o método ShowSetup();
            if (GameStarter.setup) ShowSetup();
            
             //se o estado do jogo for para iniciar o jogo - executa o método GamePlay();
            if (GameStarter.StartGame) ShowGamePlay();
            
            
            
        } 
        //senão (a variavel de fim de jogo é verdadeira)
        else 
        {
            //Encerrar a aplicação
            System.exit(0);
        }
    }
    
    
    /*
    * MÉTODO LOAD
    * Carrega todos os componentes gráficos do jogo
    */
    private void Load() {
        
            //verifica se existem janelas abertas e fecha
            if (GuiMainMenu.isVisible()) GuiMainMenu.setVisible(false);
            if (GuiSetupBoard.isVisible()) GuiSetupBoard.setVisible(false);
            if (GuiGamePlay.isVisible()) GuiSetupBoard.setVisible(false);
            
            
            
            
            //seta a barra de prgressos para modo indeterminado de progresso
            barraDeProgressLoading.setIndeterminate(true);
            
            //Configurações de layout da janela de loading
            Loading.setUndecorated(true);
            Loading.setLocation(100,100);
            Loading.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            
            Loading.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            Loading.getContentPane().add(barraDeProgressLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 498, -1));

            LogoTJC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo.png"))); 
            Loading.getContentPane().add(LogoTJC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 420));
            Loading.pack();
            Loading.setVisible(true);

            
            //inicia os componentes nas outras janelas do jogo
            GuiMainMenu.InitComponents();      
            GuiSetupBoard.InitComponents();
            GuiGamePlay.InitComponents();
            
            
            //desativa o estado de load
            GameStarter.Load = false;
            //ativa o estado para o menu principal
            GameStarter.SetMainMenu();
        
        
    }
    
    //método que exibe a janela de menu
    private void ShowMenu() {
        
        //verifica se existem janelas abertas e fecha
        if (Loading.isVisible()) Loading.setVisible(false);
        if (GuiSetupBoard.isVisible()) GuiSetupBoard.setVisible(false);
        if (GuiGamePlay.isVisible()) GuiGamePlay.setVisible(false);
        
        
        //exibe a janela de menu
        GuiMainMenu.setVisible(true);
        GameStarter.mainMenu = false;
        
    }
    
    //método de exibe a janela de setub
    private void ShowSetup() {
    
        //verifica se existem janelas abertas e fecha
        if (Loading.isVisible())  Loading.setVisible(false);
        if (GuiMainMenu.isVisible())  GuiMainMenu.setVisible(false);
        if (GuiGamePlay.isVisible())  GuiGamePlay.setVisible(false);
    
        //exibe a janela de setup
        GuiSetupBoard.setVisible(true);
        GameStarter.setup = false;
    
    }
    
    
    //metodo que exibe a janela de gamePlay
    private void ShowGamePlay() {
        
        //verifica se existem janelas abertas e fecha
        if (Loading.isVisible()) Loading.setVisible(false);
        if (GuiMainMenu.isVisible()) GuiMainMenu.setVisible(false);
        if (GuiSetupBoard.isVisible())  GuiSetupBoard.setVisible(false);
   
        //exibe a janela de gameplay
        GuiGamePlay.setVisible(true);
        GameStarter.StartGame = false;
        
        
    }
    
    
    
}
