
package tclab2;

public class friends {
    protected String nombre;

    public friends(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "friends{" + "nombre=" + nombre + '}';
    }
    
    
}
