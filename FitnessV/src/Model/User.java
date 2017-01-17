package Model;

public class User {
	
	private String name;
	private String vorname;
	private int alter;
	private double groesse;
	private double gewicht;
	private String passwort;
	
	public User(){
		
	}
	
	public void anmelden(String name, String vorname, int alter, double groesse, double gewicht, String passwort){
		this.setname(name);
		this.setvorname(vorname);
		this.setalter(alter);
		this.setgroesse(groesse);
		this.setgewicht(gewicht);
		this.setpasswort(passwort);
	}
	
	public void changePasswort(String newpw){
		this.setpasswort(newpw);
	}
	
	public void changeGewicht(double newgewicht){
		this.setgewicht(newgewicht);
	}
	
	public String getname(){
		return name;
	}
	
	public String getvorname(){
		return vorname;
	}
	
	public int getalter(){
		return alter;
	}
	
	public double getgroesse(){
		return groesse;
	}
	
	public double getgewicht(){
		return gewicht;
	}
	
	public String getpasswort(){
		return passwort;
	}
	
	public void setname(String args){
		name = args;
	}
	
	public void setvorname(String args){
		vorname = args;
	}
	
	public void setalter(int args){
		alter = args;
	}
	
	public void setgroesse(double args){
		groesse = args;
	}
	
	public void setgewicht(double args){
		gewicht = args;
	}
	
	public void setpasswort(String args){
		passwort = args;
	}
}
