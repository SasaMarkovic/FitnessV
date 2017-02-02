package View;

import javafx.application.Application;
import javafx.scene.Scene;

/**
 * Handled das Package
 * @author Sasa
 *
 */
public class Controller {
	UserFrame logframe;
	public Controller(){
		logframe = new UserFrame();
	}
	public void displayLogin(){
		logframe.launchFrame();
	}
}
