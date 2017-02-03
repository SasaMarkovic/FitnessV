package View;

import javafx.application.Application;
import javafx.scene.Scene;

/**
 * Handled das Package
 * @author Sasa
 *
 */
public class Controller {
	private UserFrame frame;
	private Control.Controller concon;
	
	public Controller(Control.Controller concon){
		
		this.concon = concon;
		frame = new UserFrame();
	}
	public void displayFrame(){
		
		frame.launchFrame(this);
	}
	public String getUserPw(){
		return concon.getusernamepw()[1];
	}
	public String getUserName(){
		return concon.getusernamepw()[0];
	}
}
