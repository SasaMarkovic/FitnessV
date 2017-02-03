package Model;

/**
 * Handled das Package
 * @author Sasa
 *
 */
public class Controller {
	public User user;
	
	private Control.Controller concon;
	private View.Controller viewcon;
	
	public Controller(View.Controller viewcon, Control.Controller concon){
		user = new User();
		
		this.concon = concon;
		this.viewcon = viewcon;
	}
	
	public void login(String username, String name, String vorname, int alter, double groesse, double gewicht, String passwort){
		user.anmelden(username, name, vorname, alter, groesse, gewicht, passwort);
	}
	
	public void logout(){
		user.abmelden();
	}
	
	public void register(){
		//As soon as the db will be configured
	}
}
