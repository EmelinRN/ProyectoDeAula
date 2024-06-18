
package Persistencia;

import Entidades.*;
import java.util.ArrayList;
import java.util.List;


public class RegistroProveedor implements IfuncionUsuario  {
    private List<Proveedor> listaProveedores;
   

    public RegistroProveedor (){
        this.listaProveedores = new ArrayList();
    }

    public List<Proveedor> getListaProductos() {
        return listaProveedores;
    }

    public void setListaProductos(List<Proveedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }    

    @Override
    public Proveedor buscarProveedor(String usuario) {
        for(Proveedor p : this.listaProveedores){
           if(p.getUsuario() == usuario){
               return p;
            }
       }
       return null;
    }

    
    @Override
    public boolean eliminarProveedor(Proveedor p) {
        return this.listaProveedores.remove(p);
    }

    @Override
    public boolean agregarProveedor(Proveedor p) {
        return this.listaProveedores.add(p);
    }

    @Override
    public List<Proveedor> obtenerProveedores() {
        if(this.listaProveedores.isEmpty()){
            return null;
        }
        return this.listaProveedores;
    }

   
    
    
}
