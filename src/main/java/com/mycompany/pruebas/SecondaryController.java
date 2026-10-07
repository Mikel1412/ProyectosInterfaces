package com.mycompany.pruebas;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class SecondaryController {

    @FXML
    private Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
        
        alerta.setHeaderText(null);
        alerta.setContentText("Se ha cambiado a la ventana 1");
        alerta.showAndWait();
    }
}