
package Persistencia;

import Entidades.Producto;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ArchivoObjeto implements Ifuncion{
    
    private File archivo;
    private FileOutputStream aEscritura;
    private FileInputStream aLectura;
    
    public ArchivoObjeto(String name){
        this.archivo = new File(name);
    }
    
    public ArchivoObjeto(){
        this("Productos.obj");
    }
    
    public Ifuncion leer(){
        
         Ifuncion coleccionProductos = null;
        if(!this.archivo.exists()){
            return new RegistroProducto();
        }
        ObjectInputStream objeto = null;
        try {
            this.aLectura = new FileInputStream(this.archivo);
            objeto = new ObjectInputStream(this.aLectura);
            coleccionProductos = (Ifuncion)objeto.readObject();
            objeto.close();
            this.aLectura.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error al abrir o crear archivo de lectura");
        } catch (IOException ex) {
            System.out.println("Error al crear objeto de lectura");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al leer objeto");
        }
        
        return coleccionProductos;
    }
    
    
    private void guardar(Ifuncion coleccion){
        ObjectOutputStream oos = null;
        try {
            this.aEscritura = new FileOutputStream(this.archivo);
            oos = new ObjectOutputStream(this.aEscritura);
            oos.writeObject(coleccion);
            oos.close();
            this.aEscritura.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error al abrir o crear archivo de escritura");
        } catch (IOException ex) {
            System.out.println("Error al crear objeto de escritura");
        }
    }


    @Override
    public boolean eliminar(Producto a) {
        
        Ifuncion coleccionProductos = this.leer();
        coleccionProductos.eliminar(a);
        this.guardar(coleccionProductos);
        return true;
    }

    @Override
    public void Imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean agregarProducto(Producto producto) {
        
        Ifuncion coleccionProductos = this.leer();
        coleccionProductos.agregarProducto(producto);
        this.guardar(coleccionProductos);
        return true;
    }

    @Override
    public List<Producto> buscarProductosTipo(String tipo) {
        
        Ifuncion coleccionProductos = this.leer();
        return coleccionProductos.buscarProductosTipo(tipo);
        
    }

    @Override
    public Producto buscarProducto(long codigo) {
        
        Ifuncion coleccionProductos = this.leer();
        return coleccionProductos.buscarProducto(codigo);
        
    }

    @Override
    public List<Producto> obtenerProductos() {
        Ifuncion coleccionProductos = this.leer();
        return coleccionProductos.obtenerProductos();
    }
    
    
    
}
