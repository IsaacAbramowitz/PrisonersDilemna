package com.isaacabramowitz.prisonersdilemna.business.players;

import com.isaacabramowitz.prisonersdilemna.interfaces.Player;

/**
 * Player who alternates between defecting and cooperating
 *
 * @author Isaac Abramowitz
 * @version 2019-04-16
 */
public class ReverseAlternatingPlayer implements Player {

    private boolean previousChoice;

    @Override
    public boolean choose() {
        this.previousChoice = !this.previousChoice;
        return this.previousChoice;
    }

    @Override
    public boolean choose(boolean opponentPreviousChoice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
