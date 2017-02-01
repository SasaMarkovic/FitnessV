package View;

import javafx.application.Application;
import javafx.scene.Scene;

/**
 * Handled das Package
 * @author Sasa
 *
 */
public class Controller {
	Login logframe;
	public Controller(){
		logframe = new Login();
	}
	public void displayLogin(){
		logframe.launchFrame();
	}
}
