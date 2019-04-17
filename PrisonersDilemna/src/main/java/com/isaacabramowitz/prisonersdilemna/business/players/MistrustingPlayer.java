package com.isaacabramowitz.prisonersdilemna.business.players;

import com.isaacabramowitz.prisonersdilemna.interfaces.Player;

/**
 * Player who first defects, then copies their opponent's last choice
 *
 * @author Isaac Abramowitz
 * @version 2019-04-16
 */
public class MistrustingPlayer implements Player {

    @Override
    public boolean choose() {
        return false;
    }

    @Override
    public boolean choose(boolean opponentPreviousChoice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
