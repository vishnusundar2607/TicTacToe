package models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int size;
    private List<List<Cell>> board;

    public Board(int size){
        this.size = size;
        createBoard();
    }

    private void createBoard(){
        for(int i=0; i<this.size;i++){
            board.add(new ArrayList<>(this.size));
        }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
