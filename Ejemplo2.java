import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;

  class Saludador{
    private JLabel msg = new JLabel("HOLA");
    
    public void Saludar(){
      msg.setForeground(Color.RED);
      msg.setFont
      JOptionPane.showMessageDialog(null, msg);
    }
   
  class Prueba{
    public static void main(String[]x){
      Saludador y = new Saludador();
      y.saludar();
    }
 }
