package com.zeeshan.qrgenerator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public void click(String file) throws IOException{
        Stage stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(file));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
        stage.getIcons().add(new Image("file:Data\\file.view.logo"));
        stage.setTitle("QR Generator");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Main_fxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getStylesheets().add(getClass().getResource("Style.css").toExternalForm());
        stage.getIcons().add(new Image("file:Data\\file.view.logo"));
        stage.setTitle("QR Generator");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}