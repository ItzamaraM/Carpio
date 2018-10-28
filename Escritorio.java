/*
   Escritorio.java
   Jueves veinticinco de octubre de dosmil dieciocho
   (R) Tecnológico Nacional de México Campus León 
   --------------------------------------------------
    
   Clase que implementa la interface para capturar y 
   mostrar Strings, utiliza recursos de swing.
*/

package poo.segundoParcial;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author José Gerardo Carpio Flores
 */
public class Escritorio implements Dispositivo{
    @Override
    public String input(String s){
        return new javax.swing.JOptionPane().showInputDialog(s);
    }
    @Override
    public void print(String s){
        JLabel e [];
        
        if(s != null){
            String [] partes = s.split("\t");
            
            if(partes.length > 1){
                int tamaño = (partes.length/2+1);
                if(tamaño%2 == 1) tamaño++;
                e = new JLabel[tamaño];
                for (int i = 0, j = 0; i < e.length; i+=2, j+= 3) {
                    e[i] = new JLabel();
                    e[i].setText(partes[j] + " .......... $" + partes[j+1]);
                    e[i].setFont(new Font("Noteworthy", Font.BOLD, 18));
                    e[i].setForeground(Color.RED);
                    e[i+1] = new JLabel();
                    e[i+1].setText("      " + partes[j+2]);
                }
                
            }else{
                e = new JLabel[1];
                e[0].setText(s);
            }
            new javax.swing.JOptionPane().showMessageDialog(null, 
                    e, "Rock Star Station", -1, 
                    new ImageIcon("Rock Star"+ 
                                  ((int)(Math.random()*3)) + ".jpg"));
        }    
    }
}













