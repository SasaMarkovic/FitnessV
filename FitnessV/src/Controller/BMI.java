package Controller;

public class BMI {
	
	private double koerpergewicht;
	private double koerpergroesse;
	
	private double bmi;
	
	public BMI(){
		
	}
	
	public void berechneBMI(){
		this.bmi = koerpergewicht / (koerpergroesse * koerpergroesse);
	}
	
	public double getbmi(){
		return this.bmi;
	}
	
	public double getkoerpergewicht(){
		return this.koerpergewicht;
	}
	
	public double getkoerpergroesse(){
		return this.koerpergroesse;
	}
	
	public void setbmi(double args){
		this.bmi = args;
	}
	
	public void setkoerpergewicht(double args){
		this.koerpergewicht = args;
	}
	
	public void setkoerpergroesse(double args){
		this.koerpergroesse = args;
	}
}
