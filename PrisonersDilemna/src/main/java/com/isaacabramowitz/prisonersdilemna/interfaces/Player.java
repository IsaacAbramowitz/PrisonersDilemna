package com.isaacabramowitz.prisonersdilemna.interfaces;

/**
 * Represents a player of a prisoner's dilemma game
 *
 * @author Isaac Abramowitz
 * @version 2019-04-15
 */
public interface Player {

    /**
     * Player either chooses to cooperate or defect
     *
     * @return true if cooperating, else false
     */
    public boolean choose();

    /**
     * Player either chooses to cooperate or defect
     *
     * @param opponentPreviousChoice true if opponent cooperated last turn, else
     * false
     * @return true if cooperating, else false
     */
    public boolean choose(boolean opponentPreviousChoice);
}
