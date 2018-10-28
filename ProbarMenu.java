package poo.segundoParcial;

public class ProbarMenu {
    Menu       rockStarBurger;
    Escritorio panel;
    Consola    consola;
    
    public ProbarMenu(){
        rockStarBurger = new Menu("Hamburguesas");
        panel          = new Escritorio();
        consola        = new Consola();
    }
    
    private void generarMenu(){
        rockStarBurger.agregarItem(new Item("Itzamara Burger"  , "Carne de res, queso chihuahua, piña, guacamole, lechuga y jitomate" , 95));
        rockStarBurger.agregarItem(new Item("RockStar Burger"  , "Carne de res, pajillas de cebolla, mayonesa, salsa BBQ, queso americano" , 55));
        rockStarBurger.agregarItem(new Item("Red Hot Burger"   , "Carne de res, spicy chipotle, jalapeño, queso pepper"                    , 50));
        rockStarBurger.agregarItem(new Item("Pink Floyd Burger", "Carne de res blackened, pimiento morrón, queso pepper, mayonesa chipotle", 50));
        rockStarBurger.agregarItem(new Item("Morrison Burger"  , "Carne de res, cebollas bravas, champiñones sazonados, queso suizo"       , 60));
        rockStarBurger.agregarItem(new Item("Green Day Burger" , "Carne de res con crujientes tiras de tocino, guacamole queso suizo"      , 50));
        rockStarBurger.agregarItem(new Item("Lennon Burger"    , "Carne de res, cebolla morada, pepinillos, queso americano, mayonesa BBQ" , 55));
        rockStarBurger.agregarItem(new Item("Beatle Burger"    , "Doble carne de res, tocino, cebolla morada y pepinillos, quesos americano y manchego", 65));
        rockStarBurger.agregarItem(new Item("Green Day Burger" , "Carne de res, cebollas bravas, champiñones sazonados, queso suizo"       , 50));
    }
    private void mostrarMenu(){
        String s = "";
    
        for(int i = 0; i < rockStarBurger.tamaño(); i++)
            s += (rockStarBurger.obtenerItem(i).getNombre() +
                    "\t" + rockStarBurger.obtenerItem(i).getPrecio() +
                    "\t" + 
                  rockStarBurger.obtenerItem(i).getDescripción() + "\t");
        panel.print(s);
        consola.print(s);
    }
    
    private void run(){
        generarMenu();
        mostrarMenu();
    }
    
    public static void main(String[] args) {
        new ProbarMenu().run();
        
    }
    
}
