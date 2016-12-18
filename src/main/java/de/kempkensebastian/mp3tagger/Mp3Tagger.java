package de.kempkensebastian.mp3tagger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import de.kempkensebastian.mp3tagger.context.AppConfiguration;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Mp3Tagger extends Application {
	
    private AbstractApplicationContext context ;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void stop() {
        context.close();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    	context = new AnnotationConfigApplicationContext(AppConfiguration.class);
    	
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/MainView.fxml"));
    	fxmlLoader.setControllerFactory(context::getBean);
    	Pane root = (Pane) fxmlLoader.load();
//    	Pane root = (Pane) FXMLLoader.load(getClass().getResource("/MainView.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add("/Style.css");
		primaryStage.setScene(scene);
		primaryStage.show();
    }
}
