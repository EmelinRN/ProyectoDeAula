
package Entidades;


public class Admin extends Usuario {
    
    private int contraseña;

    public Admin() {
    }

    public Admin(String nombre, long cedula, int contraseña) {
        super(nombre, cedula);
        this.contraseña=contraseña;
    }

}