package Control;

public class BMI {
	private double bmi;
	
	public BMI(){
		
	}
	
	public double berechneBMI(double gewicht, double groesse){
		double koerpergewicht = gewicht;
		double koerpergroesse = groesse;
		this.bmi = koerpergewicht / (koerpergroesse * koerpergroesse);
		return bmi;
	}
	
	public double getbmi(){
		return this.bmi;
	}
	
	public void setbmi(double args){
		this.bmi = args;
	}
}
