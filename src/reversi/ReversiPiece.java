package reversi;

import javafx.scene.Group;
import javafx.scene.shape.Ellipse;
import javafx.scene.transform.Translate;

/**
 * Created by Kristijan Pajtasev
 * 31/10/2017.
 */
//class definition for a reversi piece
class ReversiPiece extends Group {
    // default constructor for the class
    public ReversiPiece(int player) {

    }

    // overridden version of the resize method to give the piece the correct size
    @Override
    public void resize(double width, double height) {

    }

    // overridden version of the relocate method to position the piece correctly
    @Override
    public void relocate(double x, double y) {

    }

    // public method that will swap the colour and type of this piece
    public void swapPiece() {

    }

    // method that will set the piece type
    public void setPiece(final int type) {

    }

    // returns the type of this piece
    public int getPiece() {
        // NOTE: this is to keep the compiler happy until you get to this point
        return 0;
    }

    // private fields
    private int player;		// the player that this piece belongs to
    private Ellipse piece;	// ellipse representing the player's piece
    private Translate t;	// translation for the player piece
}