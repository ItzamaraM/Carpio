/*

*/
package poo.segundoParcial;

import java.util.ArrayList;

/**
 *
 * @author José Gerardo Carpio Flores
 */
public class Menu {
    private String nombre;
    ArrayList<Item> lista;
    
    public Menu(String nombre){
        this.nombre = nombre;
        lista = new ArrayList();
    }
    
    public void agregarItem(Item nuevo){
        lista.add(nuevo);
    }
    
    public Item obtenerItem(int n){
        if(n < lista.size())
            return lista.get(n);
        return null;
    }
    
    public int tamaño(){
        return lista.size();
    }
}
