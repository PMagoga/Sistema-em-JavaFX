package projeto.sistema;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

    private static Scene mainScene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("MainView.fxml"));

        ScrollPane scrollPane = fxmlLoader.load();
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);

        mainScene = new Scene(scrollPane, 400, 400);
        stage.setTitle("Sistema JavaFX");
        stage.setScene(mainScene);
        stage.show();
    }

    public static Scene getMainScene(){
        return mainScene;
    }

    public static void main(String[] args) {
        launch();
    }
}