package sample;

import javafx.scene.control.Control;

/**
 * Created by Kristijan Pajtasev
 * 31/10/2017.
 */

//class definition for a custom reversi control
class ReversiControl extends Control {
    // constructor for the class
    public ReversiControl() {
        setSkin(new ReversiControlSkin(this));
    }

    // overridden version of the resize method
    @Override
    public void resize(double width, double height) {

    }

    // private fields of a reversi board
    ReversiBoard rb_board;
}
