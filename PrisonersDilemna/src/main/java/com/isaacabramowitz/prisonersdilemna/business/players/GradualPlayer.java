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

    private int opponentDefectCount;
    private boolean currentlyDefecting;
    private int i;

    @Override
    public boolean choose() {
        return true;
    }

    @Override
    public boolean choose(boolean opponentPreviousChoice) {
        if (this.currentlyDefecting) {
            this.i--;

            this.currentlyDefecting = this.i >= 0;

            return this.i < 1;
        }
        if (!opponentPreviousChoice) {
            this.opponentDefectCount++;
            this.currentlyDefecting = true;
            this.i = this.opponentDefectCount;
            return false;
        }
        return true;
    }
}
