package reversi;

import javafx.scene.control.Control;

/**
 * Created by Kristijan Pajtasev
 * 31/10/2017.
 */

//class definition for a custom reversi control
class ReversiControl extends Control {
    private final ReversiBoard reversiBoard;

    // constructor for the class
    public ReversiControl() {
        setSkin(new ReversiControlSkin(this));
        reversiBoard = new ReversiBoard();
        getChildren().add(reversiBoard);

        // TODO: add click handler which calls placePiece - pt 4
        // TODO: add press handler which calls reset when space is clicked - pt 4
    }

    // overridden version of the resize method
    @Override
    public void resize(double width, double height) {
        super.resize(width, height);
        reversiBoard.resize(width, height);
    }

}
