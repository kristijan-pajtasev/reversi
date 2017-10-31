package reversi;

import javafx.scene.control.SkinBase;

/**
 * Created by Kristijan Pajtasev
 * 31/10/2017.
 */
//class definition for a skin for the reversi control
//NOTE: to keep JavaFX happy we dont use the skin here
class ReversiControlSkin extends SkinBase<ReversiControl> {
    // default constructor for the class
    public ReversiControlSkin(ReversiControl rc) {
        super(rc);
    }
}

