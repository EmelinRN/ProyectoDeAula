
package Entidades;

import java.util.ArrayList;
import java.util.List;
import Persistencia.Ifuncion;


public class Proveedor extends Usuario implements Ifuncion{
    
    private String contraseña;
    private String ubicacion;
    private ArrayList<Producto> catalogo;
    
    

    public Proveedor() {
        this.catalogo = new ArrayList();
       
    }


    public Proveedor( String nombre, long cedula, String contraseña, String ubicacion) {
        super(nombre, cedula);
        this.contraseña=contraseña;
        this.ubicacion=ubicacion;
        this.catalogo = new ArrayList();
        
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    

    @Override
    public boolean eliminar(Producto a) {
         return this.catalogo.remove(a);
    
    }

    @Override
    public void Imprimir(){
        System.out.println("Nombre   Precio   Proveedor   Ubicacion   \n");
        
        for(Producto cat: catalogo){
             System.out.println(cat.toString());
        }
    
}    
    
    @Override
    public boolean agregarProducto(Producto producto){
        if(catalogo.add(producto)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<Producto> buscarProductosTipo(String tipo) {
        List<Producto> lista = new ArrayList();
        for(Producto p: this.catalogo){
            if(p.getTipo() == tipo){
                lista.add(p);
            }
        }
        return lista;
    }

    @Override
    public Producto buscarProducto(long codigo) {
       for(Producto a: catalogo){
           if(a.getCodigo() == codigo){
               return a;
           }
       }
       return null;
    }
    
    @Override
    public List<Producto> obtenerProductos(){
        
        return this.catalogo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Producto> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Producto> catalogo) {
        this.catalogo = catalogo;
    }

    
    
    
    
}
    
    

    