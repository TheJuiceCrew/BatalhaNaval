/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battlechips;



/**
 *
 * @author berto
 */
public class GameStarter {
    
    private boolean mainMenu;
    private boolean setup;
    private boolean newGame;
    private boolean ExitGame;
    private boolean Load;
    
    
    private Gui_MainMenu GuiMainMenu;
    private Gui_SetupBoard GuiSetupBoard;
    private Gui_TableBlock GuiTableBlock;
    
    
    
    public GameStarter() {
       ExitGame=false;
       mainMenu=false;
       setup=false;
       
       
    }
    
    
    
    
    public void IniciarJogo () {
        
        
        Load = true;
        
        
        while (ExitGame==false) {
            
            
            if (Load) Load();
            
            if (mainMenu) 
            
            if (setup) ShowSetup();
              
            
            
            
            
        }
       
    }
    
    
    
    public void ExitGame() {
        
    mainMenu = false;
    setup = false;
    newGame = false;
    ExitGame = true;
        
    }
    
    public void SetSetup() {
         mainMenu = false;
         setup =  true;
         newGame = false;
         ExitGame = false;
    }
    
    private void Load() {
        
    }
    
    private void ShowMenu() {
        
    }
    
    private Void ShowSetup() {
        
    }
    
    private void ShowGame() {
        
    }
    
    
    
}
