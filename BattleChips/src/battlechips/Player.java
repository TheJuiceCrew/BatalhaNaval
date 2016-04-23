/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*
 *classe que representa um jogador no Jogo
 */
package battlechips;

/**
 *
 * @author paulo
 * 
 *  
 */
public class Player {
    
    private int ID;
    private int pontos;
    
    private Table TabJogador; //tabuleiro do jogador
    
    protected Dificuldade dificuldade;
    protected int acertos;
    protected int erros;
    protected int jogadas;
    
    
    
    
    public Player (int ID,Dificuldade dif) {
        this.ID = ID;
        dificuldade = dif;
        TabJogador = new Table(dif);
    }
    
    
    public int getID() {
        return ID;
    }
    
    
    public int getAcertos() {
        return acertos;
    }
    
    public int getErros() {
        return erros;
    }
    
    public int getJogadas() {
        return jogadas;
    }
    
    
    public boolean MakeShoot (int x,int y, Table adTable) {
         jogadas++;
        boolean acerto = adTable.Shoot(x, y);
        
        if (acerto) {
            pontos = pontos+10;
            acertos++;
        } else {
            erros++;      
        }
        
        return acerto;
    }


    //pegar o tabuleiro do jogador (ele da pra todos, é publico)
    public Table getTable() {
        return this.TabJogador;
    }
    
    public void newTable() {
        TabJogador = new Table(dificuldade);
        acertos=0;
        erros=0;
        jogadas=0;
        pontos=0;
    }
    
    
    public boolean ChipsProntos() {
        
        if (TabJogador.getNChips()==dificuldade.N_CHIPS) {
            return true;
        } else
            return false;
    }
    
}
