package com.mycompany.proyectodeaula;

import Logica.LogicaUsuario;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable {

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtContraseña;
    @FXML private Button btnIniciarSesion;
    @FXML private Button btnObservador;
    private LogicaUsuario logicaUsuario = new LogicaUsuario();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void clickBtnIniciarSesion() throws IOException {
        String username = this.txtUsuario.getText();
        String password = this.txtContraseña.getText();

        if (this.logicaUsuario.loginAdmin(username, password)) {
            //App.setStage("home");
            App.setNewScene("menuAdmin");
        } else 
             if (this.logicaUsuario.loginProveedor(username, password)) {
                 App.setNewScene("menuProveedor");
             } 
              else {
                 // Genera mensaje de notificacion
                 Alert alert = new Alert(Alert.AlertType.ERROR);
                 alert.setTitle("Mensaje de Login");
                 alert.setHeaderText("Informacion de credenciales registradas");
                 alert.setContentText("Las credenciales registradas no son correctas, "
                        + "intente nuevamente");
                 alert.show();

              }

    }
    
    @FXML
    private void clickBtnIniciar() throws IOException{
        App.setNewScene("menuObservador");
    }
    
    
    @FXML
    private void clickBtnRegistrar() throws IOException{
        App.setNewScene("registro");
    }

}
