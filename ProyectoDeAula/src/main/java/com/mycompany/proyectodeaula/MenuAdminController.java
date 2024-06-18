
package com.mycompany.proyectodeaula;


import Logica.Logica;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;

public class MenuAdminController implements Initializable {
    
    private Logica logica = new Logica();

    @FXML private StackPane panelTrabajo;
     private StackPane panelConsulta;
     private StackPane panelRegistro;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            this.panelRegistro = (StackPane) App.loadComponent("agregarProducto");
            this.panelRegistro.setVisible(false);
            this.panelConsulta = (StackPane) App.loadComponent("productoVista");
            this.panelConsulta.setVisible(false);

        } catch (IOException ioe) {

        }

    }

    @FXML
    private void clickBtnRegistrarP() throws IOException {
          this.panelTrabajo.getChildren().clear();
          this.panelTrabajo.getChildren().add(this.panelRegistro);
          this.panelRegistro.setVisible(true);

    }
    
    
    @FXML
    private void clickBtnConsultarC() throws IOException {
        this.panelTrabajo.getChildren().clear();
        this.panelConsulta = (StackPane) App.loadComponent("productoVista");
        this.panelTrabajo.getChildren().add(this.panelConsulta);
        this.panelConsulta.setVisible(true);

    }

}
    

