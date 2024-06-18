
package Persistencia;

import Entidades.Producto;
import java.util.List;


public interface Ifuncion {
    
    List<Producto> obtenerProductos();
    boolean agregarProducto(Producto producto);
    void Imprimir();
    boolean eliminar(Producto a);
    Producto buscarProducto(long codigo);
    List<Producto> buscarProductosTipo(String tipo);
    
}
