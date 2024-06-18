
package com.mycompany.proyectodeaula;

import Logica.Logica;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;

public class MenuObservadorController implements Initializable {
    
     private Logica logica = new Logica();
     
     @FXML private StackPane panelTrabajo;
     private StackPane panelConsulta;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         try{
            this.panelConsulta = (StackPane) App.loadComponent("productoVista");
            this.panelConsulta.setVisible(false);    
                       
        }
        catch(IOException ioe){
            
        }
        
    } 
    
     @FXML
    private void clickBtnOb() throws IOException {
        this.panelTrabajo.getChildren().clear();
        this.panelConsulta = (StackPane) App.loadComponent("productoVista");
        this.panelTrabajo.getChildren().add(this.panelConsulta);
        this.panelConsulta.setVisible(true);
        
    }
    
}
