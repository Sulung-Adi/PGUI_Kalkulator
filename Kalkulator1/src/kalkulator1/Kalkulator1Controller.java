/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author SulungAdi
 */
public class Kalkulator1Controller implements Initializable {

    @FXML
    private TextArea display;
    @FXML
    private Button btnTujuh;
    @FXML
    private Button btnDelapan;
    @FXML
    private Button btnSembilan;
    @FXML
    private Button btnKali;
    @FXML
    private Button btnEmpat;
    @FXML
    private Button btnLima;
    @FXML
    private Button btnEnam;
    @FXML
    private Button btnMin;
    @FXML
    private Button btnSatu;
    @FXML
    private Button btnDua;
    @FXML
    private Button btnTiga;
    @FXML
    private Button btnPlus;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnNol;
    @FXML
    private Button btnBagi;
    @FXML
    private Button btnEnter;
    private int angka1 = 0;
    private int angka2 = 0;
    private String operasi = "netral";
    private int hasil;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonClicked(ActionEvent event) {
        if(event.getSource()== btnNol){
            if(!display.getText().isBlank()){
                display.setText(display.getText()+"0");
            }
        }
        else if(event.getSource()== btnSatu){
            display.setText(display.getText()+"1");
        }
        else if(event.getSource()== btnDua){
            display.setText(display.getText()+"2");
        }
        else if(event.getSource()== btnTiga){
            display.setText(display.getText()+"3");
        }
        else if(event.getSource()== btnEmpat){
            display.setText(display.getText()+"4");
        }
        else if(event.getSource()== btnLima){
            display.setText(display.getText()+"5");
        }
        else if(event.getSource()== btnEnam){
            display.setText(display.getText()+"6");
        }
        else if(event.getSource()== btnTujuh){
            display.setText(display.getText()+"7");
        }
        else if(event.getSource()== btnDelapan){
            display.setText(display.getText()+"8");
        }
        else if(event.getSource()== btnSembilan){
            display.setText(display.getText()+"9");
        }
        else if(event.getSource()== btnPlus){
            angka1 = Integer.parseInt(display.getText());
            operasi = "plus";
            display.setText("");
        }
        else if(event.getSource()== btnMin){
            angka1 = Integer.parseInt(display.getText());
            operasi = "min";
            display.setText("");
        }
        else if(event.getSource()== btnKali){
            angka1 = Integer.parseInt(display.getText());
            operasi = "kali";
            display.setText("");
        }
        else if(event.getSource()== btnBagi){
            angka1 = Integer.parseInt(display.getText());
            operasi = "bagi";
            display.setText("");
        }
        else if(event.getSource()== btnClear){
            display.setText("");
        }
        else if(event.getSource()== btnEnter){
            angka2 = Integer.parseInt(display.getText());
            if(operasi.equals("plus")){
                hasil = angka1 + angka2;
            }
            if(operasi.equals("min")){
                hasil = angka1 - angka2;
            }
            if(operasi.equals("kali")){
                hasil = angka1 * angka2;
            }
            if(operasi.equals("bagi")){
                hasil = angka1 / angka2;
            }
            display.setText(String.valueOf(hasil));
            operasi = "netral";
        }
        
    }
    
}
