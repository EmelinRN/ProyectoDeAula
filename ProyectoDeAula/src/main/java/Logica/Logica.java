/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;


import Entidades.*;
import Persistencia.ArchivoObjeto;
import Persistencia.*;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Logica {
    
    private Ifuncion persistencia;
    
    
     public Logica() {
        this.persistencia = new ArchivoObjeto();
    }
     
     public Producto crearProducto (String nombre, String tipo, double precio, long codigo, Proveedor proveedor, String descripcion){
         
         return new Producto(nombre, tipo, precio, codigo, proveedor,  descripcion);
         
     }
    
     public boolean registrarProducto(Producto producto){
        
        return this.persistencia.agregarProducto(producto);
        
    }
     
      public Producto buscarProducto(int codigo){
        
        return this.persistencia.buscarProducto(codigo);
        
    }
      
      public List<Producto> getProductos(){
          
          return this.persistencia.obtenerProductos();
      }
      
      public boolean eliminarProducto (Producto producto){
          
          return this.persistencia.eliminar(producto);
          
      }
      
      
      
      
    
    
}
