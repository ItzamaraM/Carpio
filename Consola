/*
   Consola.java
   Jueves veinticinco de octubre de dosmil dieciocho
   (R) Tecnológico Nacional de México Campus León 
   ---------------------------------------------------
    
   Clase que implementa la interface para capturar y 
   mostrar Strings, utiliza entrada y salida estandar.

 */

package poo.segundoParcial;

/**
 *
 * @author José Gerardo Carpio Flores
 */

public class Consola implements Dispositivo{
    @Override
    public String input(String s){
        System.out.print(s + " >>> ");
        return new java.util.Scanner(System.in).nextLine();
    }
    
    @Override
    public void print(String s){
        if(s != null){
            String [] partes = s.split("\t");
            for (int j = 0; j < partes.length;  j+= 3) {
                System.out.println(partes[j] + "\t\t$" + partes[j+1]);
                System.out.println("      " + partes[j+2]);
            }
                
        }
    }  
}
