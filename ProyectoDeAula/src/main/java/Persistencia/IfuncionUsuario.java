
package Persistencia;

import Entidades.Proveedor;
import java.util.List;


public interface IfuncionUsuario {
    
    Proveedor buscarProveedor(String usuario);
    boolean eliminarProveedor(Proveedor p);
    boolean agregarProveedor(Proveedor p);
    List<Proveedor> obtenerProveedores();
    
    
}
