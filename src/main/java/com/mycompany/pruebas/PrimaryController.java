package com.mycompany.pruebas;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class PrimaryController {
    
    @FXML
    private Button botonGuardar;
    
    @FXML
    private Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    
    @FXML
    private Label display;
    
    @FXML
    private CheckBox checkAcepto = new CheckBox("Acepto los términos");
    
    @FXML
    private ComboBox<String> comboPoblacion = new ComboBox<>();
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
        
        alerta.setHeaderText(null);
        alerta.setContentText("Se ha cambiado a la ventana 2");
        alerta.showAndWait();
    }
    
    @FXML
    private void initialize(){
        checkAcepto.setOnAction(evento ->
        botonGuardar.setDisable(!checkAcepto.isSelected()));
        
        comboPoblacion.getItems().addAll("Alpedrete","Collado Villalba","Galapagar","Colmenarejo","El Escorial","Cerceda","Cercedilla","Guadarrama","Torrelodones","Las Rozas","Majadahonda","Moralzarzal","El Bolao","Navacerrada","Becerril","Navalquejigo","El Guijo","Los Arroyos","Los Negrales","El gorronal","Pitis","Pozuelo","La Navata","");
        comboPoblacion.setValue("Población");
    }
    
    @FXML
    private void mostrar() {
        display.setText("Has seleccionado " +comboPoblacion.getValue());
        alerta.setHeaderText(null);
        alerta.setContentText("Has seleccionado una población");
        alerta.showAndWait();
    }
    
    /*@FXML
    private void initialize(){
        checkAcepto.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent evento){
                if (checkAcepto.isSelected()){
                     botonGuardar.setDisable(false);
                 } else {
                       botonGuardar.setDisable(true);
        
                }
            }
        });
    }*/
}
