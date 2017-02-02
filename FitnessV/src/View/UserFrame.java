package View;

import com.sun.prism.paint.Color;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
	    hbox.setStyle("-fx-border-color: black;");

	    Button buttonDiagramme = new Button("Diagramme");
	    buttonDiagramme.setPrefSize(100, 20);

	    Button buttonFormular = new Button("Formular");
	    buttonFormular.setPrefSize(100, 20);
	    
	    Button buttonSettings = new Button("Settings");
	    buttonSettings.setPrefSize(100, 20);
	    hbox.getChildren().addAll(buttonDiagramme, buttonFormular, buttonSettings);

		
		root.setTop(hbox);
		
		stage.setScene(new Scene(root,500,500));
	}
	
	public void formContent(){
		
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
        Scene scene = new Scene(grid, 500, 475);
        stage.setMaxHeight(475);
        stage.setMaxWidth(500);
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
