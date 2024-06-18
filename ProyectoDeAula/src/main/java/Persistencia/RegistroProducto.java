
package Persistencia;

import Entidades.Producto;
import java.util.ArrayList;
import java.util.List;


public class RegistroProducto implements Ifuncion{   
    private List<Producto> listaProductos;
   

    public RegistroProducto() {
        this.listaProductos = new ArrayList();
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }


    @Override
    public List<Producto> buscarProductosTipo(String tipo) {
        List<Producto> lista = new ArrayList();
        for(Producto p: this.listaProductos){
            if(p.getTipo() == tipo){
                lista.add(p);
            }
        }
        return lista;
    }

    @Override
    public Producto buscarProducto(long codigo) {
       for(Producto p : this.listaProductos){
           if( p.getCodigo() == codigo){
               return p;
           }
       }
       return null;
              
    }
    

    @Override
    public boolean eliminar(Producto a) {
      return this.listaProductos.remove(a);
    }

    @Override
    public void Imprimir() {
        System.out.println("Nombre   Precio   Proveedor   Ubicacion   \n");
        
        for(Producto cat: listaProductos){
             System.out.println(cat.toString());
        }
    }

    @Override
    public boolean agregarProducto(Producto producto) {
        return listaProductos.add(producto);
    }
    
    @Override
    public List<Producto> obtenerProductos(){
        
        return this.listaProductos;
    }
    
    
    
    
}
