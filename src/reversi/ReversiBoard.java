package reversi;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;

/**
 * Created by Kristijan Pajtasev
 * 31/10/2017.
 */
//class definition for the reversi board
class ReversiBoard extends Pane {
    // default constructor for the class
    public ReversiBoard() {
        render = new ReversiPiece[8][8];
        surrounding = new int[3][3];
        can_reverse = new boolean[3][3];

        background = new Rectangle();

        horizontal = new Line[8];
        horizontal_t = new Translate[8];
        vertical = new Line[8];
        vertical_t = new Translate[8];

        initialiseLinesBackground();

        initialiseRender();

        resetGame();
    }

    // public method that will try to place a piece in the given x,y coordinate
    public void placePiece(final double x, final double y) {
    }

    // overridden version of the resize method to give the board the correct size
    @Override
    public void resize(double width, double height) {
        super.resize(width, height);

        cell_width = width / 8.0;
        cell_height = height / 8.0;

        background.setWidth(width);
        background.setHeight(height);

        horizontalResizeRelocate(width);

        verticalResizeRelocate(height);

        pieceResizeRelocate();
    }

    // public method for resetting the game
    public void resetGame() {
        resetRenders();

        render[3][3].setPiece(1);
        render[4][4].setPiece(1);

        render[3][4].setPiece(2);
        render[4][3].setPiece(2);
    }

    // private method that will reset the renders
    private void resetRenders() {
        for(int i = 0; i < 8; i++)
            for(int j = 0; j < 8; j++) render[i][j].setPiece(0);
    }

    // private method that will initialise the background and the lines
    private void initialiseLinesBackground() {
        background.setFill(Color.CYAN);
        getChildren().addAll(background);

        for(int i = 0; i < 8; i++) {
            horizontal[i] = new Line();
            horizontal[i].setStroke(Color.WHITE);
            horizontal[i].setStartX(0);
            horizontal[i].setStartY(0);
            horizontal[i].setEndY(0);
            horizontal_t[i] = new Translate(0,0);
            horizontal[i].getTransforms().add(horizontal_t[i]);
            getChildren().add(horizontal[i]);
        }

        for(int i = 0; i < 8; i++) {
            vertical[i] = new Line();
            vertical[i].setStroke(Color.WHITE);
            vertical[i].setStartX(0);
            vertical[i].setStartY(0);
            vertical[i].setEndX(0);
            vertical_t[i] = new Translate(0,0);
            vertical[i].getTransforms().add(vertical_t[i]);
            getChildren().add(vertical[i]);
        }
    }

    // private method for resizing and relocating the horizontal lines
    private void horizontalResizeRelocate(final double width) {
        for(int i = 0; i < 8; i++) {
            horizontal_t[i].setY((i + 1) * cell_height);
            horizontal[i].setEndX(width);
        }
    }

    // private method for resizing and relocating the vertical lines
    private void verticalResizeRelocate(final double height) {
        for(int i = 0; i < 8; i++) {
            vertical_t[i].setX((i + 1) * cell_width);
            vertical[i].setEndY(height);
        }
    }

    // private method for swapping the players
    private void swapPlayers() {

    }

    // private method for updating the player scores
    private void updateScores() {

    }

    // private method for resizing and relocating all the pieces
    private void pieceResizeRelocate() {

    }

    // private method for determining which pieces surround x,y will update the
    // surrounding array to reflect this
    private void determineSurrounding(final int x, final int y) {

    }

    // private method for determining if a reverse can be made will update the can_reverse
    // array to reflect the answers will return true if a single reverse is found
    private boolean determineReverse(final int x, final int y) {
        // NOTE: this is to keep the compiler happy until you get to this part
        return false;
    }

    // private method for determining if a reverse can be made from a position (x,y) for
    // a player piece in the given direction (dx,dy) returns true if possible
    // assumes that the first piece has already been checked
    private boolean isReverseChain(final int x, final int y, final int dx, final int dy, final int player) {
        // NOTE: this is to keep the compiler happy until you get to this part
        return false;
    }

    // private method for determining if any of the surrounding pieces are an opposing
    // piece. if a single one exists then return true otherwise false
    private boolean adjacentOpposingPiece() {
        // NOTE: this is to keep the compiler happy until you get to this part
        return false;
    }

    // private method for placing a piece and reversing pieces
    private void placeAndReverse(final int x, final int y) {

    }

    // private method to reverse a chain
    private void reverseChain(final int x, final int y, final int dx, final int dy) {

    }

    // private method for getting a piece on the board. this will return the board
    // value unless we access an index that doesnt exist. this is to make the code
    // for determing reverse chains much easier
    private int getPiece(final int x, final int y) {
        // NOTE: this is to keep the compiler happy until you get to this point
        return 0;
    }

    // private method that will determine if the end of the game has been reached
    private void determineEndGame() {

    }

    // private method to determine if a player has a move available
    private boolean canMove() {
        // NOTE: this is to keep the compiler happy until you get to this part
        return false;
    }

    // private method that determines who won the game
    private void determineWinner() {

    }

    // private method that will initialise everything in the render array
    private void initialiseRender() {
        for(int i = 0; i < 8; i++)
            for(int j = 0; j < 8; j++) render[i][j] = new ReversiPiece(0);
    }


    // private fields that make the reversi board work

    // rectangle that makes the background of the board
    private Rectangle background;
    // arrays for the lines that makeup the horizontal and vertical grid lines
    private Line[] horizontal;
    private Line[] vertical;
    // arrays holding translate objects for the horizontal and vertical grid lines
    private Translate[] horizontal_t;
    private Translate[] vertical_t;
    // arrays for the internal representation of the board and the pieces that are
    // in place
    private ReversiPiece[][] render;
    // the current player who is playing and who is his opposition
    private int current_player;
    private int opposing;
    // is the game currently in play
    private boolean in_play;
    // current scores of player 1 and player 2
    private int player1_score;
    private int player2_score;
    // the width and height of a cell in the board
    private double cell_width;
    private double cell_height;
    // 3x3 array that holds the pieces that surround a given piece
    private int[][] surrounding;
    // 3x3 array that determines if a reverse can be made in any direction
    private boolean[][] can_reverse;
}