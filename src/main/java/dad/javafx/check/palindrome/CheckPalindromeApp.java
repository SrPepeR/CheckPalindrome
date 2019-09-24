package dad.javafx.check.palindrome;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckPalindromeApp extends Application {
	
	private TextField sentenciaText;
	private Button palindromoButton;
	private Label respuestaLabel;
	
	public void start(Stage primaryStage) throws Exception {
		
		sentenciaText = new TextField();
		sentenciaText.setPromptText("Introduce una sentencia");
		sentenciaText.setMaxWidth(150);
		
		respuestaLabel = new Label("");
		
		palindromoButton = new Button("COMPROBAR");
		palindromoButton.setDefaultButton(true);
		
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(sentenciaText, palindromoButton, respuestaLabel);
		
		Scene scene = new Scene(root, 320, 200);
		primaryStage.setTitle("CheckPalindrome");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		palindromoButton.setOnAction( e -> onpalindromoButtonAction(e));

	}

	private void onpalindromoButtonAction(ActionEvent e) {
		
		String sentencia = sentenciaText.getText();
		boolean esPalindromo = checkPalindrome(sentencia);
		
		if( esPalindromo ) {
			respuestaLabel.setText("Es palíndromo");
			respuestaLabel.setStyle("-fx-text-fill: green; -fx-font: italic bold 15 consolas;");
		}else {
			respuestaLabel.setText("NO es palíndromo");
			respuestaLabel.setStyle("-fx-text-fill: red; -fx-font: italic bold 15 consolas;");
		}
		
	}

	public static void main(String[] args) {
		
		launch(args);

	}
	
	private boolean checkPalindrome(String inputString) {
	    
	    boolean esPalindromo = true;
		    
		    System.out.println( inputString );
			    
			    int i = 0;
			    int e = inputString.length() - 1;
			    /*System.out.println(e);*/
			    
			    if( inputString.length() == 0 ) {
			    	esPalindromo = false;
			    }else {
	                
	                if( inputString.length() == 1 ){
	                    
	                }else{
	                    
	                    while( i < e && esPalindromo == true ){
				        
	    			        if( inputString.charAt(i) == inputString.charAt(e) ){
			    	            
				                i++;
				                e--;
				                
				           }else{
				              esPalindromo = false;
				             }
	                    
	                     }
				        
				    }
			    }
	    
	    return esPalindromo;
	    
	}

}
