package models;

import strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private List<Move> moves;
    private List<Player> players;

    private int nextPlayerIndex;
    private GameState gameState;
    private Player winner;
    private List<WinningStrategy> winningStrategies;


    Game(int dimension,List<Player> players, List<WinningStrategy> winningStrategies ){
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.board = new Board(dimension);
        this.moves = new ArrayList<>();
        this.nextPlayerIndex = 0;
        this.gameState = GameState.INIT;
    }



}
