package com.isaacabramowitz.prisonersdilemna.business.players;

import com.isaacabramowitz.prisonersdilemna.interfaces.Player;

/**
 * Player who defects according to the amount of times their opponent has
 * defected
 *
 * @author Isaac Abramowitz
 * @version 2019-04-16
 */
public class GradualPlayer implements Player {

    @Override
    public boolean choose() {
        return true;
    }

    @Override
    public boolean choose(boolean opponentPreviousChoice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
