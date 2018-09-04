package carpio.Unidad1;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JApplet;

public class PrácticaDelCuatroDeSeptiembre extends JApplet {
   ArrayList<Rectángulo>lista;
    

    
    public void init() {
        lista = new ArrayList(); //se asigna espacion a la variable cuando se va a ocupar
        FiguraCuadrada f= new FiguraCuadrada(50,60);
        Rectángulo r = new Rectángulo(1100,80,10,10);
        lista.add(r); 
        //lista.add(f);
                
    }
    
    public void paint(Graphics plumón){
        Rectángulo x=lista.get(0);
        plumón.drawRect(x.getX(),x.getY(), x.ancho, x.alto);
        
    }

    
}
class FiguraCuadrada{
   protected int ancho, alto;
   
   public FiguraCuadrada(int an, int al){
       ancho = an;
       alto  = al;
   }
    
}

class Rectángulo extends FiguraCuadrada{
    private int x,y;
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    //super es una llamada
    public Rectángulo(int an,int al,int x, int y){
        super(an,al);
        this.x =x;
        this.y =y;
        
        
    }
    
}
