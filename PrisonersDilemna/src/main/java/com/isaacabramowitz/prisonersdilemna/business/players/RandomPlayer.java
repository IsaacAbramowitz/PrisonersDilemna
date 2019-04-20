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

    /**
     * Creates a new RandomPlayer object
     */
    public RandomPlayer() {
        this.random = new Random();
    }

    @Override
    public boolean choose() {
        return random.nextBoolean();
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
