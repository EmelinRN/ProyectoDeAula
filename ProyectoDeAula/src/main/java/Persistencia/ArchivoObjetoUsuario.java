
package Persistencia;

import Entidades.Producto;
import Entidades.Proveedor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;


public class ArchivoObjetoUsuario implements IfuncionUsuario {
    
    private File archivo;
    private FileOutputStream aEscritura;
    private FileInputStream aLectura;
    
    public ArchivoObjetoUsuario(String name){
        this.archivo = new File(name);
    }
    
    public ArchivoObjetoUsuario(){
        this("Proveedores.obj");
    }
    
    public IfuncionUsuario leer(){
        
         IfuncionUsuario coleccionUsuarios = null;
        if(!this.archivo.exists()){
            return new RegistroProveedor();
        }
        ObjectInputStream objeto = null;
        try {
            this.aLectura = new FileInputStream(this.archivo);
            objeto = new ObjectInputStream(this.aLectura);
            coleccionUsuarios = (IfuncionUsuario)objeto.readObject();
            objeto.close();
            this.aLectura.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error al abrir o crear archivo de lectura");
        } catch (IOException ex) {
            System.out.println("Error al crear objeto de lectura");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al leer objeto");
        }
        
        return coleccionUsuarios;
    }
    
    
    private void guardar(IfuncionUsuario coleccion){
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
    public Proveedor buscarProveedor(String usuario) {
        IfuncionUsuario coleccionProveedores = this.leer();
        return coleccionProveedores.buscarProveedor(usuario);
    }

    @Override
    public boolean eliminarProveedor(Proveedor p) {
        IfuncionUsuario coleccionProveedores = this.leer();
        coleccionProveedores.eliminarProveedor(p);
        this.guardar(coleccionProveedores);
        return true;
    }

    @Override
    public boolean agregarProveedor(Proveedor p) {IfuncionUsuario coleccionProveedores = this.leer();
        coleccionProveedores.agregarProveedor(p);
        this.guardar(coleccionProveedores);
        return true;
    }

    @Override
    public List<Proveedor> obtenerProveedores() {
       IfuncionUsuario coleccionProveedores = this.leer();
        return coleccionProveedores.obtenerProveedores();
    }
    
    
    
}
