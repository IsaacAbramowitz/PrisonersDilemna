package com.isaacabramowitz.prisonersdilemna.business.players;

import com.isaacabramowitz.prisonersdilemna.interfaces.Player;

/**
 * Player that alternates between cooperating and defecting
 *
 * @author Isaac Abramowitz
 * @version 2019-04-16
 */
public class AlternatingPlayer implements Player {

    private boolean previousChoice;

    /**
     * Creates a new AlternatingPlayer object
     */
    public AlternatingPlayer() {
        this.previousChoice = false;
    }

    @Override
    public boolean choose() {
        this.previousChoice = !this.previousChoice;
        return this.previousChoice;
    }

    @Override
    public boolean choose(boolean opponentPreviousChoice) {
        return this.choose();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
