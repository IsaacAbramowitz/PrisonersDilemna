package com.isaacabramowitz.prisonersdilemna.business;

import com.isaacabramowitz.prisonersdilemna.interfaces.Playable;
import com.isaacabramowitz.prisonersdilemna.interfaces.Player;

/**
 * Represents an iterative game of prisoner's dilemma
 *
 * @author Isaac Abramowitz
 * @version 2019-04-15
 */
public class Game implements Playable {

    private int turns;
    private Player player1;
    private Player player2;
    private boolean hasStarted;
    private int player1Score;
    private int player2Score;

    @Override
    public void start(int turns, Player player1, Player player2) {
        this.turns = turns;
        this.player1 = player1;
        this.player2 = player2;
        this.hasStarted = false;
        this.player1Score = 0;
        this.player2Score = 0;

        this.play();
    }

    @Override
    public int getPlayer1Results() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPlayer2Results() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Player getPlayer1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Player getPlayer2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
