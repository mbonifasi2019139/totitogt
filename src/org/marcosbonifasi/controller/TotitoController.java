package org.marcosbonifasi.controller;

import javafx.fxml.Initializable;
import org.marcosbonifasi.system.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class TotitoController implements Initializable {
    private Main mainMenu;


    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    public void setMainMenu(Main mainMenu) {
        this.mainMenu = mainMenu;
    }
}
