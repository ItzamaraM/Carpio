/*
   TestDispositivo.java
   Jueves veinticinco de octubre de dosmil dieciocho
   (R) Tecnológico Nacional de México Campus León 
   ---------------------------------------------------
    
   Clase de prueba de las dos interfaces implementadas
 */
package poo.segundoParcial;

/**
 *
 * @author José Gerardo Carpio Flores
 */
public class TestDispositivo {
    Dispositivo x;
    
    private void run(){
        switch((int)(Math.random() * 2)){
            case 0: x = new Consola(); break;
            case 1: x = new Escritorio(); break;
        }
        String a = x.input("Capture algo por favor");
        x.print("Usted capturó " + a);
    }
    
    public static void main(String[] args) {
        new TestDispositivo().run();
    }
}
