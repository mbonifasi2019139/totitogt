package org.marcosbonifasi.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.marcosbonifasi.system.Main;

import javax.swing.JOptionPane;
import java.net.URL;
import java.util.ResourceBundle;

public class TotitoController implements Initializable {
    private Main mainMenu;
    private int[][] totitoValues = new int[3][3];
    private int inning = 1;

    @FXML private Button btnGoBack;
    @FXML private ImageView img00;
    @FXML private ImageView img10;
    @FXML private ImageView img20;
    @FXML private ImageView img01;
    @FXML private ImageView img11;
    @FXML private ImageView img21;
    @FXML private ImageView img02;
    @FXML private ImageView img12;
    @FXML private ImageView img22;

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    public void setMainMenu(Main mainMenu) {
        this.mainMenu = mainMenu;
    }

    public void goBack(){
        this.mainMenu.mainMenuView();
    }
    /*functionality*/

    public void onClickImg00(){
        if(img00.getImage() == null) {
            if (fillMatriz(0, 0)) {
                img00.setImage(new Image("/org/marcosbonifasi/image/x.png"));
            } else {
                img00.setImage(new Image("/org/marcosbonifasi/image/o.png"));
            }
        }else {
            JOptionPane.showMessageDialog(null, "Llene otra casilla");
        }
       // isThereAnyWinner();
    }

    public void onClickImg10(){
        if(img10.getImage() == null) {
            if (fillMatriz(0, 1)) {
                img10.setImage(new Image("/org/marcosbonifasi/image/x.png"));
            } else {
                img10.setImage(new Image("/org/marcosbonifasi/image/o.png"));
            }
        }else {
            JOptionPane.showMessageDialog(null, "Llene otra casilla");
        }
      //  isThereAnyWinner();
    }

    public void onClickImg20(){
        if(img20.getImage() == null) {
            if (fillMatriz(0, 2)) {
                img20.setImage(new Image("/org/marcosbonifasi/image/x.png"));
            } else {
                img20.setImage(new Image("/org/marcosbonifasi/image/o.png"));
            }
        }else {
            JOptionPane.showMessageDialog(null, "Llene otra casilla");
        }
       // isThereAnyWinner();
    }
    public void onClickImg01(){
        if(img01.getImage() == null) {
            if (fillMatriz(1, 0)) {
                img01.setImage(new Image("/org/marcosbonifasi/image/x.png"));
            } else {
                img01.setImage(new Image("/org/marcosbonifasi/image/o.png"));
            }
        }else {
            JOptionPane.showMessageDialog(null, "Llene otra casilla");
        }
        //isThereAnyWinner();
    }
    public void onClickimg11(){
        if(img11.getImage() == null) {
            if (fillMatriz(1, 1)) {
                img11.setImage(new Image("/org/marcosbonifasi/image/x.png"));
            } else {
                img11.setImage(new Image("/org/marcosbonifasi/image/o.png"));
            }
        }else {
            JOptionPane.showMessageDialog(null, "Llene otra casilla");
        }
       // isThereAnyWinner();
    }
    public void onClickImg21(){
        if(img21.getImage() == null) {
            if (fillMatriz(1, 2)) {
                img21.setImage(new Image("/org/marcosbonifasi/image/x.png"));
            } else {
                img21.setImage(new Image("/org/marcosbonifasi/image/o.png"));
            }
        }else {
            JOptionPane.showMessageDialog(null, "Llene otra casilla");
        }
       // isThereAnyWinner();
    }
    public void onClickImg02(){
        if(img02.getImage() == null) {
            if (fillMatriz(2, 0)) {
                img02.setImage(new Image("/org/marcosbonifasi/image/x.png"));
            } else {
                img02.setImage(new Image("/org/marcosbonifasi/image/o.png"));
            }
        }else {
            JOptionPane.showMessageDialog(null, "Llene otra casilla");
        }
        //isThereAnyWinner();
    }
    public void onClickImg12(){
        if(img12.getImage() == null) {
            if (fillMatriz(2, 1)) {
                img12.setImage(new Image("/org/marcosbonifasi/image/x.png"));
            } else {
                img12.setImage(new Image("/org/marcosbonifasi/image/o.png"));
            }
        }else {
            JOptionPane.showMessageDialog(null, "Llene otra casilla");
        }
        //isThereAnyWinner();
    }
    public void onClickImg22(){
        if(img22.getImage() == null) {
            if (fillMatriz(2, 2)) {
                img22.setImage(new Image("/org/marcosbonifasi/image/x.png"));
            } else {
                img22.setImage(new Image("/org/marcosbonifasi/image/o.png"));
            }
        }else {
            JOptionPane.showMessageDialog(null, "Llene otra casilla");
        }
        //isThereAnyWinner();
    }


    public boolean fillMatriz(int row, int column){
        boolean result = false;
        totitoValues[row][column] = inning;
        this.inning = (inning == 1) ? 2 : 1;
        result = (inning == 2) ? true : false;

        return result;
    }

    private void isThereAnyWinner(){
        int sumRow = 0;
        int sumColumn = 0;
        int sumDiagonal = 0;

        for (int i = 0; i < totitoValues.length; i++){
            for(int j = 0; j < totitoValues.length; j++){
                sumRow+= totitoValues[i][j];
                System.out.println("matris"+totitoValues[i][j]);
            }
            if(sumRow == 3){
                JOptionPane.showMessageDialog(null, "GANA EL JUGADOR x");
                break;
            }else if (sumRow == 6){
                JOptionPane.showMessageDialog(null, "GANA EL JUGADOR o");
                break;
            }
            sumRow = 0;
        }
    }


}
