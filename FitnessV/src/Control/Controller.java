package Control;

import View.*;

/**
 * Handled das Package
 * @author Florian
 *
 */
public class Controller {
	
	private Kalorienverbrauch kalorien;
	private BMI bmi;
	public View.Controller viewcon;
	public Model.Controller modelcon;
	
	public Controller(){
		
		modelcon = new Model.Controller(viewcon, this);
		viewcon = new View.Controller(this);
		kalorien = new Kalorienverbrauch();
		bmi = new BMI();
	}
	public String[] getusernamepw(){
		String[] temp = new String[2];
		temp[0] = modelcon.user.getname();
		temp[1] = modelcon.user.getpasswort();
		return temp;
	}
	public double berechneBMI(double gewicht, double groesse){
		return bmi.berechneBMI(gewicht, groesse);
	}
	public double berechneKalorienverbrauch(Model.User user, int schlafen, int liegen, int sitzen, int stehen, int gehen, int sport){
		kalorien.getUserDatas(user);
		kalorien.setPalWerte(schlafen, liegen, sitzen, stehen, gehen, sport);
		kalorien.berechnenKalorierenverbrauch();
		
		return kalorien.getgrundumsatz() + kalorien.getleistungsumsatz();
	}
	public void startProgramm(){
		viewcon.displayFrame();
	}
}
