import javax.swing.ImageIcon;
  class Demo{
    ImageIcon x;
    
  public static void main(String[]y){
        Demo app = new Demo();
        
        app.x = new ImageIcon("src/Iron Maiden.gif");
        
        new javax.swing.JOptionPane().showMessageDialog(null, "eddie", "Iron Maiden", -1, app.x);
        
       }
       
  }
