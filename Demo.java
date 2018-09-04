
package carpio.Unidad1;

public class Demo {

    
    public static void main(String[] args) {
        
        class Estudiante{
            String numControl;
            
            public void setNumControl(String nc){
                numControl = nc;
            }
        }
        class EstudianteISC extends Estudiante{
            public EstudianteISC(){
                numControl = "no asignado";
                
            }
        }
    }
    
}
