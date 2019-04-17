package com.isaacabramowitz.prisonersdilemna.business.players;

import com.isaacabramowitz.prisonersdilemna.interfaces.Player;
import java.util.Random;

/**
 * Player who decides randomly whether to cooperate or defect
 *
 * @author Isaac Abramowitz
 * @version 2019-04-16
 */
public class RandomPlayer implements Player {

    private Random random;

    @Override
    public boolean choose() {
        return random.nextBoolean();
    }

    @Override
    public boolean choose(boolean opponentPreviousChoice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
