/*
* Date: 10/02/2020 Guatemala City
* Developer: Bonifasi, Marcos.
* */

package org.marcosbonifasi.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.marcosbonifasi.controller.MainMenuController;
import org.marcosbonifasi.controller.TotitoController;

import java.io.IOException;
import java.io.InputStream;

public class Main extends Application {
    private static String PACKAGE_VIEWS = "/org/marcosbonifasi/view/";
    Stage primaryStage;
    Scene scene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Totito GT APP");

        mainMenuView();
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    //Setting view
    public void mainMenuView(){
        try {
            MainMenuController mainMenu = (MainMenuController) changeScene("MainMenuView.fxml", 600,600);
            mainMenu.setMainMenu(this);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void totitoView(){
        try {
            TotitoController totitoController = (TotitoController) changeScene("TotitoView.fxml", 700, 700);
            totitoController.setMainMenu(this);
        }catch (Exception e){
            e.printStackTrace();
        }
    }




    //Method to change scenes
    public Initializable changeScene(String fxmlFile, int weidth, int height) throws IOException {
        Initializable result = null;
        FXMLLoader fxmlLoader = new FXMLLoader();
        InputStream file = Main.class.getResourceAsStream(PACKAGE_VIEWS + fxmlFile);
        fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
        fxmlLoader.setLocation(Main.class.getResource(PACKAGE_VIEWS+fxmlFile));
        scene = new Scene((AnchorPane)fxmlLoader.load(file), weidth, height);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        result = (Initializable) fxmlLoader.getController();

        return result;
    }

    //Method main
    public static void main(String[] args) {
        launch(args);
    }
}
