package presentationLayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //URL url = new File("Login.fxml").toURI().toURL();
        URL url =getClass().getClassLoader().getResource("Login.fxml");
        Parent root = FXMLLoader.load(url);

        primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root, 356, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
