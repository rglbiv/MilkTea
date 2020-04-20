import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;

public class Main extends Application {

    public static Main classOf;

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("project/fxml/LoginScreen.fxml"));
        primaryStage.setTitle("Taste from the Greens");
        primaryStage.setScene(new Scene(root));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
        classOf=this;
    }

    public static Main getMain(){
        return classOf;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
