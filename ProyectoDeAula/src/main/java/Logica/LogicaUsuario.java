
package Logica;

import Entidades.Proveedor;
import Persistencia.*;
import Persistencia.IfuncionUsuario;
import java.util.List;


public class LogicaUsuario {
    
    private final String USERADMIN1 = "LEON";
    private final String PASSWORDADMIN1 = "50";
    private final String USERADMIN2 = "RN";
    private final String PASSWORDADMIN2 = "20";
    private IfuncionUsuario persistencia;
    

    public LogicaUsuario() {
        this.persistencia = new ArchivoObjetoUsuario();
    }
    
    
    public boolean loginAdmin(String username, String password){
        // implementar logica para validacion de credenciales de ususario
        if(username.equals(USERADMIN1)&&password.equals(PASSWORDADMIN1)){
            return true;
        }
         else 
            if(username.equals(USERADMIN2)&&password.equals(PASSWORDADMIN2)){
                return true;
            }
        return false;
    }
    
    public boolean loginProveedor(String username, String password){
        if(this.obtenerProveedores() == null){
            return false;
        } else{
             List<Proveedor> proveedores = this.obtenerProveedores();
             for(Proveedor p:proveedores)
                  if(p.getContraseña().equals(password) && p.getUsuario().equals(username)){
                      return true;
                  }
        }        
        
        return false;        
    }
    
    Proveedor buscarProveedor(String usuario){
        return this.persistencia.buscarProveedor(usuario);
    }
    
    boolean eliminarProveedor(Proveedor p){
        return this.persistencia.eliminarProveedor(p);
    }
    
    boolean agregarProveedor(Proveedor p){
        return this.persistencia.agregarProveedor(p);
    }
    
    List<Proveedor> obtenerProveedores(){
        return this.persistencia.obtenerProveedores();
    }
    
    
    
}
