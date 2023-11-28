package masterEscuelaIT.java.modulo1.ContratoLimpiezaV3;

import masterEscuelaIT.java.modulo1.ContratoLimpiezaV3.utilMenu.ModelIterativeMenu;

public class App {
    public static void main(String[] args) {
        new App().run();
    }

    public void run (){
        Console.getInstance().writeln("BIENVENIDOS A LA GESTION DE CONTRATOS POR FECHAS");
        new ModelIterativeMenu(new ServicesContract(),new Empresa()).interact();
    }
}


