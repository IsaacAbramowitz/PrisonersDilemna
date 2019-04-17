package com.isaacabramowitz.prisonersdilemna.business.players;

import com.isaacabramowitz.prisonersdilemna.interfaces.Player;

/**
 * Player who decides randomly whether to cooperate or defect
 *
 * @author Isaac Abramowitz
 * @version 2019-04-16
 */
public class RandomPlayer implements Player {

    @Override
    public boolean choose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean choose(boolean opponentPreviousChoice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
