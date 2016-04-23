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
    
               
    
    
    
    
    public boolean mainMenu;
    public boolean setup;
    public boolean StartGame;
    public boolean newGame;
    public boolean ExitGame;
    public boolean Load;
    public boolean GameStarted;
    
    public javax.swing.JProgressBar jProgressBar1;
    
    private Game_controler game;
    private BattleChips B;
    
    
    
    public GameStarter(BattleChips c) {
        B=c;
       SetGameControler(new Game_controler(new Normal()));
       ExitGame=false;
       mainMenu=false;
       setup=false;
       Load = true;
       
    }
    
    public void Alternar () {
        B.Alternar();
    }
    
    public void SetGameControler(Game_controler game) {
        this.game=game;
    }
    
    public Game_controler GetGameControler() {
      return game;   
    }
    
    
    
    public void ExitGame() {
        
    mainMenu = false;
    setup = false;
    newGame = false;
    StartGame = false;
    ExitGame = true;
    
        
    }
    
    public void SetLoad() {
    mainMenu = false;
    StartGame = false;
    setup =  false;
    Load=true;
    newGame = false;
    ExitGame = false;
    }
    
    
    public void NewGame() {
        game.NewGame();
    }
    
    public void SetMainMenu() {
      NewGame();
    mainMenu = true;
    StartGame = false;
    setup =  false;
    newGame = false;
    ExitGame = false;
    }
    
    public void SetSetup() {
        System.out.println("Starting Setup");    
    mainMenu = false;
    StartGame = false;
    setup =  true;
    newGame = false;
    ExitGame = false;
    }
    
    public void SetGamePlay() {
    mainMenu = false;
    setup =  false;
    newGame = false;
    ExitGame = false;
    StartGame = true;
    }
    
    
    
    
    
    
}


