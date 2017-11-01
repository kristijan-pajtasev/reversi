package reversi;

import javafx.event.EventHandler;
import javafx.scene.control.Control;
import javafx.scene.input.MouseEvent;

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

        setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                reversiBoard.placePiece(event.getX(), event.getY());
            }
        });

        // TODO: add press handler which calls reset when space is clicked - pt 4
    }

    // overridden version of the resize method
    @Override
    public void resize(double width, double height) {
        super.resize(width, height);
        reversiBoard.resize(width, height);
    }

}
