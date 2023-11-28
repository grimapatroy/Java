package masterEscuelaIT.java.modulo1.ContratoLimpiezaV2;

import masterEscuelaIT.java.modulo1.ContratoLimpiezaV2.utilMenu.ModelMenu;

public class App {
    public static void main(String[] args) {
        new App().run();
    }

    public void run (){
        Console.getInstance().writeln("BIENVENIDOS A LA GESTION DE CONTRATOS POR FECHAS");
        new ModelMenu(new ServicesContract(),new Empresa()).interact();
    }
}


