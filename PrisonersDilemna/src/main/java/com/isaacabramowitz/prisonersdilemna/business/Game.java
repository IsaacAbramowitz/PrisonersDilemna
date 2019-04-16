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
    private boolean player1Cooperated;
    private boolean player2Cooperated;

    @Override
    public void start(int turns, Player player1, Player player2) {
        this.turns = turns;
        this.player1 = player1;
        this.player2 = player2;
        this.hasStarted = false;
        this.player1Score = 0;
        this.player2Score = 0;
        this.player1Cooperated = false;
        this.player2Cooperated = false;

        this.play();
    }

    @Override
    public int getPlayer1Results() {
        return this.player1Score;
    }

    @Override
    public int getPlayer2Results() {
        return this.player2Score;
    }

    @Override
    public Player getPlayer1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Player getPlayer2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Starts running the games
     */
    private void play() {
        for (int i = 0; i < this.turns; i++) {
            if (this.hasStarted) {
                boolean player1CurrentCooperation = this.player1.choose(this.player2Cooperated);
                this.player2Cooperated = this.player2.choose(player1CurrentCooperation);

                this.player1Cooperated = player1CurrentCooperation;
            } else {
                this.player1Cooperated = this.player1.choose();
                this.player2Cooperated = this.player2.choose();
                this.hasStarted = true;
            }

            this.addScores();
        }
    }

    /**
     * Adds scores at the end of the round
     */
    private void addScores() {
        if (this.player1Cooperated) {
            this.player1Score--;
            this.player2Score += 3;
        }
        if (this.player2Cooperated) {
            this.player2Score--;
            this.player1Score += 3;
        }
    }
}
