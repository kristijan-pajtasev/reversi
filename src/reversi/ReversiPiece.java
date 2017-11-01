package reversi;

import javafx.scene.Group;
import javafx.scene.paint.Color;
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
        t = new Translate();
        piece = new Ellipse();
        piece.getTransforms().add(t);
        setPiece(player);
        getChildren().add(piece);
    }

    // overridden version of the resize method to give the piece the correct size
    @Override
    public void resize(double width, double height) {
        super.resize(width, height);

        piece.setCenterX(width / 2);
        piece.setCenterY(width / 2);

        piece.setRadiusX(width / 2);
        piece.setRadiusY(height / 2);
    }

    // overridden version of the relocate method to position the piece correctly
    @Override
    public void relocate(double x, double y) {
        super.relocate(x, y);
        t.setX(x);
        t.setY(y);
    }

    // public method that will swap the colour and type of this piece
    public void swapPiece() {
        if(player == 1) setPiece(2);
        else setPiece(1);
    }

    // method that will set the piece type
    public void setPiece(final int type) {
        player = type;

        switch(type) {
            case 0:
                piece.setFill(Color.TRANSPARENT);
                break;
            case 1:
                piece.setFill(Color.WHITE);
                break;
            case 2:
                piece.setFill(Color.BLACK);
                break;
        }
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