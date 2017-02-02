package View;

import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UserFrame extends Application{
	private Stage mainstage;
	private Scene scene;
	
	public void controlFrame(){
		Stage stage = mainstage;
		BorderPane root = new BorderPane();
		HBox hbox = new HBox();
		
	    hbox.setPadding(new Insets(15, 12, 15, 12));
	    hbox.setSpacing(10);

	    Button buttonDiagramme = new Button("Diagramme");
	    buttonDiagramme.setPrefSize(100, 20);

	    Button buttonFormular = new Button("Formular");
	    buttonFormular.setPrefSize(100, 20);
	    
	    Button buttonSettings = new Button("Settings");
	    buttonSettings.setPrefSize(100, 20);
	    hbox.getChildren().addAll(buttonDiagramme, buttonFormular, buttonSettings);
	    
	    hbox.setAlignment(Pos.CENTER);
		
		root.setTop(hbox);
		
		formContent(root);
		
		stage.setScene(new Scene(root,700,675));
	}
	
	public void formContent(BorderPane parent){
		BorderPane pane = new BorderPane();
		
		ObservableList<String> options = 
			    FXCollections.observableArrayList(
			        "Kalorienverbrauch"
			    );
		final ComboBox comboBox = new ComboBox(options);
		comboBox.setItems(options);
		
		HBox hbox = new HBox();
		
	    hbox.setPadding(new Insets(15, 12, 15, 12));
	    hbox.setSpacing(10);
	    
	    hbox.getChildren().addAll(comboBox);
		
		pane.setTop(hbox);
		
		pane.setPadding(new Insets(25, 25, 25, 25));
		
		kalorienverbrauchformContent(pane);
		
		parent.setCenter(pane);
	}
	
	public void kalorienverbrauchformContent(BorderPane paret_child){
		GridPane grid = new GridPane();
		
		Label schlafend_label = new Label("Schlaf in h");
		Label liegend_label = new Label("Liegend in h");
		Label sitzend_kaum_label = new Label ("Sitzend in h");
		Label stehend_label = new Label("Stehend in h");
		Label gehend_label = new Label("Gehend in h");
		Label anstrengende_label = new Label("Anstrengende Arbeit in h");
		
		Label fueller1 = new Label("     ");
		Label fueller2 = new Label("     ");
		Label fueller3 = new Label("     ");
		Label fueller4 = new Label("     ");
		Label fueller5 = new Label("     ");
		Label fueller6 = new Label("     ");
		
		TextField schlafend_field = new TextField();
		TextField liegend_field = new TextField();
		TextField sitzend_kaum_field = new TextField();
		TextField stehend_field = new TextField();
		TextField gehend_field = new TextField();
		TextField anstrengende_field = new TextField();
		
		grid.add(schlafend_label, 0, 1);
		grid.add(fueller1, 1, 1);
		grid.add(schlafend_field, 2, 1);
		
		grid.add(liegend_label, 0, 2);
		grid.add(fueller2, 1, 1);
		grid.add(liegend_field, 2, 2);
		
		grid.add(sitzend_kaum_label, 0, 3);
		grid.add(fueller3, 1, 1);
		grid.add(sitzend_kaum_field, 2, 3);
		
		grid.add(stehend_label, 0, 4);
		grid.add(fueller4, 1, 1);
		grid.add(stehend_field, 2, 4);
		
		grid.add(gehend_label, 0, 5);
		grid.add(fueller5, 1, 1);
		grid.add(gehend_field, 2, 5);
		
		grid.add(anstrengende_label, 0, 6);
		grid.add(fueller6, 1, 1);
		grid.add(anstrengende_field, 2, 6);
		
        Button btn = new Button("Submit");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 2, 8);
		
		paret_child.setCenter(grid);
	}
	
	public void settingsContent(){
		
	}
	
	public void diagrammContent(){
		
	}
	
	public void loginFrame(){
		Stage stage = mainstage;
		
		GridPane grid = new GridPane();
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);
        final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
            	String checkName = userTextField.getText();
            	String checkPw = pwBox.getText();
            	
            	if(checkName.equals("Sasa") && checkPw.equals("123")){
                    actiontarget.setFill(javafx.scene.paint.Color.LIME);
                    actiontarget.setText("Successful");
                    controlFrame();
            	}
            	else{
                    actiontarget.setFill(javafx.scene.paint.Color.FIREBRICK);
                    actiontarget.setText("Failure: Check the Username or Password");
            	}
            }
        });
        Scene scene = new Scene(grid, 700, 675);
        stage.setTitle("Login"); 
        stage.setScene(scene); 
        stage.sizeToScene();
        stage.show(); 
	}
	
	public void launchFrame(){
		Application.launch(null);
	}
    @Override public void start(Stage stage) {
    	mainstage = stage;
    	loginFrame();
    }
}
