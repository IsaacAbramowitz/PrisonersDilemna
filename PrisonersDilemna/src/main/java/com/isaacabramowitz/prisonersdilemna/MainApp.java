package com.isaacabramowitz.prisonersdilemna;

import com.isaacabramowitz.prisonersdilemna.business.Game;
import com.isaacabramowitz.prisonersdilemna.business.players.AlternatingPlayer;
import com.isaacabramowitz.prisonersdilemna.business.players.Defector;
import com.isaacabramowitz.prisonersdilemna.business.players.GradualPlayer;
import com.isaacabramowitz.prisonersdilemna.business.players.HumanPlayer;
import com.isaacabramowitz.prisonersdilemna.business.players.MistrustingPlayer;
import com.isaacabramowitz.prisonersdilemna.business.players.RandomPlayer;
import com.isaacabramowitz.prisonersdilemna.business.players.ReverseAlternatingPlayer;
import com.isaacabramowitz.prisonersdilemna.business.players.TitForTatPlayer;
import com.isaacabramowitz.prisonersdilemna.interfaces.Player;
import java.util.Scanner;

/**
 * Main app to run Games
 *
 * @author Isaac Abramowitz
 * @version 2019-04-19
 */
public class MainApp {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Player humanPlayer = new HumanPlayer(scanner);

            Game game = new Game();
            game.start(10, humanPlayer, new AlternatingPlayer());
            printResults(game);

            game.start(10, humanPlayer, new Defector());
            printResults(game);

            game.start(10, humanPlayer, new GradualPlayer());
            printResults(game);

            game.start(10, humanPlayer, new MistrustingPlayer());
            printResults(game);

            game.start(10, humanPlayer, new RandomPlayer());
            printResults(game);

            game.start(10, humanPlayer, new ReverseAlternatingPlayer());
            printResults(game);

            game.start(10, humanPlayer, new TitForTatPlayer());
            printResults(game);
        }
    }

    private static void printResults(Game game) {
        System.out.println(game.getPlayer1Results());
        System.out.println(game.getPlayer2Results());
    }
}
