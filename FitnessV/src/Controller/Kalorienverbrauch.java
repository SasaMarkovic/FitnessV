package Controller;
//http://www.sportunterricht.ch/Theorie/Energie/energie.php
public class Kalorienverbrauch {
	
	//kcal/24h
	private double grundumsatz;
	private double leistungsumsatz;
	
	private String geschlecht;
	//in cm
	private double groesse;
	//in kg
	private double gewicht;
	private int alter;
	
	
	//PAL WErte (Multiplikatoren)
	private double schlafen;
	private double sitzend_liegend;
	private double sitzend_kaum;
	private double sitzend_gehend_stehend;
	private double stehend_gehend;
	private double anstrengende_arbeit;
	
	//PAL Werte pro Stunde
	private int schlafen_hours;
	private int sitzend_liegend_hours;
	private int sitzend_kaum_hours;
	private int sitzend_gehend_stehend_hours;
	private int stehend_gehend_hours;
	private int anstrengende_arbeit_hours;
	
	public Kalorienverbrauch(){
		schlafen = 1;
		sitzend_liegend = 1.3;
		sitzend_kaum = 1.5;
		sitzend_gehend_stehend = 1.7;
		stehend_gehend = 1.9;
		anstrengende_arbeit = 2.4;
	}
	
	public void berechnegrundumsatzMann(){
		this.grundumsatz = 66.47 + 13.7 * this.gewicht + 5 * this.groesse - 6.8 * this.alter;
	}
	
	public void berechnegrundumsatzFrau(){
		this.grundumsatz = 655.1 + 9.6 * this.gewicht + 1.8 * this.groesse - 4.7 * this.alter;
	}
	
	public void berechneleistungsumsatz(){
		double multiplikator = ((schlafen * schlafen_hours)+(sitzend_liegend * sitzend_liegend_hours) + (sitzend_kaum * sitzend_kaum_hours) + (sitzend_gehend_stehend * 
				sitzend_gehend_stehend_hours) + (stehend_gehend * stehend_gehend_hours) + (anstrengende_arbeit_hours * anstrengende_arbeit))/24;
		this.leistungsumsatz = multiplikator;
	}
	public void berechnenKalorierenverbrauch(){
		switch(geschlecht){
		case "Mann":
			berechnegrundumsatzMann();
			berechneleistungsumsatz();
			break;
		case "Frau":
			berechnegrundumsatzFrau();
			berechneleistungsumsatz();
			break;
		}
	}
	public double getgrundumsatz(){
		return grundumsatz;
	}
	
	public double getleistungsumsatz(){
		return leistungsumsatz;
	}
	
	public String getgeschlecht(){
		return geschlecht;
	}
	
	public double getgroesse(){
		return groesse;
	}
	
	public double getgewicht(){
		return gewicht;
	}
	
	public int getalter(){
		return alter;
	}
	
	public double getschlafen(){
		return schlafen;
	}
	
	public double getsitzend_liegend(){
		return sitzend_liegend;
	}
	
	public double getsitzend_kaum(){
		return sitzend_kaum;
	}
	
	public double getsitzend_gehend_stehend(){
		return sitzend_gehend_stehend;
	}
	
	public double getstehend_gehend(){
		return stehend_gehend;
	}
	
	public double getanstrengende_arbeit(){
		return anstrengende_arbeit;
	}
	
	public int getschlafen_hours(){
		return schlafen_hours;
	}
	
	public int getsitzend_liegend_hours(){
		return sitzend_liegend_hours;
	}
	
	public int getsitzend_kaum_hours(){
		return sitzend_kaum_hours;
	}
	
	public int getsitzend_gehend_stehend_hours(){
		return sitzend_gehend_stehend_hours;
	}
	
	public int getstehend_gehend_hours(){
		return stehend_gehend_hours;
	}
	
	public int getanstrengende_arbeit_hours(){
		return anstrengende_arbeit_hours;
	}
	//Setter
	public void setgrundumsatz(double args){
		grundumsatz = args;
	}
	
	public void setleistungsumsatz(double args){
		leistungsumsatz = args;
	}
	
	public void setgeschlecht(String args){
		geschlecht = args;
	}
	
	public void setgroesse(double args){
		groesse = args;
	}
	
	public void setgewicht(double args){
		gewicht = args;
	}
	
	public void setalter(int args){
		alter = args;
	}
	
	public void setschlafen(double args){
		schlafen = args;
	}
	
	public void setsitzend_liegend(double args){
		sitzend_liegend = args;
	}
	
	public void setsitzend_kaum(double args){
		sitzend_kaum = args;
	}
	
	public void setsitzend_gehend_stehend(double args){
		sitzend_gehend_stehend = args;
	}
	
	public void setstehend_gehend(double args){
		stehend_gehend = args;
	}
	
	public void setanstrengende_arbeit(double args){
		anstrengende_arbeit = args;
	}
	
	public void setschlafen_hours(int args){
		schlafen_hours = args;
	}
	
	public void setsitzend_liegend_hours(int args){
		sitzend_liegend_hours = args;
	}
	
	public void setsitzend_kaum_hours(int args){
		sitzend_kaum_hours = args;
	}
	
	public void setsitzend_gehend_stehend_hours(int args){
		sitzend_gehend_stehend_hours = args;
	}
	
	public void setstehend_gehend_hours(int args){
		stehend_gehend_hours = args;
	}
	
	public void setanstrengende_arbeit_hours(int args){
		anstrengende_arbeit_hours = args;
	}
}
