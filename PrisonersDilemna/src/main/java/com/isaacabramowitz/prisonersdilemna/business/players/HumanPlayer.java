package com.isaacabramowitz.prisonersdilemna.business.players;

import com.isaacabramowitz.prisonersdilemna.interfaces.Player;
import java.util.Scanner;

/**
 * A Player that gets user input to decide whether to cooperate or defect
 *
 * @author Isaac Abramowitz
 * @version 2019-04-19
 */
public class HumanPlayer implements Player {

    private Scanner scanner;

    /**
     * Creates a new HumanPlayer object
     *
     * @param scanner Scanner for use of user input
     */
    public HumanPlayer(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public boolean choose() {
        while (true) {
            String choice = this.scanner.nextLine();

            switch (choice.toUpperCase()) {
                case "Y":
                    return true;

                case "N":
                    return false;

                default:
                    break;
            }
        }
    }

    @Override
    public boolean choose(boolean opponentPreviousChoice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
