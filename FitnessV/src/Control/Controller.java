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
	private View.Controller viewcon;
	private Model.Controller modelcon;
	
	public Controller(){
		viewcon = new View.Controller();
		modelcon = new Model.Controller(viewcon, this);
		
		kalorien = new Kalorienverbrauch();
		bmi = new BMI();
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
}
