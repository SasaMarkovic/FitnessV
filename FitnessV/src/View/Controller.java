package View;

import javafx.application.Application;
import javafx.scene.Scene;

/**
 * Handled das Package
 * @author Sasa
 *
 */
public class Controller {
	UserFrame frame;
	public Controller(){
		frame = new UserFrame();
	}
	public void displayFrame(){
		frame.launchFrame();
	}
}
