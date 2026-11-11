package com.mycompany.pruebas;

import java.io.IOException;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class PrimaryController {
    
    /*@FXML
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
    private RadioButton rbMañana = new RadioButton("Mañana");
            
    @FXML
    private RadioButton rbTarde = new RadioButton("Tarde");
    
    @FXML
    private RadioButton rbNoche = new RadioButton("Noche");
    
    @FXML
    VBox filas = new VBox(8);*/
    @FXML
    private TextField campoNombre;
    
    @FXML
    private ListView<String> listaContactos;
    
    @FXML 
    private ObservableList<String> contactos = FXCollections.observableArrayList();
    
    @FXML
    private Button botonAnadir;
    
    /*@FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
        
        alerta.setHeaderText(null);
        alerta.setContentText("Se ha cambiado a la ventana 2");
        alerta.showAndWait();
    }*/
    
    @FXML
    private void initialize(){
        /*checkAcepto.setOnAction(evento ->
        botonGuardar.setDisable(!checkAcepto.isSelected()));
        
        comboPoblacion.getItems().addAll("Alpedrete","Collado Villalba","Galapagar","Colmenarejo","El Escorial","Cerceda","Cercedilla","Guadarrama","Torrelodones","Las Rozas","Majadahonda","Moralzarzal","El Bolao","Navacerrada","Becerril","Navalquejigo","El Guijo","Los Arroyos","Los Negrales","El gorronal","Pitis","Pozuelo","La Navata","");
        comboPoblacion.setValue("Población");
        
        ToggleGroup grupoTurno = new ToggleGroup();
        rbMañana.setToggleGroup(grupoTurno);
        rbTarde.setToggleGroup(grupoTurno);
        rbNoche.setToggleGroup(grupoTurno);
        RadioButton elegido = (RadioButton) grupoTurno.getSelectedToggle();
        if (elegido == null){
            
        for (int i = 1; i <= 30; i++){
            filas.getChildren().add(new Label("Fila" + i));
        }
        ScrollPane scroll = new ScrollPane(filas);
        scroll.setFitToWidth(true);
        }*/
        listaContactos.setItems(contactos);
        botonAnadir.disableProperty().bind(Bindings.isEmpty(campoNombre.textProperty()));
    }
    
    /*@FXML
    private void mostrar() {
        display.setText("Has seleccionado " +comboPoblacion.getValue());
        alerta.setHeaderText(null);
        alerta.setContentText("Has seleccionado una población");
        alerta.showAndWait();
    }*/
    
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
    
    @FXML
    private void alPulsarAnadir(ActionEvent evento){
        Contacto nuevo = new Contacto(campoNombre.getText(), "", "", "Persional");
        contactos.add(nuevo.toString());
        campoNombre.setText("");
    }
}
