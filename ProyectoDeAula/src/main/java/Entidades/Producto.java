
package Entidades;

import java.util.ArrayList;
import Persistencia.Ifuncion;



public class Producto  {
    
    private String tipo;
    private String nombre;
    private double precio;
    private long codigo;
    private Proveedor proveedor;
    private String descripcion;
   

    public Producto() {
        
    }

    public Producto(String nombre, String tipo, double precio, long codigo, Proveedor proveedor, String descripcion) {
        this.nombre = nombre.toUpperCase();
        this.tipo = tipo;
        this.precio = precio;
        this.codigo = codigo;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    
     public String getProveedor() {
        return proveedor.getUsuario();
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    
     public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    @Override
    public String toString() {
        return "Producto{" + "tipo=" + tipo + ", nombre=" + nombre + ", precio=" + precio + ", codigo=" + codigo + '}';
    }


   

        
    

     
    
    
    
    
    
    
}
