package com.isaacabramowitz.prisonersdilemna.business.players;

import com.isaacabramowitz.prisonersdilemna.interfaces.Player;

/**
 * Player who cooperates on every turn
 *
 * @author Isaac Abramowitz
 * @version 2019-04-16
 */
public class Cooperator implements Player {

    @Override
    public boolean choose() {
        return true;
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
