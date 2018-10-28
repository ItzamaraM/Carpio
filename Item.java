/*

*/
package poo.segundoParcial;

/**
 *
 * @author José Gerardo Carpio Flores
 */
public class Item {
    private String nombre;
    private String descripción;
    private float  precio;

    public Item(String nombre, String descripción, float precio) {
        this.nombre = nombre;
        this.descripción = descripción;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
