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
