package com.isaacabramowitz.prisonersdilemna.business.players;

import com.isaacabramowitz.prisonersdilemna.interfaces.Player;

/**
 * Player who always defects
 *
 * @author Isaac Abramowitz
 * @version 2019-04-16
 */
public class Defector implements Player {

    @Override
    public boolean choose() {
        return false;
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
