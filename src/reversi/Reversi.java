package reversi;

//an experiment to see how much JavaFX code is required
//to build a game of reversi

//imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

//class defnition for reversi game
public class Reversi extends Application {
	private StackPane stackPane;
	private ReversiControl reversiControl;

	// overridden init method
	public void init() {
		stackPane = new StackPane();
		reversiControl = new ReversiControl();
		stackPane.getChildren().add(reversiControl);
	}
	
	// overridden start method
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Reversi");
		// TODO: update to 800x800
		primaryStage.setScene(new Scene(stackPane, 400, 400));
		primaryStage.show();
	}
	
	// overridden stop method
	public void stop() {
		
	}
	
	// entry point into our program for launching our javafx applicaton
	public static void main(String[] args) {
		launch(args);
	}
	
	// private fields for a stack pane and a reversi control
	private StackPane sp_mainlayout;
	private ReversiControl rc_reversi;
	
}




