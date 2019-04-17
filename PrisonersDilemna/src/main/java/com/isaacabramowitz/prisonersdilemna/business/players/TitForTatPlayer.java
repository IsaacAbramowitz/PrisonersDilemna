package com.isaacabramowitz.prisonersdilemna.business.players;

import com.isaacabramowitz.prisonersdilemna.interfaces.Player;

/**
 * Player who first cooperates, then copies their opponent's last choice
 *
 * @author Isaac Abramowitz
 * @version 2019-04-16
 */
public class TitForTatPlayer implements Player {

    @Override
    public boolean choose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean choose(boolean opponentPreviousChoice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
