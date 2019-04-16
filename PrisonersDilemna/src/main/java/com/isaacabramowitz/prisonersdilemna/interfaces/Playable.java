package com.isaacabramowitz.prisonersdilemna.interfaces;

/**
 * Represents an iterative game of prisoner's dilemma
 *
 * @author Isaac Abramowitz
 * @version 2019-04-15
 */
public interface Playable {

    /**
     * Starts a series of games of prisoner's dilemna
     *
     * @param turns amount of turns to be played in the match
     * @param player1 the first Player
     * @param player2 the second Player
     */
    public void start(int turns, Player player1, Player player2);

    /**
     * Returns player1's score
     *
     * @return the amount of points they scored
     */
    public int getPlayer1Results();

    /**
     * Returns player2's score
     *
     * @return the amount of points they scored
     */
    public int getPlayer2Results();

    /**
     * Returns the Player object for the 1st player
     *
     * @return the 1st Player
     */
    public Player getPlayer1();

    /**
     * Returns the Player object of the 2nd player
     *
     * @return the 2nd Player
     */
    public Player getPlayer2();
}
