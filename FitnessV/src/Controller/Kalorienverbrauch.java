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
	
	
	//PAL WErte
	private double sitzend_liegend;
	private double sitzend_kaum;
	private double sitzend_gehend_stehend;
	private double stehend_gehend;
	private double anstrengende_arbeit;
	
	public Kalorienverbrauch(){
		sitzend_liegend = 1.2;
		sitzend_kaum = 1.45;
		sitzend_gehend_stehend = 1.65;
		stehend_gehend = 1.85;
	}
	
	public void berechnegrundumsatzMann(){
		this.grundumsatz = 66.47 + (13.7 * this.gewicht) + (5 * this.groesse) - (6.8 * alter);
	}
	
	public void berechnegrundumsatzFrau(){
		this.grundumsatz = 655.1 + (9.6 * this.gewicht) + (1.8 * this.groesse) - (4.7 * this.alter);
	}
	
	public void berechneleistungsumsatz(){
		
	}
}
