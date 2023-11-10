package gui;

import business.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class LoginWindow extends Application {

    public static void main(String [] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader baseLoader = new FXMLLoader(getClass().getResource("/fxml/loginView.fxml"));
        Screen screen = Screen.getPrimary();
        Parent root = baseLoader.load();
        root.getStyleClass().add("root");
        Rectangle2D bounds = screen.getBounds();
        LoginController baseController = baseLoader.getController();
        baseController.init(primaryStage);
        Scene scene = new Scene(root, bounds.getWidth()/2, bounds.getHeight()/2);
        primaryStage.setTitle("Course Manager");
        primaryStage.setScene(scene);
        primaryStage.setMinWidth(675);
        primaryStage.setMinHeight(480);
        primaryStage.show();
    }
}
