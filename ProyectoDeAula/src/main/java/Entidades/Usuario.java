
package Entidades;


public class Usuario {
    
    private String usuario;
    private long cedula;
    
   

    public Usuario() {
    }

    public Usuario(String usuario, long cedula) {
        this.usuario = usuario;
        this.cedula = cedula;
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }
    
    

   
    



    
    
    
}

